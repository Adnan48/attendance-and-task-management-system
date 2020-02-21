<%-- 
    Document   : Task
    Created on : 10 Oct, 2018, 5:05:23 PM
    Author     : bilal
--%>

<%@page import="java.sql.ResultSet"%>


<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>JSP Page</title>
        <style>
            .div
            {
                margin-top: 30px;
                margin-left: auto;
                margin-right: auto;
                width: 800px;
                height: auto;
                border: 16px;
                
            }
            
        </style>
    </head>
    <body>
       <%

            ResultSet rs=(ResultSet)session.getAttribute("name");
           
       %>
       <div class="w3-container w3-card-4 div w3-border w3-panel w3-border-teal w3-hover-border-blue w3-mobile">
           <form action="" method="post" name="Form" class="w3-mobile">
                <table class="w3-table w3-mobile w3-large">     
                    <tr>
                        <th>NAME</th>
                        <th>DETAILS</th>
                        <th>RECORDS</th>
                        <th>ASSIGN TASK</th>
                        <th>TASK STATUS</th>
                    </tr>
        
         <%  
            while(rs.next())
            {
                String a = rs.getString(1);
                String b = rs.getString(3);
                System.out.println(b);
                %>
                <tr>
                    <td><input type="text" class="w3-border-0 input w3-large " size="6" name="name" value="<%=a%>"></td>
                                                                                                                                                       
                    <td><a href="DisplayEach?name=<%=a%>" class="w3-hover w3-hover-opacity w3-large">Details</a></td>
                    <td><a href="DisplayAttendance?name=<%=a%>" class="w3-hover w3-hover-opacity w3-large">Attendance</a></td>
                    <td><a href="Task?name=<%=a%>&email=<%=b%>" class="w3-hover w3-hover-opacity w3-large">Assign-Task</a></td>
                    <td><a href="Viewall?name=<%=a%>&email=<%=b%>" class="w3-hover w3-hover-opacity w3-large">View-Task</a></td>
                
                    <%
                        }
                     %>
            
                </tr>
                </table>
               </form>
                     </div>
      
            
    </body>
</html>
 