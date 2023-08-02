package com.iweb.DAO.impl;


import com.iweb.DAO.UserDAO;
import com.iweb.bean.User;
import com.iweb.util.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 22:55
 * @WeChat xhzz211423
 */


public class UserDAOImpl implements UserDAO {
    QueryRunner qr=new QueryRunner(DruidUtil.getDataSource());
    @Override
    public User login(User user) {
        String sql = "select * from user where username=? and password=?";
        try {
            user = qr.query(sql, new BeanHandler<>(User.class), user.getUsername(), user.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean verifyUsername(String username) {
        String sql = "select count(*) from user where username=?";
        try {
            Number number = (Number) qr.query(sql, new ScalarHandler<>(), username);
            return number.intValue() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        String sql = "insert into user values(?,?,?)";

        try {
            int result = qr.update(sql, user.getUid(), user.getUsername(), user.getPassword());
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
