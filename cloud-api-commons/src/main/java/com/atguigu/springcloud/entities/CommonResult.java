package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 该实体类视为了在向前端页面返回
 * 数据时,统一规定
 * @param <T>
 */
@Data
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(){

    }
}
