package com.shark.mybatisboot.controller;

import com.shark.mybatisboot.biz.DemoService;
import com.shark.mybatisboot.biz.IDemoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by tuze on 2017/12/4.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(DemoController.class)
@Slf4j
public class DemoControllerWebMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DemoService demoService;

    @Before
    public void setup(){
    }

    @Test
    public void hello() throws Exception {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        when(demoService.queryMemberName()).thenReturn(list);
        mockMvc.perform(get("/hello").contentType(MediaType.ALL))
                .andDo(print())
                .andExpect(status().isOk());

    }

}
