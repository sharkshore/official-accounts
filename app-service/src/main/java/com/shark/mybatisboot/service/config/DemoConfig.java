package com.shark.mybatisboot.service.config;

import com.shark.mybatisboot.dal.model.Index;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tuze on 2017/8/24.
 */
@Configuration
public class DemoConfig {


    @Bean("appleDemo")
    public Index.Demo getDemo(){
        Index.Demo demo = new Index.Demo();
        demo.setAge(33);
        demo.setContent("美国新闻");
        demo.setName("news");
        return demo;
    }
}
