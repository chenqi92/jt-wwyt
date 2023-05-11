package com.lyc.wwyt.config.security.service;

import com.lyc.wwyt.entity.TUserEntity;
import com.lyc.wwyt.service.TUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * 类 CustomUserServiceImpl
 *
 * @author ChenQi
 * @date 2023/5/11
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CustomUserServiceImpl implements UserDetailsService {

    @Resource
    private TUserService tUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TUserEntity user = tUserService.findUserInfoByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("不存在的用户!");
        }
        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }
}
