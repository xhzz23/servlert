package com.iweb.service;


import com.iweb.bean.User;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 23:05
 * @WeChat xhzz211423
 */


public interface UserService {
    User login(User user);
    boolean verifyUsername(String name);
    boolean addUser(User user);

}
