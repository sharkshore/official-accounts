package com.shark.mybatisboot.service;


import com.shark.mybatisboot.manager.help.RedisCacheHelper;
import com.shark.mybatisboot.web.BootApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
@Slf4j
public class RedisTest {

    @Autowired
    RedisCacheHelper redisCacheHelper;


    @Test
    public void test(){
        redisCacheHelper.insertObject("wy", "success");
    }

    @Test
    public void test2(){
        String wy = redisCacheHelper.queryString("wy");
        log.info(wy);
        log.info("{}",wy.length());
    }
}
