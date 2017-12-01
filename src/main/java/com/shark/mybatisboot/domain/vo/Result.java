package com.shark.mybatisboot.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(value = "返回结果")
public class Result<T> {
//    private static final long serialVersionUID = 8350327877975282483L;

    @ApiModelProperty(value = "操作是否成功")
    private boolean success;
    @ApiModelProperty(value = "返回的具体值")
    private T data;
    @ApiModelProperty(value = "错误码")
    private String errorCode;
    @ApiModelProperty(value = "错误信息")
    private String errorMsg;
    @ApiModelProperty(value = "时间戳")
    private long timeInMillis;


    public Result() {
    }

    public Result(T data) {
        this.success = true;
        this.data = data;
        this.timeInMillis = System.currentTimeMillis();
    }

    public Result(String errorCode, String errorMsg) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.timeInMillis = System.currentTimeMillis();
    }

    public Result(String errorCode, String errorMsg, T data) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
        this.timeInMillis = System.currentTimeMillis();
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T result) {
        this.success = true;
        this.data = result;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public void setTimeInMillis(long timeInMillis) {
        this.timeInMillis = timeInMillis;
    }

    public void setErrorCode(String errorCode) {
        this.success = false;
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setErrorResult(String errorCode, String errorMsg) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
