package com.shumujin.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.shumujin.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}