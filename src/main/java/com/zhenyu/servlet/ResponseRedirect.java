package com.zhenyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/4/26 21:18
 * response重定向
 * 一个web资源B收到客户端A请求后, B会通知A客户端取访问另外一个web资源C , 这个过程为重定向
 */
public class ResponseRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 处理请求
        String userName = req.getParameter("username");
        String passWord = req.getParameter("password");
        System.out.println(userName + " , " + passWord);

        //访问该页面重定向到/image页面
        //resp.sendRedirect("/servlet_demo/image");

        // 通过请求转发
        resp.setCharacterEncoding("utf-8");
        req.getRequestDispatcher("/success.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
