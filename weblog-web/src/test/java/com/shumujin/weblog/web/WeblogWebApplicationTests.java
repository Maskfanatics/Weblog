package com.shumujin.weblog.web;

import com.shumujin.weblog.common.domain.dos.UserDO;
import com.shumujin.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testLog() {
        log.info("这是一行 Info 级别日志");
        log.warn("这是一行 Warn 级别日志");
        log.error("这是一行 Error 级别日志");

        // 占位符
        String author = "smj";
        log.info("这是一行带有占位符日志，作者：{}", author);
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void testInsert() {
        UserDO userDO = UserDO.builder()
                .username("shumujin1")
                .password("123")
                .createTime(new Date())
                .updateTime(new Date())
                .isDeleted(false)
                .build();
        userMapper.insert(userDO);
    }
}
