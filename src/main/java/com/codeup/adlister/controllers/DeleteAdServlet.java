package com.codeup.adlister.controllers;
import com.codeup.adlister.dao.DaoFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.DeleteAdServlet", urlPatterns = "/ads/delete")
public class DeleteAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
            return;
        }
        request.setAttribute("ad", DaoFactory.getAdsDao().searchAdId(Long.parseLong(request.getParameter("id"))));
        request.getRequestDispatcher("/WEB-INF/ads/delete.jsp")
                .forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long userDelete = Long.parseLong(request.getParameter("delete"));

        if (request.getParameter("delete") == null) {
            request.setAttribute("ads", DaoFactory.getAdsDao().all());
        } else {
            request.setAttribute("ads", DaoFactory.getAdsDao().deleteAd(userDelete));
        }
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}