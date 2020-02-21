/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bilal
 */
@WebServlet(urlPatterns = {"/DisplayEach"})
public class DisplayEach extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet DisplayEach</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet DisplayEach java at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    
    PrintWriter out = response.getWriter();
//           out.println(s1);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response); 
        String s1= request.getParameter("name");
            //String s2= request.getParameter("");
            System.out.println(s1);
     
            PrintWriter out = response.getWriter();
            
//            String s1= request.getParameter("name");
            //String s2= request.getParameter("");
            System.out.println(s1);
            out.println(s1);
            //PrintWriter out = response.getWriter();
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance","root","7821");
                PreparedStatement pre=c.prepareStatement("select * from users Where Name= ?");
             
                pre.setString(1,s1);
                
                System.out.println(s1);
                ResultSet rs=pre.executeQuery();
                
                
                PreparedStatement p = c.prepareStatement("Select * from attendance where S_Name = ?");
                p.setString(1, s1);
                
                ResultSet r = p.executeQuery();
                

                    System.out.println("done");
                HttpSession session=request.getSession();
                session.setAttribute("result",rs);
                HttpSession session1=request.getSession();                
                session.setAttribute("attendance",r);
                response.sendRedirect("DisplayEach.jsp");
                }
//            } 
            
            
            catch (Exception e) {
                System.out.println(e);
            }
    
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
