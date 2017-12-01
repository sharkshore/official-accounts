package com.shark.mybatisboot.biz;

import com.shark.mybatisboot.dao.mapper.DemoMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by tuze on 2017/11/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoServiceTest {

    @Autowired
    DemoMapper demoMapper;

    @Test
    public void queryMemberName() throws Exception {
        log.info("{}", demoMapper.queryMemberName());
    }

    @Test
    public void querySqlModel() throws Exception {

    }

}