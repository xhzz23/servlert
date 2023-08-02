package com.iweb.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 22:32
 * @WeChat xhzz211423
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dishes {
    private String did;
    private String dname;
    private BigDecimal price;
    private String caid;
    private String img;
}
