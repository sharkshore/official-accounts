package com.shark.mybatisboot.controller;

import com.shark.mybatisboot.biz.DemoService;
import com.shark.mybatisboot.domain.model.Demo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by tuze on 2017/8/23.
 */
@RestController
@Slf4j
@Api(value = "/", description = "Demo测试", consumes="application/json")
public class DemoController {

    @Autowired
    public DemoService demoService;

    @RequestMapping("/hello")
    public String hello(){
        log.info("hello,springboot");
        return "hello,world";
    }


    @ApiOperation(value = "获取demo实体",notes = "必须传入实体,获得一个集合",response = Demo.class,responseContainer = "List")
    @RequestMapping(value = "/demo",method = {RequestMethod.POST})
    public List<Demo> demo(Demo demo){
        log.info("hello,springboot");
        List<Demo> demoList = new ArrayList<>();
        Demo demo1 = new Demo("小兔",22,"很帅的");
        demoList.add(demo);
        demoList.add(demo1);
        return demoList;
    }

    @ApiOperation(value = "测试用户姓名",
    notes = "Multiple status values can be provided with comma seperated strings",
    response = String.class,
    responseContainer = "List")
    @RequestMapping("/testparam")
    public String testparam( @ApiParam(value = "用户姓名", required = true)  @RequestParam String name){
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
