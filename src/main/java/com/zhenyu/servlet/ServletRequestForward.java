package com.zhenyu.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/4/24 23:49
 * 资源请求转发 getRequestDispatcher方法
 * 请求转发后, 路径不会变 , 重定向路径会变化
 */
public class ServletRequestForward extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        // 转发的请求路径
        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/get_param");
        // 调用forward方法实现请求转发
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
