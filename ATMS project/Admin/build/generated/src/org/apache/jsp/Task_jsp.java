package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Task_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .div\n");
      out.write("            {\n");
      out.write("                margin-top: 80px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                width: 1000px;\n");
      out.write("                height: auto;\n");
      out.write("                border: 16px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .btn\n");
      out.write("            {\n");
      out.write("                margin-left: 300px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");

            ResultSet rs =(ResultSet)session.getAttribute("task");    
             
                if(rs.next())
                {
                    String s1 = rs.getString(2);
                  System.out.println(rs.getString(4));
//                  HttpSession session2 = request.getSession();
//                  
//                  session2.setAttribute("abc", s1);
             
      out.write("\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             <div class=\"w3-container w3-card-4 div w3-border w3-panel w3-border-teal w3-hover-border-blue w3-mobile\">\n");
      out.write("                \n");
      out.write("                <div class=\"w3-container w3-blue-gray w3-center\">\n");
      out.write("  \t\t\t\n");
      out.write("                                    <h2>Task</h2>\n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("             \n");
      out.write("                    <form action=\"Grade\" method=\"post\" class=\"w3-form\">\n");
      out.write(" \n");
      out.write("                        <br>\n");
      out.write("                        <p>\n");
      out.write("                            <label class=\"w3-large\">\n");
      out.write("                                ASSIGN TASK:\n");
      out.write("                            </label>\n");
      out.write("                        </p>\n");
      out.write("                       \n");
      out.write("                        <textarea row=\"60\" cols=\"100\" name=\"task\"></textarea>\n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("                        <div class=\"btn\">\n");
      out.write("                            <p>\n");
      out.write("                                <button class=\"w3-btn w3-blue-gray w3-round w3-mobile button w3-margin\" input=\"submit\" name=\"submit\" style=\"float:left\">AssignTask</button></p>\n");
      out.write("                                <button class=\"w3-btn w3-blue-gray w3-round w3-mobile button w3-margin\" input=\"submit\" name=\"submit\">CompleteTask</button></p>\n");
      out.write("                        </div>\t  \n");
      out.write("                \n");
      out.write("          \n");
      out.write("                            <!--<input type=\"submit\"  name=\"submit\" value=\"AssignTask\">-->\n");
      out.write("                            <!--<input type=\"submit\" name=\"submit\" value=\"CompleteTask\">-->\n");
      out.write("            \n");
      out.write("                                <input type=\"hidden\" name=\"name\" value=\"");
      out.print(s1);
      out.write("\">\n");
      out.write("        \n");
      out.write("                    </form>\n");
      out.write("             </div>\n");
      out.write("        ");
 
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
