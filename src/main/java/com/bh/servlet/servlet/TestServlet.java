package com.bh.servlet.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "TestServlet",urlPatterns = "/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name1 = req.getParameter("name");
        System.out.println(name1);

        //ServletContext getServletContext()：用来获取 ServletContext 对象
        ServletContext context = this.getServletContext();
        context.setAttribute("name","王文婷");
        Object name = context.getAttribute("name");
        System.out.println(name);

        //重定向
        resp.sendRedirect("/login.jsp");
    }
}
