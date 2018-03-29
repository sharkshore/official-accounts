package com.qiongxun.officialaccounts.service;

import com.qiongxun.officialaccounts.web.BootApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by tuze on 2017/12/20.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
@Slf4j
public class DemoServiceTest {

    @Autowired
    DemoService demoService;

    @Test
    public void queryMemberName() throws Exception {
        List<String> strings = demoService.queryMemberName();
        log.info("{}", strings);
    }

    @Test
    public void querySqlModel() throws Exception {
        List<Map<String, Object>> maps = demoService.querySqlModel();
        log.info("{}", maps);
    }

}