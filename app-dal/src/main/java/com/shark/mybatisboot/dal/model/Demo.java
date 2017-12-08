package com.shark.mybatisboot.dal.model;

import com.shark.mybatisboot.common.model.JsrGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * Created by tuze on 2017/8/24.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(value = "简单Demo")
public class Demo {

    @ApiModelProperty(value = "姓名")
    @NotNull(message = "姓名不能为空", groups = {JsrGroup.Add.class})
    private String name;

    @ApiModelProperty(value = "年龄")
    @NotNull(message = "年龄不能为空", groups = {JsrGroup.Add.class})
    private Integer age;

    @ApiModelProperty(value = "内容")
    private String content;

}
