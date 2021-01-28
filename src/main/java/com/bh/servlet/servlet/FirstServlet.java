package com.bh.servlet.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//标记servlet，定义访问url
@WebServlet(name = "FirstServlet",urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //HttpServletRequest 方法：
        //String getParameter(String paramName)：获取指定请求参数的值；
        //response.getWriter().println(request.getParameter("str"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //void setCharacterEncoding(String encoding)：用来设置字符响应流的编码
        //response.setCharacterEncoding("GBK");
        //PrintWriter getWriter()：获取字符响应流，使用该流可以向客户端输出响应信息。
        /*response.getWriter().println("<h1>hello</h1>");
        response.getWriter().println("<h1>今天是星期二...</h1>");
        System.out.println("今天是星期二...");*/

        //在 Servlet 中获取 ServletContext 对象   void init(ServletConfig config)
       /* ServletContext servletContext = this.getServletContext();
        //void setAttribute(String name, Object value)：用来存储一个对象，也可以称之为存储一个域属性
        servletContext.setAttribute("1","hello");
        System.out.println(servletContext.getAttribute("1"));*/


        /**
         * Servlet跳转到jsp页面的几种方法
         * 1.sendRedirect方式
         * 2.forward方式
         */
        //客户端跳转
        //response.sendRedirect("hello"); //如果配置了前后缀就用hello
        response.sendRedirect("hello.jsp"); //重定向  //不在jsp底下

        //属于发生在服务器端的内部跳转。
        //request.getRequestDispatcher("/hello.jsp").forward(request,response); //转发
    }
}
