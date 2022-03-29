package com.zhenyu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/4/30 15:19
 * 中文数据传递
 */
public class ServletCookieCH extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        // Cookie 服务器从客户端获取
        Cookie[] cookies = req.getCookies();

        PrintWriter out = resp.getWriter();

        // 判断cookie是否存在
        if (cookies != null) {
             out.write("上一次的访问时间 : ");

            for (Cookie cookie : cookies) {
                // 获取cookie的名字
                if (cookie.getName().equals("name")) {
                    // 解码
                    out.write(URLDecoder.decode(cookie.getValue(), "utf-8"));
                }

            }
        } else {
            out.write("这是您第一次访问本站");
        }
        //编码
        Cookie cookie = new Cookie("name", URLEncoder.encode("欧振宇","utf-8"));
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
