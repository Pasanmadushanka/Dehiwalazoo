package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation_panle.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("        \n");
      out.write(" <video autoplay muted loop id=\"myVideo\" width=\"100%\">\n");
      out.write("    <source src=\"Video/Dehiwala National Zoo in 10 minutes - YouTube.MP4\" type=\"video/mp4\">\n");
      out.write("\n");
      out.write("</video>\n");
      out.write("       \n");
      out.write("</div>\n");
      out.write("  <script>\n");
      out.write("var video = document.getElementById(\"myVideo\");\n");
      out.write("var btn = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("function myFunction() {\n");
      out.write("  if (video.paused) {\n");
      out.write("    video.play();\n");
      out.write("    btn.innerHTML = \"Pause\";\n");
      out.write("  } else {\n");
      out.write("    video.pause();\n");
      out.write("    btn.innerHTML = \"Play\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div id=\"map\" style=\"width:100%;height:400px;\"></div>\n");
      out.write("     <script>\n");
      out.write("         \n");
      out.write("function myMap() {\n");
      out.write("  var myCenter = new google.maps.LatLng(6.8568, 79.8729);\n");
      out.write("  var mapCanvas = document.getElementById(\"map\");\n");
      out.write("  var mapOptions = {center: myCenter, zoom: 15};\n");
      out.write("  var map = new google.maps.Map(mapCanvas, mapOptions);\n");
      out.write("  var marker = new google.maps.Marker({position:myCenter});\n");
      out.write("  marker.setMap(map);\n");
      out.write("\n");
      out.write("  // Zoom to 9 when clicking on marker\n");
      out.write("  google.maps.event.addListener(marker,'click',function() {\n");
      out.write("    map.setZoom(9);\n");
      out.write("    map.setCenter(marker.getPosition());\n");
      out.write("  });\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBOynRfHitJeMgEcoDQdRr0gRYPB3ScYLc&callback=myMap\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
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
