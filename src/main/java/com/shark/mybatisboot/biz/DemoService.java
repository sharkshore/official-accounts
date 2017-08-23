package com.shark.mybatisboot.biz;

import com.shark.mybatisboot.dao.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tuze on 2017/8/23.
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<String> queryMemberName(){
        return demoMapper.queryMemberName();
    }
}
