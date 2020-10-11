package com.cs.servlet;

import com.cs.entity.Keyword;
import com.cs.service.impl.KeywordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "KeywordServlet", urlPatterns = "/KeywordServlet")
public class KeywordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        KeywordServiceImpl ksi = new KeywordServiceImpl();
        String comm = request.getParameter("comm");
        System.out.println("aaaa");
        if (comm.equals("list")) {
            try {
                List<Keyword> list = ksi.findKeywordInfoAll();

                if (list.size()>0||list!=null){
                    System.out.println("333");
                    request.setAttribute("lists", list);
                    request.getRequestDispatcher("list.jsp").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
