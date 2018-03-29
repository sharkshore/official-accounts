package com.qiongxun.officialaccounts.web;

import com.qiongxun.officialaccounts.dal.dao.DemoDao;
import com.qiongxun.officialaccounts.dal.model.Demo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

    @Autowired
	DemoDao demoDao;

    @Autowired
    @Qualifier("appleDemo")
	Demo demo;

	@Test
	public void contextLoads() {
		List<Map<String, Object>> maps = demoDao.querySqlModel();
		log.info(String.valueOf(maps));
	}

	@Test
	public void testBean(){
		log.info("{}", demo);
	}

}
