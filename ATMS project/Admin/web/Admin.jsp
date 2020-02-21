<%-- 
    Document   : Admin
    Created on : 10 Oct, 2018, 4:43:32 PM
    Author     : bilal
--%>

<%@ include file="Style.jsp" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTER</title>
	
	<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
    <body>
<!--        <form method="Post" action="ViewStudents">
            <input type="text" placeholder="Admin Name" name="admin">
            <input type="text" placeholder="Admin Password" name="pass">
            <input type="submit" value="submit">
            
            
        </form>-->
    
    <div class="w3-container w3-card-4 form w3-border-teal w3-border"  >
				<div class="w3-container w3-blue-gray w3-center">
  			
                                    <h2>Admin Login</h2>
  			
	</div>
				
				<form class="w3-container w3-mobile" action="ViewStudents" method="post">
				  <p>
				  <label>Admin</label>
                                  <input class="w3-input" type="text"  name="admin"></p>
				  <p>
				  <label>Password</label>
				  <input class="w3-input" type="password" name="pass"></p>
				  <div class="w3-container btn">
				  <p>
				  <button class="w3-btn w3-blue-gray w3-round w3-mobile button w3-margin" name="login">Login</button></p>
				  </div>
                                  <br>

				</form>
	
</div>   
    </body>
</html>
