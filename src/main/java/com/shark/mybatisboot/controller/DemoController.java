package com.shark.mybatisboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuze on 2017/8/23.
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello,world";
    }
}
