package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Navigation_005fpanle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <!-- Navbar -->\n");
      out.write("       <div class=\"w3-top\" style=\"margin-top: 90px\">\n");
      out.write(" <div class=\"w3-bar w3-theme-d2 w3-left-align\">\n");
      out.write("     <a href=\"Home.jsp\" class=\"w3-bar-item w3-button w3-teal\"><i class=\"fa fa-home w3-margin-right\"></i>Home</a>\n");
      out.write("  <a href=\"#team\" class=\"w3-bar-item w3-button w3-hide-small w3-hover-white\">Contact us</a>\n");
      out.write("  <a href=\"#work\" class=\"w3-bar-item w3-button w3-hide-small w3-hover-white\">Search Animals</a>\n");
      out.write(" \n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-hide-small w3-right w3-hover-teal\" title=\"Search\"><i class=\"fa fa-search\"></i></a>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("  <!-- Navbar on small screens -->\n");
      out.write("  <div id=\"navDemo\" class=\"w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium\">\n");
      out.write("      <a href=\"Home.jsp\" class=\"w3-bar-item w3-button\">Home</a>\n");
      out.write("    <a href=\"Aboutus.jsp\" class=\"w3-bar-item w3-button\">About us</a>\n");
      out.write("    <a href=\"ContactUs.jsp\" class=\"w3-bar-item w3-button\">Contact us</a>\n");
      out.write("    <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("    <button class=\"w3-button\" title=\"search animals\">Search Animals <i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("    <div class=\"w3-dropdown-content w3-card-4 w3-bar-block\">\n");
      out.write("      <a href=\"SearchAnimals.jsp\" class=\"w3-bar-item w3-button\">Search By name</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\">search by image</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("       <script>\n");
      out.write("       // Close side navigation\n");
      out.write("function close() {\n");
      out.write("    document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Used to toggle the menu on smaller screens when clicking on the menu button\n");
      out.write("function openNav() {\n");
      out.write("    var x = document.getElementById(\"navDemo\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else { \n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("    </script>\n");
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
