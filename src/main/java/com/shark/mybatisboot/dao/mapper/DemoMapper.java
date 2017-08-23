package com.shark.mybatisboot.dao.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tuze on 2017/8/23.
 */
public interface DemoMapper {
    List<String> queryMemberName();
}
