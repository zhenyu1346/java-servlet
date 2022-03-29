package com.zhenyu.servlet;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/4/24 21:31
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getInitParameterNames(); // 获取初始化参数
        //this.getServletConfig(); //获取servlet配置

        // 获取上下文
        ServletContext context = this.getServletContext();
        String userName = "欧振宇";
        // 将一个数据保存在ServletContext中
        context.setAttribute("username",userName);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().print(userName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
