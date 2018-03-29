package com.qiongxun.officialaccounts.web.controller;

import com.github.pagehelper.PageHelper;
import com.qiongxun.officialaccounts.common.model.JsrGroup;
import com.qiongxun.officialaccounts.dal.model.Demo;
import com.qiongxun.officialaccounts.web.model.PageParams;
import com.qiongxun.officialaccounts.service.DemoService;
import com.qiongxun.officialaccounts.web.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by tuze on 2017/8/23.
 */
@RestController
@Slf4j
@Api(value = "/", description = "Demo测试", consumes= MediaType.APPLICATION_JSON_VALUE)
public class DemoController {

    @Autowired
    public DemoService demoService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        log.info("hello,springboot");
        return "hello,world";
    }

    @ApiOperation(value = "获取demo实体",notes = "必须传入实体,获得一个集合",response = Demo.class,responseContainer = "List")
    @RequestMapping(value = "/demo",method = {RequestMethod.POST},consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Demo> demo(@RequestBody Demo demo){
        log.info("hello,springboot");
        List<Demo> demoList = new ArrayList<>();
        Demo demo1 = new Demo("小兔",22,"很帅的");
        demoList.add(demo);
        demoList.add(demo1);
        return demoList;
    }


    @ApiOperation(value = "插入demo", notes = "插入demo", response = Result.class)
    @RequestMapping(value = "/insert", method = {RequestMethod.POST},consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Demo> insert(@Validated({JsrGroup.Add.class}) @RequestBody Demo demo) {
        log.info("{}", demo);
        Result<Demo> result = new Result<>(demo);
        return result;
    }

    @ApiOperation(value = "测试用户姓名", notes = "Multiple status values can be provided with comma seperated strings", response = String.class, responseContainer = "List")
    @RequestMapping(value = "/testparam",method = RequestMethod.GET)
    public String testparam( @ApiParam(value = "用户姓名", required = true)  @RequestParam String name){
        log.info(name);
        return "hello,param";
    }

    /**
     * 分页查询
     * http://localhost:9000/mybatisboot/queryMemberName?pageNum=2&pageSize=2
     * @param pageParams
     * @return
     */
    @RequestMapping(value = "/queryMemberName",method = RequestMethod.GET)
    public List<String> queryMemberName(PageParams pageParams){
        log.info("查询...");
        log.debug("这是一个debug日志");
        //Mybatis
//        PageHelper.startPage(2, 2);
        PageHelper.startPage(pageParams);
        List<String> strings = demoService.queryMemberName();
        return strings;
    }


    @RequestMapping(value = "/querySqlModel",method = RequestMethod.GET)
    public List<Map<String, Object>> querySqlModel(){
        log.debug("这是一个querySqlModel");
        return demoService.querySqlModel();
    }

}
