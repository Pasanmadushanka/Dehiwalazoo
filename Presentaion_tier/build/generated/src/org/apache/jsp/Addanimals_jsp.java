package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Addanimals_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <body>\n");
      out.write("         ");

              if(request.getAttribute("Result") =="added"){
            
      out.write("\n");
      out.write("            <script>alert(\"Animal information added sucessfully\")</script>\n");
      out.write("            ");

        }
 if(request.getAttribute("Result") =="not added"){
            
      out.write("\n");
      out.write("            <script>alert(\"Animal information didn't add sucessfully.\")</script>\n");
      out.write("            ");

            }
        
      out.write("\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation_panle.jsp", out, false);
      out.write("\n");
      out.write("         <div class=\"main\">\n");
      out.write("        <!-- Contact Container -->\n");
      out.write("        <div class=\"w3-container w3-padding-64 w3-theme-l5\" id=\"contact\">\n");
      out.write("            <div class=\"w3-row\" style=\"padding-top: 100px\">\n");
      out.write("             \n");
      out.write("                <div class=\"w3-col m7\" style=\"margin-right: 200px;margin-top:100px;margin-bottom: 80px;margin-left: 300px\">\n");
      out.write("                    <form class=\"w3-container w3-card-4 w3-padding-16 w3-white\" action=\"Animalmodification\" target=\"_blank\">\n");
      out.write("                     \n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Animal name</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"text\" name=\"txtname\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Scientific name</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"text\" name=\"txtscientificname\" required >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Link</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"text\" name=\"txtlink\" required >\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>No of categories</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"text\" name=\"txtnoofcategories\" required >\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Description</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"text\" name=\"txtdescription\" required >\n");
      out.write("                        \n");
      out.write("                        </div>  \n");
      out.write("                       \n");
      out.write("                        <input type=\"submit\" class=\"w3-button w3-right w3-theme\" value=\"Add\" name=\"btnadd\">\n");
      out.write("                      \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                      \n");
      out.write("            </div>\n");
      out.write("                            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</html>\n");
      out.write("\n");
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
