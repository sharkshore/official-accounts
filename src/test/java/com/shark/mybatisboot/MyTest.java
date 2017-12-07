package com.shark.mybatisboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 普通测试,不会启动SpringBoot容器
 * Created by tuze on 2017/12/5.
 */
@RunWith(SpringRunner.class)
@Slf4j
public class MyTest {

    @Test
    public void test(){
        log.info("{}", "hello,world");
    }
}
