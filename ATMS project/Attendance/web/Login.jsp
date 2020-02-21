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
<!--        <form action="login" method="Post" >
            
            <input type="text" name="Email" placeholder="Email"><br>
            <input type="password" name="Password"placeholder="Password"><br>
            <input type="submit" value="submit">
        </form>-->

         <div class="w3-container w3-card-4 form"  >
				<div class="w3-container w3-blue-gray w3-center">
  			
                                    <h2>Login</h2>
  			
	</div>
				
				<form class="w3-container" action="login" method="post">
				  <p>
				  <label>Email</label>
				  <input class="w3-input" type="email" name="Email"></p>
				  <p>
				  <label>Password</label>
				  <input class="w3-input" type="password" name="Password"></p>
				  <div class="w3-container btn">
				  <p>
				  <button class="w3-btn w3-blue-gray w3-round button w3-margin" name="login">Login</button></p>
				  </div>
                                  <br>

				</form>
	
</div>   


    </body>
</html>
