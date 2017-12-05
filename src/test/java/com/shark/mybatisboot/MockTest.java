package com.shark.mybatisboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shark.mybatisboot.domain.model.Demo;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by tuze on 2017/12/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MockTest {


    @Test
    public void mockList() {
        List mockList = mock(List.class);
        mockList.add("one");
        mockList.clear();
        verify(mockList).add("one");
        verify(mockList).clear();
    }

    @Test
    public void mockList2() {

        //You can mock concrete classes, not just interfaces
        LinkedList mockedList = mock(LinkedList.class);

        //stubbing
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());

        //following prints "first"
        System.out.println(mockedList.get(0));

        //following throws runtime exception
//        System.out.println(mockedList.get(1));

        //following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));

        //Although it is possible to verify a stubbed invocation, usually it's just redundant
        //If your code cares what get(0) returns, then something else breaks (often even before verify() gets executed).
        //If your code doesn't care what get(0) returns, then it should not be stubbed. Not convinced? See here.
        verify(mockedList).get(9);

    }


    @Test
    public void jsonass() throws JSONException {
        JSONAssert.assertEquals("{ \"name\" : \"Black\", \"content\" : \"BMW\",\"age\":22 }", "{ \"name\" : \"Black\", \"content\" : \"BMW\",\"age\":23 }", false);
    }

    @Test
    public void jsonAssert() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Demo demo = new Demo("shark", 22, "还不错");
        objectMapper.writeValue(new File("target/shark.json"), demo);

    }


    @Test
    public void jsonAssertString() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Demo demo = new Demo("shark", 22, "还不错");
        String demoString = objectMapper.writeValueAsString(demo);
        log.info(demoString);
        byte[] bytes = objectMapper.writeValueAsBytes(demo);
    }

    @Test
    public void string2Json() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{ \"name\" : \"Black\", \"content\" : \"BMW\",\"age\":22 }";
        Demo demo = objectMapper.readValue(json, Demo.class);
        log.info("{}", demo);

    }


}
