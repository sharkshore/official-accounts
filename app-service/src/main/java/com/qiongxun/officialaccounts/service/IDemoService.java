package com.qiongxun.officialaccounts.service;

import java.util.List;
import java.util.Map;

/**
 * Created by tuze on 2017/12/4.
 */
public interface IDemoService {

    List<String> queryMemberName();

    List<Map<String, Object>> querySqlModel();

}
