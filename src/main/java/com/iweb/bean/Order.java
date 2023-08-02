package com.iweb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 22:36
 * @WeChat xhzz211423
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String oid;
    private String tid;
    private String dname;
    private int num;
    private int total;
    private int person;
    private BigDecimal sumPrice;
    private String state;
}
