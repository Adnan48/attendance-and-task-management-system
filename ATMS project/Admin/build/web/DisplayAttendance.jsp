 <%@page import="java.sql.ResultSetMetaData"%>
<%-- 
    Document   : DisplayAttendance
    Created on : Oct 16, 2018, 3:21:06 PM
    Author     : SAYED
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <!--<th>Email</th>-->
                <!--<th>Joining Date</th>-->
        <form>
            <table class="w3-table">
                <tr>  
                    <th>Name</th>
                    <th>EMAIL</th>
                    <th>JOINING DATE</th>    
                </tr>

            
            <%
            ResultSet r =(ResultSet)session.getAttribute("attendance"); 
               //HttpSession session2=request.getSession();                
          
            ResultSetMetaData rs =(ResultSetMetaData)session.getAttribute("MetaData"); 
             System.out.println(rs);
            int count = rs.getColumnCount();
            out.println(count);
                while(r.next())   
                {
                    String s=r.getString(3);
                    String [] split=s.split("-",0);
                    int day= Integer.parseInt(split[0]);
                    
             %>
            
             <tr>
                <td><input type="text" name="name" value="<%=r.getString(1)%>"></td>
                <td><input type="text" name="email" value="<%=r.getString(2)%>"></td>
                <td><input type="text" name="name" value="<%=r.getString(3)%>"></td>
             </tr>
            </table> 
             
             <br>
             <br>
             
             <table class="w3-table">
                 <tr>
               
                 
                 <%  
                     for (int z=day+3;z<=count;z++){

                  %>
           
                 <td><%=rs.getColumnName(z)%></td>
                 
                 <%
                 }%>
                 
                          
                </tr>
            <tr>
                 
             <% 
             
                 for(int i =day+3;i<=count;i++){
                     
                 
             %>
              
             <td><input type="text" name="name" class="w3-border-0" size="1" value="<%=r.getString(i)%>"></td>
            
             <%
             }
              %>
              
             </tr>
              <%  }
                %>
            </table>
        </form>
    </body>
</html>
