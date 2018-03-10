package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/lib/w3-theme-black.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("                <div class=\"w3-col m5\">\n");
      out.write("                    <div class=\"w3-padding-16\"><span class=\"w3-xlarge w3-border-teal w3-bottombar\">Contact Us</span></div>\n");
      out.write("                    <h3>Address</h3>\n");
      out.write("                    <p><i class=\"fa fa-map-marker w3-text-teal w3-xlarge\"></i>  National Zoological Gardens,<br>\n");
      out.write("                        Anagarika Dharmapala Mawatha,<br>Dehiwala</p>\n");
      out.write("                    \n");
      out.write("                    <p><i class=\"fa fa-phone w3-text-teal w3-xlarge\"></i>  +94-11-2712752-3</p>\n");
      out.write("                    <p><i class=\"fa fa-envelope-o w3-text-teal w3-xlarge\"></i>  zoosl@slt.lk</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"w3-col m7\">\n");
      out.write("                    <form class=\"w3-container w3-card-4 w3-padding-16 w3-white\" action=\"Contact_us\" target=\"_blank\">\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Name</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"text\" name=\"txtname\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Email</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"email\" name=\"txtemail\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Subject</label>\n");
      out.write("                            <input class=\"w3-input\" type=\"text\" name=\"txtsubject\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"w3-section\">      \n");
      out.write("                            <label>Message</label>\n");
      out.write("                            <textarea name=\"txtmessage\" class=\"w3-input\" form=\"usrform\" required></textarea>\n");
      out.write("                        </div>  \n");
      out.write("                       \n");
      out.write("                        <input type=\"submit\" class=\"w3-button w3-right w3-theme\" value=\"Send\" name=\"btnsend\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("    ");

        if(request.getAttribute("message") =="send"){
            
      out.write("\n");
      out.write("            <script>alert(\"Your message sent successfully. We will Provide a quick response.\")</script>\n");
      out.write("            ");

        }
 if(request.getAttribute("message") =="notsent"){
            
      out.write("\n");
      out.write("            <script>alert(\"Something went wrong, Message sending failed try again.\")</script>\n");
      out.write("            ");

        }
    
    
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
