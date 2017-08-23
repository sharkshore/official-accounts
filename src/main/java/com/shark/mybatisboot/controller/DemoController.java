package com.shark.mybatisboot.controller;

import com.shark.mybatisboot.biz.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
        log.debug("这是一个debug日志");
        List<String> strings = demoService.queryMemberName();
        return strings;
    }


    @RequestMapping("/querySqlModel")
    public List<Map<String, Object>> querySqlModel(){
        log.debug("这是一个querySqlModel");
        return demoService.querySqlModel();
    }

}
