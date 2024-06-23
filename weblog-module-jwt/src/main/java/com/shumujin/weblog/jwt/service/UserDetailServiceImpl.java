package com.shumujin.weblog.jwt.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 从数据库中查询
        // ...

        // 暂时先写死，密码为 quanxiaoha, 这里填写的密文，数据库中也是存储此种格式
        // authorities 用于指定角色，这里写死为 ADMIN 管理员
        return User.withUsername("shumujin")
                .password("$2a$10$lPRslDvoHfuTn0NIkM2b6eHE6pckCm6ShBR2kADcWVZVmsGDeF67m")
                .authorities("ADMIN")
                .build();
    }
}
