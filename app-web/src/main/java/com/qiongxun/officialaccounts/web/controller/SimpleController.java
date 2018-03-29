package com.qiongxun.officialaccounts.web.controller;

import com.qiongxun.officialaccounts.service.SimpleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tuze on 2017/12/7.
 */
@RestController
@Slf4j
@Api(value = "/", description = "Simple测试", consumes="application/x-www-form-urlencoded")
public class SimpleController {

    @Autowired
    private SimpleService simpleService;

    @RequestMapping(value = "/simple",method = RequestMethod.GET)
    public String hello(){
        log.info(simpleService.getName());
        return simpleService.getName();
    }


    @RequestMapping(value = "/simplehello",method = RequestMethod.GET)
    public String simplehello(){
        return "simple,hello";
    }

}
