package com.iweb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 22:31
 * @WeChat xhzz211423
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cashier {
    private String cid;
    private String cname;
    private String money;
}
