package com.zhenyu.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author 欧振宇
 * @version 1.0
 * @date 2021/4/25 22:10
 * response下载文件
 */
public class ServletDownLoadFile extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 要获取下载文件的路径
        String realPath = "F:\\Project\\JavaProject\\java-servlet\\target\\classes\\2048559.jpg";
        System.out.println("下载的文件路径: " + realPath);
        // 2. 下载的文件名是什么
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        // 3. 设置想办法让浏览器能够支持(Content-Disposition)下载我们需要的文件
        resp.setHeader("Content-Disposition","attachment;filename" + URLEncoder.encode(fileName,"UTF-8"));
        // 4. 获取下载文件的输入流
        FileInputStream inputStream = new FileInputStream(realPath);
        // 5. 创建缓冲区
        int size = 0;
        byte[] buffer = new byte[2048];
        // 6. 获取OutputStream对象
        ServletOutputStream outputStream = resp.getOutputStream();
        // 7. 将FileOutputStream流写入到buffer缓冲区 , 使用OutputStream将缓冲区的数据输出到客户端
        while ((size = inputStream.read(buffer)) > 0 ) {
            outputStream.write(buffer,0,size);
        }
        inputStream.close();
        outputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
