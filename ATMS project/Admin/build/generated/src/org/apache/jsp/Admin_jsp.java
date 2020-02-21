package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>CSS file</title>\n");
      out.write("\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("            .adjustment{\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                width:200px;\n");
      out.write("                height: auto;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .input\n");
      out.write("            {\n");
      out.write("                margin-right: 0px;\n");
      out.write("            }\n");
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
      out.write("                        margin-left: 240px;\n");
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
      out.write("    <body>\n");
      out.write("<!--        <form method=\"Post\" action=\"ViewStudents\">\n");
      out.write("            <input type=\"text\" placeholder=\"Admin Name\" name=\"admin\">\n");
      out.write("            <input type=\"text\" placeholder=\"Admin Password\" name=\"pass\">\n");
      out.write("            <input type=\"submit\" value=\"submit\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>-->\n");
      out.write("    \n");
      out.write("    <div class=\"w3-container w3-card-4 form w3-border-teal w3-border\"  >\n");
      out.write("\t\t\t\t<div class=\"w3-container w3-blue-gray w3-center\">\n");
      out.write("  \t\t\t\n");
      out.write("                                    <h2>Admin Login</h2>\n");
      out.write("  \t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<form class=\"w3-container w3-mobile\" action=\"ViewStudents\" method=\"post\">\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <label>Admin</label>\n");
      out.write("                                  <input class=\"w3-input\" type=\"text\"  name=\"admin\"></p>\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <label>Password</label>\n");
      out.write("\t\t\t\t  <input class=\"w3-input\" type=\"password\" name=\"pass\"></p>\n");
      out.write("\t\t\t\t  <div class=\"w3-container btn\">\n");
      out.write("\t\t\t\t  <p>\n");
      out.write("\t\t\t\t  <button class=\"w3-btn w3-blue-gray w3-round w3-mobile button w3-margin\" name=\"login\">Login</button></p>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("                                  <br>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\n");
      out.write("</div>   \n");
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
