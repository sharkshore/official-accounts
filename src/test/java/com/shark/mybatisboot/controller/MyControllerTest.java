package com.shark.mybatisboot.controller;

import com.shark.mybatisboot.biz.DemoService;
import com.shark.mybatisboot.domain.model.Demo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by tuze on 2017/12/4.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(DemoController.class)
@Slf4j
public class MyControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private DemoService demoService;

    @Test
    public void test() {
        Assert.assertNotNull(new Demo());

    }
}
