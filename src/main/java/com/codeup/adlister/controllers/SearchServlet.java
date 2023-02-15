package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "controllers.SearchServlet", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/search.jsp").forward(req, resp);
        String title = req.getParameter("title");
        ArrayList<Ad> ads = searchAds(title);
        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/WEB-INF/search.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        ArrayList<Ad> ads = searchAds(title);
        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/WEB-INF/search.jsp").forward(req, resp);
    }

    public static ArrayList<Ad> searchAds(String title) {
        ArrayList<Ad> ads = new ArrayList<>();
//        try  {
//
//        }
        System.out.println("title = " + title);
        return ads;
    }
}
