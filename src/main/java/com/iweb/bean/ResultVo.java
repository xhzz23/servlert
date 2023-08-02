package com.iweb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 23:08
 * @WeChat xhzz211423
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo<T> {
    private boolean isOk;//操作是否成功
    private String mess;//返回消息
    private T t;//返回的数据
}
