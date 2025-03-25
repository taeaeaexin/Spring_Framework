package tomcat.tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet의 url이 겹치면 안된다
//html 코드가 길어지면, 자바 코드안에 html이 존재하므로 복잡, 가독성, 유지보수 등등 어렵다
//html과 jsp를 분리

@WebServlet("/html")
public class HtmlServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Get Request");
        response.getWriter().append("<html><body><h1>Get Request</h1></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Post Request");
        response.getWriter().append("<html><body><h1>Post Request</h1></html>");
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Put Request");
        response.getWriter().append("<html><body><h1>Put Request</h1></html>");
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Delete Request");
        response.getWriter().append("<html><body><h1>Delete Request</h1></html>");
    }
}