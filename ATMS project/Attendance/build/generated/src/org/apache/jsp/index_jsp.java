package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Style.jsp");
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>CSS file</title>\n");
      out.write("\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t.form\n");
      out.write("\t\t{\n");
      out.write("                                font-size: 20px;\n");
      out.write("\t\t\t\twidth: 50%;\n");
      out.write("\t\t\t\theight: 50%;\n");
      out.write("\t\t\t\tmargin-left: 25%;\n");
      out.write("\t\t\t\tpadding-top: 10px;\n");
      out.write("\t\t\t\tmargin-top: 70px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.button\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.btn\n");
      out.write("\t\t{\n");
      out.write("\t\t\twidth: 50%;\n");
      out.write("                        height: 50%;\n");
      out.write("                        margin-left: 210px;\n");
      out.write("\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>REGISTER</title>\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"w3-container w3-card-4 form w3-mobile\"  >\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-blue-gray w3-center\">\n");
      out.write("  \t\t\t\n");
      out.write("                                    <h2>REGISTER</h2>\n");
      out.write("  \t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<form class=\"w3-container w3-mobile\" action=\"Registration\" method=\"post\" name=\"Form\" onsubmit=\"return validateForm()\">\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <label>Name</label>\n");
      out.write("\t\t\t\t  <input class=\"w3-input\" type=\"text\" name=\"Name\" id=\"a\"></p>\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <label>Phone Number</label>\n");
      out.write("\t\t\t\t  <input class=\"w3-input\" type=\"number\" name=\"Contact\" id=\"b\"></p>\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <label>Email</label>\n");
      out.write("\t\t\t\t  <input class=\"w3-input\" type=\"email\" name=\"Email\" id=\"c\"></p>\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <label>Password</label>\n");
      out.write("\t\t\t\t  <input class=\"w3-input\" type=\"password\" name=\"Password\" id=\"d\"></p>\n");
      out.write("                                  <p>\n");
      out.write("                                      <label>Technology</label><br>\n");
      out.write("                                  <select name=\"Technology\"  class=\"w3-input\" id=\"e\">\n");
      out.write("                                      <option>Select</option>\n");
      out.write("                                      <option value=\"JAVA\">JAVA</option>\n");
      out.write("                                      <option value=\"DOTNET\">DOTNET</option>\n");
      out.write("                                      <option value=\"TESTING\">TESTING</option>\n");
      out.write("                                  </select>\n");
      out.write("\t\t\t\t  <!--<input class=\"w3-input\" type=\"list\" name=\"Technology\"></p>-->\n");
      out.write("                                  </p>\n");
      out.write("                                   <p>\n");
      out.write("\t\t\t\t  <label>Location</label>\n");
      out.write("\t\t\t\t  <input class=\"w3-input\" type=\"text\" name=\"Location\" id=\"f\"></p>\n");
      out.write("\t\t\t\t  <div class=\"w3-container btn w3-mobile\">\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <button class=\"w3-btn w3-blue-gray w3-round button w3-margin \" name=\"register\">Register</button></p>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("function validateForm()\n");
      out.write("{\n");
      out.write("    var a=document.forms[\"Form\"][\"Name\"].value;\n");
      out.write("    var b=document.forms[\"Form\"][\"Contact\"].value;\n");
      out.write("    var c=document.forms[\"Form\"][\"Email\"].value;\n");
      out.write("    var d=document.forms[\"Form\"][\"Password\"].value;\n");
      out.write("    var e=document.forms[\"Form\"][\"Technology\"].value;\n");
      out.write("    var f=document.forms[\"Form\"][\"Location\"].value;\n");
      out.write("    if (a===null || a===\"\")\n");
      out.write("\n");
      out.write("    {   \n");
      out.write("       alert(\"Please Fill Name Field\");\n");
      out.write("        return false;\n");
      out.write("    }   \n");
      out.write("     if (b===null || b===\"\")\n");
      out.write("\n");
      out.write("    {   \n");
      out.write("       alert(\"Please Fill Contact Field\");\n");
      out.write("        return false;\n");
      out.write("    }   \n");
      out.write("    if(b.length ==10){\n");
      out.write("//        alert(\"Enter the proper contact number\");\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("    {\n");
      out.write("        alert(\"Enter 10 digit number \")\n");
      out.write("    }\n");
      out.write("     if (c===null || c===\"\")\n");
      out.write("\n");
      out.write("    {   \n");
      out.write("       alert(\"Please Fill Email Field\");\n");
      out.write("        return false;\n");
      out.write("    }   \n");
      out.write("     if (d===null || d===\"\")\n");
      out.write("\n");
      out.write("    {   \n");
      out.write("       alert(\"Please Fill Password Field\");\n");
      out.write("        return false;\n");
      out.write("    }   \n");
      out.write("     if (f===null || f===\"\")\n");
      out.write("\n");
      out.write("    {   \n");
      out.write("       alert(\"Please Fill Location Field\");\n");
      out.write("        return false;\n");
      out.write("    }   \n");
      out.write("    \n");
      out.write("}  \n");
      out.write("       \n");
      out.write("    \n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
