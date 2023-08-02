package com.iweb.controller;


import cn.hutool.json.JSONUtil;
import com.iweb.bean.ResultVo;
import com.iweb.bean.User;
import com.iweb.service.UserService;
import com.iweb.service.impl.UserServiceImpl;
import com.iweb.util.FormBeanUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 小火煮粥
 * @date 2023/7/31 18:25
 * @WeChat xhzz211423
 */

@WebServlet("/user")
public class UserServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();

@Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = req.getParameter("data");
        User user = JSONUtil.toBean(data, User.class);
        ResultVo vo = new ResultVo();
        if (userService.login(user) != null) {
            vo.setOk(true);
            vo.setMess("登录成功");
        } else {
            vo.setOk(false);
            vo.setMess("登录失败");
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write(JSONUtil.toJsonStr(vo));
    }
}
