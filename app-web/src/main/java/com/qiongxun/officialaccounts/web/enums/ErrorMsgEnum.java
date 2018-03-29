package com.qiongxun.officialaccounts.web.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by tuze on 2017/11/24.
 */
@Getter
@AllArgsConstructor
public enum ErrorMsgEnum {

    E0001("0001","系统错误"),
    E0002("0002","您没有登陆"),
    E0003("0003","您没有权限"),
    E0004("0004","同一个商户不能使用2个相同的决策代码"),
    E0005("0005","参数错误"),
    ;

    /** code */
    private String code;
    /** 描述 */
    private String msg;

}
