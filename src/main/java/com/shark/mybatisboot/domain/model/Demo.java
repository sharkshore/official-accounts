package com.shark.mybatisboot.domain.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by tuze on 2017/8/24.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(value = "简单Demo")
public class Demo {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private int age;

    @ApiModelProperty(value = "内容")
    private String content;

}
