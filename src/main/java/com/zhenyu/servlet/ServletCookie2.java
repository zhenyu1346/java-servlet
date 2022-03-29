package com.zhenyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/4/30 15:14
 * 删除cookie
 */
public class ServletCookie2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建一个cookie, 名字必须要和删除的名字一样
        Cookie cookie = new Cookie("lastLoginTime",System.currentTimeMillis() + "");

        // 将cookie有效期设置为0 , 原cookie立即过期
        cookie.setMaxAge(0);

        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
