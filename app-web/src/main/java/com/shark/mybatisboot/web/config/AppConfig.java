package com.shark.mybatisboot.web.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by tuze on 2017/12/7.
 */
@EnableScheduling
@ServletComponentScan
@MapperScan("com.shark.mybatisboot.dao.mapper")
@Configuration
public class AppConfig {

}
