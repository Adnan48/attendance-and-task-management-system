/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author SAYED
 */
@WebServlet(urlPatterns = {"/Registration"})
public class Registration extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Registration at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
    PrintWriter out = response.getWriter();
    String s1 = request.getParameter("Name");
    String s2 = request.getParameter("Contact");
    String s3 = request.getParameter("Email");
    String s4 = request.getParameter("Password");
    String s5 = request.getParameter("Technology");
    String s6 = request.getParameter("Location");
    String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance","root","7821");
        PreparedStatement p1 =  c.prepareStatement("insert into users (Name,Contact,Email,Password,JoiningDate,Technology,Location)value(?,?,?,?,?,?,?)");
        p1.setString(1,s1);
        p1.setString(2,s2);
        p1.setString(3,s3);
        p1.setString(4,s4);
        p1.setString(5,date);
        p1.setString(6,s5);
        p1.setString(7,s6);
        int a = p1.executeUpdate(); 
        if(a>0)
        {
        PreparedStatement p3 =  c.prepareStatement("insert into attendance (S_Name,email,JoiningDate)value(?,?,?)");
        p3.setString(1,s1);
        p3.setString(2,s3);
        p3.setString(3,date);
        p3.executeUpdate();
        PreparedStatement p4 =  c.prepareStatement("insert into task (Name,Email,Task,Assigndate,CompleteDate)value(?,?,'Not yet Assigned','0000-00-00','0000-00-00')");
        p4.setString(1,s1);
        p4.setString(2,s3);
        p4.executeUpdate();
        response.sendRedirect("Login.jsp");
        }
    }
    catch(Exception ex){
       out.println("This Email has be already registered");
       out.print("Please use diffrent email-id");
        
    }
    
    
    
    }
}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */

