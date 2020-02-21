<%-- 
    Document   : task
    Created on : Oct 13, 2018, 12:14:35 PM
    Author     : SAYED
--%>
<%@ include file="Style.jsp" %> 
<%@page import="java.sql.ResultSet"%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        
        <div class="w3-container" main >
            
        <div class="w3-container w3-card-4 form"  >
				<div class="w3-container w3-blue-gray w3-center">
  			
                                    <h2>Task</h2>
                                </div>
        <%
          ResultSet r = (ResultSet)session.getAttribute("view")  ;
          
while(r.next())
{
    // out.print(r.getString(1));     
          
        %>
        
            <div>
                <table class="w3-table">
                                        
                                        <tr>
                                            <td class="w3-left"><%=r.getString(1)%></td>
                                            <td class="w3-right"><%=r.getString(2)%></td>
                                        </tr>
                                        
                                        
                                        
                                    </table>

                                <%
                                    }
                                    %>
            </div>                       
            </div>
        </div>
       
    </body>
</html>
