package com.shark.mybatisboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuze on 2017/8/23.
 */
@RestController
@Slf4j
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        log.info("hello");
        return "hello,world";
    }

}
