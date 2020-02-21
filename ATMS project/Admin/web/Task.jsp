<%-- 
    Document   : Task
    Created on : Oct 16, 2018, 3:53:07 PM
    Author     : SAYED
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <title>JSP Page</title>
        
        <style>
            .div
            {
                margin-top: 80px;
                margin-left: auto;
                margin-right: auto;
                width: 1000px;
                height: auto;
                border: 16px;
                
            }
            
            .btn
            {
                margin-left: 300px;
            }
        </style>
        
        
    </head>
    <body>
       
        <%
            
            String s1 = request.getParameter("name");
            String s2 = request.getParameter("email");
            
//           %>
             
             
             
             <div class="w3-container w3-card-4 div w3-border w3-panel w3-border-teal w3-hover-border-blue w3-mobile">
                
                <div class="w3-container w3-blue-gray w3-center">
  			
                                    <h2>Task</h2>
                </div>
             
             
                    <form action="Grade" method="post" class="w3-form">
 
                        <br>
                        <p>
                            <label class="w3-large">
                                ASSIGN TASK:
                            </label>
                        </p>
                       
                        <textarea row="60" cols="100" name="task"></textarea>
                        <br>
                        
                        <div class="btn">
                            <p>
                                <button class="w3-btn w3-blue-gray w3-round w3-mobile button w3-margin" input="submit" name="submit" style="float:left" value="AssignTask">AssignTask</button></p>
                            <!--<button class="w3-btn w3-blue-gray w3-round w3-mobile button w3-margin" input="submit" name="submit" value="CompleteTask">CompleteTask</button></p>-->
                        </div>	  
                
          
                            <!--<input type="submit"  name="submit" value="AssignTask">-->
                            <!--<input type="submit" name="submit" value="CompleteTask">-->
            
                                <input type="hidden" name="name" value="<%=s1%>">
                                <input type="hidden" name="email" value="<%=s2%>">
        
                    </form>
                                
             </div>
        <% 
           // }
        %>
        
    </body>
</html>
