package com.shark.mybatisboot.controller;

import com.shark.mybatisboot.biz.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by tuze on 2017/12/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
@Slf4j
public class DemoControllerTest {

    @Autowired
    private MockMvc mvc;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void hello() throws Exception {
/*        List<String> list=new ArrayList<>();
        list.add("shark");
        list.add("shore");
        when(demoService.queryMemberName()).thenReturn(list);*/
/*        this.mockMvc.perform(get("/queryMemberName").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"));*/

    }

    @Test
    public void hello2() throws Exception {
        String forObject = this.restTemplate.getForObject("http://localhost:" + port + "/mybatisboot/hello", String.class);
        assertTrue(forObject.contains("hello,world"));
    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void testparam() throws Exception {

    }

    @Test
    public void queryMemberName() throws Exception {

    }

    @Test
    public void querySqlModel() throws Exception {

    }

}