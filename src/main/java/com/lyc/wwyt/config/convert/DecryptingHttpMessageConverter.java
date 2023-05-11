package com.lyc.wwyt.config.convert;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.Map;

/**
 * 类 DecryptingHttpMessageConverter
 *
 * @author ChenQi
 * @date 2023/5/11
 */
public class DecryptingHttpMessageConverter extends MappingJackson2HttpMessageConverter {
    private static final String KEY = "JTXCLYWWYTSJJKWD";
    private static final String INITIALIZATION_VECTOR = "JTXCLYWWYTSJJKWD";

    private final ObjectMapper objectMapper;

    public DecryptingHttpMessageConverter(ObjectMapper objectMapper) {
        super(objectMapper);
        this.objectMapper = objectMapper;
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
        Map<String, Object> decryptedMap = objectMapper.readValue(decryptedDatas, new TypeReference<Map<String, Object>>() {
        });
        map.putAll(decryptedMap);
        map.remove("datas");
        String decryptedBody = objectMapper.writeValueAsString(map);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decryptedBody.getBytes());
        HttpHeaders headers = inputMessage.getHeaders();
        return super.readInternal(javaType.getRawClass(), new HttpInputMessage() {
            @Override
            public InputStream getBody() {
                return byteArrayInputStream;
            }

            @Override
            public HttpHeaders getHeaders() {
                return headers;
            }
        });
    }

    private String decrypt(String encrypted) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec key = new SecretKeySpec(KEY.getBytes(StandardCharsets.UTF_8), "AES");
            IvParameterSpec iv = new IvParameterSpec(INITIALIZATION_VECTOR.getBytes(StandardCharsets.UTF_8));
            cipher.init(Cipher.DECRYPT_MODE, key, iv);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encrypted));
            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new DecryptException("请核对加密方式是否正确！");
        }
    }
}
