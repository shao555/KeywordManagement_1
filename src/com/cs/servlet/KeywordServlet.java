package com.cs.servlet;

import com.cs.entity.Keyword;
import com.cs.service.impl.KeywordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "KeywordServlet", urlPatterns = "/KeywordServlet")
public class KeywordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        KeywordServiceImpl ksi = new KeywordServiceImpl();
        String comm = request.getParameter("comm");
//        System.out.println(comm);
        if ("list".equals(comm)) {
            try {
                List<Keyword> list = ksi.findKeywordInfoAll();
                if (list != null) {
//                    System.out.println(comm);
                    request.setAttribute("lists", list);
                    request.getRequestDispatcher("list.jsp").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if ("提交".equals(comm)) {
            String name =request.getParameter("name");

            String type = request.getParameter("type");
            String createDate = request.getParameter("createdate");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = sdf.parse(createDate);
                Keyword keyword = new Keyword();
                keyword.setName(name);
                keyword.setType(type);
                keyword.setCreateDate(date);
                if (ksi.addKeyword(keyword)) {
                    request.getRequestDispatcher("/KeywordServlet?comm=list").forward(request, response);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if ("del".equals(comm)) {
            String id = request.getParameter("id");
            int ids = Integer.parseInt(id);
            try {
                if (ksi.delKeyword(ids)) {
                    request.getRequestDispatcher("/KeywordServlet?comm=list").forward(request, response);
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
