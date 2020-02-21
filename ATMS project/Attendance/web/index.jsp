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


		<div class="w3-container w3-card-4 form w3-mobile"  >
				<div class="w3-container w3-blue-gray w3-center">
  			
                                    <h2>REGISTER</h2>
  			
	</div>
				
				<form class="w3-container w3-mobile" action="Registration" method="post" name="Form" onsubmit="return validateForm()">
				  <p>
				  <label>Name</label>
				  <input class="w3-input" type="text" name="Name" id="a"></p>
				  <p>
				  <label>Phone Number</label>
				  <input class="w3-input" type="number" name="Contact" id="b"></p>
				  <p>
				  <label>Email</label>
				  <input class="w3-input" type="email" name="Email" id="c"></p>
				  <p>
				  <label>Password</label>
				  <input class="w3-input" type="password" name="Password" id="d"></p>
                                  <p>
                                      <label>Technology</label><br>
                                  <select name="Technology"  class="w3-input" id="e">
                                      <option>Select</option>
                                      <option value="JAVA">JAVA</option>
                                      <option value="DOTNET">DOTNET</option>
                                      <option value="TESTING">TESTING</option>
                                  </select>
				  <!--<input class="w3-input" type="list" name="Technology"></p>-->
                                  </p>
                                   <p>
				  <label>Location</label>
                                  <input class="w3-input" type="text" name="Location" id="f" pattern="[A-Za-z]+"></p>
				  <div class="w3-container btn w3-mobile">
				  <p>
				  <button class="w3-btn w3-blue-gray w3-round button w3-margin " name="register">Register</button></p>
				  </div>

				</form>
	
</div>

    <script>
function validateForm()
{
    var a=document.forms["Form"]["Name"].value;
    var b=document.forms["Form"]["Contact"].value;
    var c=document.forms["Form"]["Email"].value;
    var d=document.forms["Form"]["Password"].value;
    var e=document.forms["Form"]["Technology"].value;
    var f=document.forms["Form"]["Location"].value;
    
    if (a===null || a==="")

    {   
       alert("Please Fill Name Field");
        return false;
    }   
     
     if (c===null || c==="")

    {   
       alert("Please Fill Email Field");
        return false;
    }   
     if (d===null || d==="")

    {   
       alert("Please Fill Password Field");
        return false;
    }   
     if (f===null || f==="")

    {   
       alert("Please Fill Location Field");
        return false;
    }   
    if (b===null || b==="")

    {   
       alert("Please Fill Contact Field");
        return false;
    }   
    if(b.length ===10){
//        alert("Enter the proper contact number");
        return true;
    }
    else
    {
        alert("Enter 10 digit number ");
        return false;
    }
    
}  
       
    

    </script>
</body>

</html>