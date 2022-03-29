package com.zhenyu.servlet;

import com.zhenyu.pojo.Person;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/4/30 16:33
 */
public class ServletSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        // 得到Session
        HttpSession session = req.getSession();

        // 向Session中存东西
        session.setAttribute("name",new Person("欧振宇",18));

        // 获取Session的ID
        String sessionId = session.getId();

        // 判断Session是不是新创建的
        if (session.isNew()) {
            resp.getWriter().write("session创建成功, ID:" + sessionId);
        } else {
            resp.getWriter().write("session在服务器中存在了,ID:" + sessionId);
        }

        // Session创建的时候做了什么事情
//        Cookie cookie = new Cookie("SESSION")
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
