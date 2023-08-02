package com.iweb.controller;


import cn.hutool.json.JSONUtil;
import com.iweb.bean.ResultVo;
import com.iweb.bean.User;
import com.iweb.service.UserService;
import com.iweb.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author 小火煮粥
 * @date 2023/8/2 11:00
 * @WeChat xhzz211423
 */

@WebServlet("/judge")
public class Judge extends HttpServlet {
    private UserService userService=new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = req.getParameter("data");
        User user = JSONUtil.toBean(data, User.class);

        boolean isRegister = userService.verifyUsername(user.getUsername());
        ResultVo vo = new ResultVo();
        if (isRegister) {
            vo.setOk(false);
            vo.setMess("笨比不会注册");
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write(JSONUtil.toJsonStr(vo));
    }
}
