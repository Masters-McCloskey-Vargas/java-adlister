//package com.codeup.adlister.controllers;
//import com.codeup.adlister.dao.DaoFactory;
//import com.codeup.adlister.models.Ad;
//import com.codeup.adlister.models.User;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "controllers.DeleteServlet", urlPatterns = "/ads/delete")
//public class DeleteServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("/WEB-INF/ads/delete.jsp").forward(req, resp);
//        String title = req.getParameter("title");
////        req.setAttribute("ads", ads);
//        req.getRequestDispatcher("/WEB-INF/ads/delete.jsp").forward(req, resp);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        User user = (User) request.getSession().getAttribute("user");
//        Ad ad = DaoFactory.getAdsDao().getAdById(Long.parseLong(request.getParameter("adId")));
//        if (user.getId() == ad.getUserId()) {
//            DaoFactory.getAdsDao().deleteAd(ad.getId());
//        }
//        response.sendRedirect("/profile");
//    }
//
//    public Ad deleteAd();
//}
