<%-- 
    Document   : DisplayEach
    Created on : 15 Oct, 2018, 11:17:03 AM
    Author     : bilal
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
            
        <style>
            .div
            {
                margin-top: 80px;
                margin-left: auto;
                margin-right: auto;
                width: 950px;
                height: auto;
                border: 16px;
                
            }
            
        </style>
        
    </head>
    <body>
        <%

            ResultSet rs =(ResultSet)session.getAttribute("result");
           
       %>
        
        <div class="w3-container w3-card-4 div w3-border w3-panel w3-border-teal w3-hover-border-blue w3-mobile">
                <form action="Grade" method="Post">
                    <table class="w3-table">
                        <tr >
                                <th> Id </th>
                                <th> Name </th>
                                <th> Contact </th>
                                <th> Email </th>
                                <th> Password   </th>
                                <th> JoiningDate </th>
                                <th> Technology   </th>
                                <th> Location  </th>
                                
                        </tr>
        
         <%while(rs.next()){
         %>
            <tr>
            
            <td class="design"><%=rs.getString(1)%></td>
            <td class="design"><%=rs.getString(2)%></td>
            <td class="design"><%=rs.getString(3)%></td>
            <td class="design"><%=rs.getString(4)%></td>
            <td class="design"><%=rs.getString(5)%></td>
            <td class="design"><%=rs.getString(6)%></td>
            <td class="design"><%=rs.getString(7)%></td>
            <td class="design"><%=rs.getString(8)%></td>
            
            
            
            
            <% }
            %>
            </tr>
                    </table>
            
            
                 </form>
        </div>
           

        
        
    </body>
</html>
