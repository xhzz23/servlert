package com.iweb.DAO;


import com.iweb.bean.Dishes;
import com.iweb.bean.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

/**
 * @Author 小火煮粥
 * @date 2023/8/1 22:38
 * @WeChat xhzz211423
 */


public interface UserDAO {
    User login(User user);
    boolean verifyUsername(String username);
    boolean addUser(User user);
}
