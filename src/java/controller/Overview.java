/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ArticleDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;

/**
 *
 * @author ThangCoi
 */
public class Overview extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String pageIndex_raw = request.getParameter("index");
            if (pageIndex_raw == null) {
                pageIndex_raw = "1";
            }
            int pageIndex = Integer.parseInt(pageIndex_raw);
            request.setAttribute("currentPage", pageIndex);

            ArticleDAO adb = new ArticleDAO();

            String minDate = new SimpleDateFormat("MMMM YYYY").format(adb.mindate());
            request.setAttribute("mindate", minDate.toUpperCase());
            String maxDate = new SimpleDateFormat("YYYY MMMM").format(adb.maxdate());
            request.setAttribute("maxdate", maxDate.toUpperCase());
            int pageSize = 4;
            int total = adb.getTotalCount();
            int maxPage;

             if (total % pageSize != 0) {
                maxPage = total / pageSize + 1;
            } else {
                maxPage = total / pageSize;
            }

            if (pageIndex > 0 && pageIndex <= maxPage) {
                request.setAttribute("maxpage", maxPage);
                ArrayList<Article> list = adb.pagging(pageIndex, pageSize);
                request.setAttribute("pagging", list);
                request.getRequestDispatcher("/html/overview.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/html/error.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher("/html/error.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
