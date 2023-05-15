package com.lyc.wwyt.config.convert;

import cn.allbs.common.enums.ErrorCodeEnum;
import cn.allbs.common.utils.StringUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.lyc.wwyt.config.properties.CustomConfigProperties;
import com.lyc.wwyt.exception.DecryptException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StreamUtils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * 类 DecryptingHttpMessageConverter
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public class DecryptingHttpMessageConverter extends MappingJackson2HttpMessageConverter {
    private final CustomConfigProperties customConfigProperties;

    private final ObjectMapper objectMapper;

    public DecryptingHttpMessageConverter(ObjectMapper objectMapper, CustomConfigProperties customConfigProperties) {
        super(objectMapper);
        this.objectMapper = objectMapper;
        this.customConfigProperties = customConfigProperties;
        setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
    }

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return true;
    }

    @Override
    public Object read(Type type, Class<?> clazz, HttpInputMessage inputMessage) throws IOException {
        JavaType javaType = this.getJavaType(type, clazz);
        String body = StreamUtils.copyToString(inputMessage.getBody(), StandardCharsets.UTF_8);
        Map<String, Object> map = objectMapper.readValue(body, new TypeReference<Map<String, Object>>() {
        });
        String encryptedDatas = (String) map.get("datas");
        String decryptedDatas = decrypt(encryptedDatas);
        String decryptedBody;
        if (List.class.isAssignableFrom(javaType.getRawClass())) {
            List<Map<String, Object>> decryptedList = objectMapper.readValue(decryptedDatas, new TypeReference<List<Map<String, Object>>>() {
            });
            decryptedBody = objectMapper.writeValueAsString(decryptedList);
        } else {
            Map<String, Object> decryptedMap = objectMapper.readValue(decryptedDatas, new TypeReference<Map<String, Object>>() {
            });
            map.putAll(decryptedMap);
            map.remove("datas");
            decryptedBody = objectMapper.writeValueAsString(map);
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decryptedBody.getBytes());
        HttpHeaders headers = inputMessage.getHeaders();
        Object res;
        try {
            res = this.objectMapper.readValue(byteArrayInputStream, javaType);
        } catch (InvalidFormatException e) {
            String fieldName = e.getPath().get(1).getFieldName();
            throw new DecryptException(StringUtil.format(ErrorCodeEnum.TYPE_MISMATCH_EXCEPTION_RESPONSE.getMsg(), "字段:", fieldName));
        } catch (Exception e) {
            throw new DecryptException("消息体解密失败!");
        }
        return res;
    }

    private String decrypt(String encrypted) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec key = new SecretKeySpec(customConfigProperties.getAesKey().getBytes(StandardCharsets.UTF_8), "AES");
            IvParameterSpec iv = new IvParameterSpec(customConfigProperties.getInitializationVector().getBytes(StandardCharsets.UTF_8));
            cipher.init(Cipher.DECRYPT_MODE, key, iv);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encrypted));
            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new DecryptException();
        }
    }
}
