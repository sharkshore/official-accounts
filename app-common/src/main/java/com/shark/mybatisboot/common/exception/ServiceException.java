package com.shark.mybatisboot.common.exception;

import lombok.Getter;

/**
 * 自定义业务处理异常
 * user:zyd.
 * date:2017/8/28.
 * time:14:45.
 * version:1.0.0.
 */
public class ServiceException extends RuntimeException {
    @Getter
    private String code;

    @Getter
    private String resMessage;

    public ServiceException(String code) {
        this.code = code;
    }

    public ServiceException(String code, Throwable throwable) {
        super(throwable);
        this.code = code;
    }

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
        this.resMessage = message;
    }

    public ServiceException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
        this.resMessage = message;
    }
}
