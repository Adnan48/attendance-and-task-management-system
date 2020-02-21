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
import java.time.LocalDate;
import java.util.Scanner;
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
@WebServlet(urlPatterns = {"/Grade"})
public class Grade extends HttpServlet {

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
//            
//            
//            
//            
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Grade</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Grade at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        
//        HttpSession session2 = request.getSession();
//        String s6 =(String) session2.getAttribute("abc");
//        processRequest(request, response);
           String s1=request.getParameter("submit");
           String s2=request.getParameter("task");
           String s3=request.getParameter("name");
           String s4=request.getParameter("email");
           
            LocalDate now = LocalDate.now();
           out.println(s1+s2+s3+s4);
           
           
           
           System.out.println(s1+s2+s3+s4);
           
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance","root","7821");
//            
            if(s1.equals("AssignTask")){
            PreparedStatement pre =c.prepareStatement("INSERT INTO task (Name,Email,Task,Assigndate,CompleteDate) values(?,?,?,curdate(),curdate())");
            pre.setString(1, s3);
            pre.setString(2, s4);
            pre.setString(3, s2);
            pre.executeUpdate();
            }
//           if(s1.equals("CompleteTask")){
//            PreparedStatement pre =c.prepareStatement("Update task set CompleteDate=curdate() where name =?");
//            pre.setString(1,s3);
//            pre.executeUpdate();
//            
//            String datediff= "select Assigndate from task where name =?";
//                PreparedStatement pr=c.prepareStatement(datediff);
//                pr.setString(1,s3);
//            ResultSet r1=pr.executeQuery();
            
//            while(r1.next())
            
//            String Assigndate=r1.getString(1);
            
               
//              Days diffInDays = Days.daysBetween(Assigndate, CompleteDate);
                
             
              
            
             
            }             
        
            catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
////        processRequest(request, response);
//          
//    }
}
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}}
