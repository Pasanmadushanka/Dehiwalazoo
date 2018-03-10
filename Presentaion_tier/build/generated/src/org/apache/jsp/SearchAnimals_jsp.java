package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dataservice.Animal;
import bussinessservice.BussinessService_Service;
import java.util.ArrayList;
import java.util.List;
import java.util.List;
import bussinessservice.BussinessService;

public final class SearchAnimals_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            BussinessService proxy = new BussinessService_Service().getBussinessServicePort();
            List<Animal> animalnames = new ArrayList<Animal>();
            animalnames.addAll((List) proxy.animalsnames());

        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation_panle.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <!-- Contact Container -->\n");
      out.write("            <div class=\"w3-container w3-padding-64 w3-theme-l5\" style=\"margin-right: 200px;margin-top: 200px;margin-bottom: 100px;margin-left: 200px\">\n");
      out.write("\n");
      out.write("                <form class=\"w3-container w3-card-4 w3-padding-16 w3-white\" action=\"Searchanimals\" method=\"get\">\n");
      out.write("                    <div class=\"w3-section\">      \n");
      out.write("                        <label ><b>Select Animal</b></label>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <select class=\"w3-input\" name=\"txtname\" required style=\"border: 2\">\n");
      out.write("                            ");
for (dataservice.Animal a : animalnames) {
      out.write("\n");
      out.write("                            <option>");
      out.print(a.getName());
      out.write("</option>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\"  class=\"w3-button w3-right w3-theme\" name=\"btnsearch\" value=\"Search\"> \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

 List<Animal> searchingresults = new ArrayList<Animal>();
            
                if (request.getAttribute("Result") != null) {
                   searchingresults.addAll((List) request.getAttribute("Result")); 
               for(Animal a:searchingresults){
            
      out.write("                \n");
      out.write("<div class=\"container\">\n");
      out.write("  <h2>");
      out.print(a.getName());
      out.write("</h2>\n");
      out.write("   <table class=\"table\">\n");
      out.write("  \n");
      out.write("    <tbody>\n");
      out.write("      <tr class=\"success\">\n");
      out.write("          <td>Scientific name</td>\n");
      out.write("          <td>");
      out.print(a.getScientificname());
      out.write("</td>\n");
      out.write("      </tr>      \n");
      out.write("          <tr class=\"success\">\n");
      out.write("          <td>No of categories</td>\n");
      out.write("          <td>");
      out.print(a.getNoofcategories());
      out.write("</td>\n");
      out.write("      </tr> \n");
      out.write("      </tr>      \n");
      out.write("          <tr class=\"success\">\n");
      out.write("          <td>Description</td>\n");
      out.write("          <td>");
      out.print(a.getDescription() );
      out.write("</td>\n");
      out.write("      </tr> \n");
      out.write("      </tr>      \n");
      out.write("          <tr class=\"success\">\n");
      out.write("          <td>More info</td>\n");
      out.write("          <td><a href=\"");
      out.print(a.getLink());
      out.write("\"></td>\n");
      out.write("      </tr> \n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
}
}

      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
