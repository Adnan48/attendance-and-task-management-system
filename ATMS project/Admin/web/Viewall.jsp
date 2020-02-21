<%-- 
    Document   : task
    Created on : Oct 13, 2018, 12:14:35 PM
    Author     : Bilal Zaveri
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
        
         <script>
                
                function enable()
                {
                    if(document.form1.check.checked)
                    {
                        document.form1.fname.disabled=false;
                        document.form1.grade.disabled=false;
                    }
                    if(!document.form1.check.checked)
                    {
                        document.form1.fname.disabled=true;
                        document.form1.grade.disabled=true;
                    }
                    for(var a=0; a<100; a++)
                    {
                        if(document.form1.check[a].checked)
                        {
                            document.form1.fname[a].disabled=false;
                            document.form1.grade[a].disabled=false;
                        }
                        if(!document.form1.check[a].checked)
                        {
                            document.form1.fname[a].disabled=true;
                            document.form1.grade[a].disabled=true;
                        }
                    }
 
                }
//                function Myfunction(){
//                    if(Chechkbox.checked==true)
//                        document.getElementId(date.disabled);
//                }
                </script>
        
    </head>
    <body>
       
      
        <form name="form1" action="CompleteTask" method="post" class="main w3-container w3-card-4 div w3-border w3-panel w3-border-teal w3-hover-border-blue w3-mobile">
        <div class="w3-container" >
            
        <div class="w3-container"  >
				<div class="w3-container w3-blue-gray w3-center">
  			
                                    <h2>Task</h2>
                                </div>
            
        <%
          ResultSet r = (ResultSet)session.getAttribute("viewall")  ;
          
while(r.next())
{
    // out.print(r.getString(1));   
    int i=0;  
          
        %>
        
            <div>
                <table class="w3-table">
                                        
                                        <tr>
                                            
                                            <td>
                                                <!--<input type="checkbox" id="box" name="Checkbox" onclick="Myfunction()">-->
                                                    <input  type="checkbox" name="check" onclick="enable()" id="check">
                                            
                                            </td>
                                        
                                        
                                            
                                                
                                                        <%--<%=r.getString(1)%>--%>
                                            <td>
                                                <textarea name="fname" rows="3" cols="25"  disabled><%=r.getString(1)%></textarea>
                                            </td>
                                            
                                        
                                            
                                            
                                            <td>
                                                
                                                        <%=r.getString(2)%>
                                                  
                                            </td>
                                        
                                                        
                                                    
                                            <td>
                                                  
                                                        <%=r.getString(3)%>
                                                        
                                            </td>
                                        
                                                        
                                        
                                
                                                
                                            <td>
                                                <input type="text" name="grade" value="<%=r.getString(4)%>" disabled>
                                            </td>
                                                 

                                        </tr>
                                        
                                        
                                        
                                    </table>

                                <%
                                    }
                                    %>
            </div>      
            
            <div class="w3-container button">
                <p>
                    <button class="w3-btn w3-blue-gray w3-round w3-mobile button w3-margin" name="CompleteTask">Complete Task</button>
                </p>
            </div>
            <br>
            <!--<input type="submit" name="dddd" value="CompleteTask">-->                 
            </div>
            <br>
            <br>
        </div>
           
      </form> 
       
    </body>
</html>
