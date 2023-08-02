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
import java.io.IOException;

/**
 * @Author 小火煮粥
 * @date 2023/8/2 12:41
 * @WeChat xhzz211423
 */

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
   private UserService userService=new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = req.getParameter("data");
        User user = JSONUtil.toBean(data, User.class);
        boolean addOK = userService.addUser(user);
        ResultVo resultVo = new ResultVo();
        if(addOK){
            resultVo.setOk(true);
            resultVo.setMess("注册成功^_^!!!");
        }
        resp.getWriter().write(JSONUtil.toJsonStr(resultVo));
    }
}
