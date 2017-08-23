package com.shark.mybatisboot.controller;

import com.shark.mybatisboot.biz.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tuze on 2017/8/23.
 */
@RestController
@Slf4j
public class DemoController {

    @Autowired
    public DemoService demoService;

    @RequestMapping("/hello")
    public String hello(){
        log.info("hello,springboot");
        return "hello,world";
    }

    @RequestMapping("/testparam")
    public String testparam(@RequestParam String name){
        log.info(name);
        return "hello,param";
    }

    @RequestMapping("/queryMemberName")
    public List<String> queryMemberName(){
        log.info("查询...");
        List<String> strings = demoService.queryMemberName();
        return strings;
    }

}
