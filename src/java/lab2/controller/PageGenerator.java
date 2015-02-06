/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tyler
 */
public class PageGenerator extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
            out.println("<head>");
            out.println("<title>Class 2 Lab</title>");
            out.println("<style>");
            out.println("table, td {margin:20px; padding:3px; border-color:orange; color:black;}");
            out.println("table {display:inline-table;}");
            out.println("th {background-color:#FFCC66;}");
            out.println("h2 {text-decoration: underline; text-align: center; letter-spacing:3px;}");
            out.println("#mainDiv{border:1px solid black; padding:25px; border-radius:10px;}");
            out.println("</style>");
            out.println("</head>");
            
            out.println("<body>");
            out.println("<h2>Practice webpage with \"out.println();\" statements</h2>");
            //Start of main container DIV
            out.println("<div id=\"mainDiv\">");
            
            //TABLE #1 - MULTIPLICATION BY SINGLE COUNT
            out.println("<div class=\"tableDivs\">");
            out.println("<table border=1>");
//            out.println("<h3>Single count </h3>");
            out.println("<tr><th colspan=\"5\">•Multiplication Table•</th></tr>");
            for (int r = 1; r <= 5; r++) {
                out.println("<tr>");
                for (int c = 1; c <= 5; c++) {
                    int val = r * c;
                    out.println("<td>");
                    if (val < 10) {
                        out.println("&nbsp&nbsp&nbsp" + val);
                    } else if (val <= 25) {
                        out.println("&nbsp" + val);
                    }
                    out.println("</td>");
                }
                out.println("</tr");
            }
            out.println("</table>");
             //End of single count table div
            out.println("</div>");
            
            //TABLE #2 - MULTIPLICATION BY EVEN COUNT
            out.println("<div class=\"tableDivs\">");
            out.println("<table border=1>");
//            out.println("<h3>Even Count</h3>");
            out.println("<tr><th colspan=\"5\">•Multiplication Table•</th></tr>");
            for (int r = 1; r <= 5; r++) {
                out.println("<tr>");
                for (int c = 1; c <= 5; c++) {
                    int val = r * c;
                    out.println("<td>");
                    if (val < 10) {
                        out.println("&nbsp&nbsp&nbsp" + val);
                    } else if (val <= 25) {
                        out.println("&nbsp" + val);
                    }
                    out.println("</td>");
                }
                out.println("</tr");
            }
            out.println("</table>");
             //End of EVEN count table div
            out.println("</div>");
            
             //TABLE #2 - MULTIPLICATION BY ODD COUNT
            out.println("<div class=\"tableDivs\">");
            out.println("<table border=1>");
//            out.println("<h3>Odd Count</h3>");
            out.println("<tr><th colspan=\"5\">•Multiplication Table•</th></tr>");
            for (int r = 1; r <= 5; r++) {
                out.println("<tr>");
                for (int c = 1; c <= 5; c++) {
                    int val = r * c;
                    out.println("<td>");
                    if (val < 10) {
                        out.println("&nbsp&nbsp&nbsp" + val);
                    } else if (val <= 25) {
                        out.println("&nbsp" + val);
                    }
                    out.println("</td>");
                }
                out.println("</tr");
            }
            out.println("</table>");
            //End of ODD count table div
            out.println("</div>");
            
            //End of main container DIV
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

// <editor-fold defaultstate="clapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
