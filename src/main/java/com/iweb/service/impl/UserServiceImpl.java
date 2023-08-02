package com.iweb.service.impl;


import com.iweb.DAO.UserDAO;
import com.iweb.DAO.impl.UserDAOImpl;
import com.iweb.bean.User;
import com.iweb.service.UserService;
import com.iweb.util.MD5Util;
import com.iweb.util.UUIDUtil;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 23:07
 * @WeChat xhzz211423
 */


public class UserServiceImpl implements UserService {
    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public User login(User user) {
        user.setPassword(MD5Util.getMD5(user.getPassword()));
        return userDAO.login(user);
    }

    @Override
    public boolean verifyUsername(String name) {
        return userDAO.verifyUsername(name);
    }

    @Override
    public boolean addUser(User user) {
        if (userDAO.verifyUsername(user.getUsername())) {
            return false;
        } else {
            user.setUid(UUIDUtil.uuid());
            user.setPassword(MD5Util.getMD5(user.getPassword()));
            return userDAO.addUser(user);
        }
    }
}
