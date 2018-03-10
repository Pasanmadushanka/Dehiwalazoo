package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation_panle.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <!-- Contact Container -->\n");
      out.write("            <div class=\"w3-container w3-padding-64 w3-theme-l5\" id=\"contact\">\n");
      out.write("                <div class=\"w3-row\" style=\"padding-top: 100px\"> \n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"vertical-align: top\">\n");
      out.write("                                <img src=\"Images/images.jpg\" alt=\"\" width=\"250px\"/><br><br>\n");
      out.write("                                <img src=\"Images/images (2).jpg\" alt=\"\" width=\"250px\"/><br><br>\n");
      out.write("                                <img src=\"Images/images (3).jpg\" alt=\"\" width=\"250px\"/><br><br>\n");
      out.write("                                <img src=\"Images/images (5).jpg\" alt=\"\" width=\"250px\"/>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td style=\"vertical-align: top\">\n");
      out.write("                                <h1 style=\"text-align: center\"> About Us</h1>\n");
      out.write("                                <p> It is amazing to see such a greenish calm environment with in the hustle – bustle of urban city Dehiwala.\n");
      out.write("\n");
      out.write("                                    The zoo is famous for its huge tree covers and well – landscaped gardening. Some areas of the zoo have been converted into small forest patches rich in rare plants to provide more natural habitats. Valuable medicinal plants are prominent plants among the trees in these forest patches. Trees full of fruits and flowers, flower beds full of flowering and non flowering plants are fascinated zoo visitors every where within the Zoo.</p>\n");
      out.write("                                <h1 style=\"text-align: center\"> Our History</h1>\n");
      out.write("                                <p>The National Zoological Gardens, Dehiwala – more commonly called Colombo Zoo – has a long history. In the early years of the 20th century, John Hagenbeck, brother of the famous animal trainer, Carl Hagenbeck had established the Ceylon Zoological Gardens as a company at Dehiwala. The 11-acre plot of land was used by the Hagenbecks as a collecting depot for captured wild animals destined for the Zoos of Europe. However, the company was bankrupt in 1936 and was purchased by the Government.\n");
      out.write("\n");
      out.write("                                    Initially the Zoo came under the purview of the Government Agent of Colombo and was headed by a Superintendent. When it was made an autonomous department in 1946, the main aim was to satisfy people’s curiosity and thus the Zoo was more focused on entertainment rather than conservation.\n");
      out.write("\n");
      out.write("                                    The first director, Major Aubrey Weinman, built cages to house an ever-increasing number of animals. He also introduced animal shows, such as the elephant performance and the chimpanzee tea party, which brought in thousands of visitors.\n");
      out.write("\n");
      out.write("                                    In 1970s and 80s vast advancements were made in Zoo management. The Zoo soon became the pioneer of the open Zoo concept in Asia. For most animals menagerie concept of old was abandoned for open spaces and ‘soft’ barriers instead of bars. The educational functionality of a Zoo as a tool of scientific research and conservation was also realized.\n");
      out.write("\n");
      out.write("                                    Type of exhibits and many other associated features have taken into account for animal enclosures with the changes of new zoo concept the existing techniques. Numbers of species in exhibits were scaled down and many animals were given significant spaces in order to facilitate their natural behavior.</p>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td style=\"vertical-align: top\">\n");
      out.write("                                <img src=\"Images/wolf-spirit-animal.jpg\" alt=\"\" width=\"250px\"/><br><br>\n");
      out.write("                                <img src=\"Images/images (1).jpg\" alt=\"\" width=\"250px\"/><br><br>\n");
      out.write("                                <img src=\"Images/download.jpg\" alt=\"\" width=\"250px\"/><br><br/>\n");
      out.write("                                <img src=\"Images/images (4).jpg\" alt=\"\" width=\"250px\"/>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
