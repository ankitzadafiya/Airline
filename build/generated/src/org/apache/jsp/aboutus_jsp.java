package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Airline Reservation</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table width=\"100%\">\n");
      out.write("            <tr height=\"100px\">\n");
      out.write("                <td colspan=\"3\" align=\"center\"><h1>Airline Reservation</h1></td>\n");
      out.write("            <td align=\"right\" style=\"vertical-align: top;\"><h3>");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("</h3></td></tr>\n");
      out.write("            <tr height=\"50px\" align=\"center\"><td><h3><a href=\"Home.jsp\">Home</a></h3></td>\n");
      out.write("                <td><h3><a href=\"ticketreservation.jsp\">Ticket Reservation</a></h3></td>\n");
      out.write("                <td><h3><a href=\"aboutus.jsp\">About Us</a></h3></td>\n");
      out.write("                <td><h3><a href=\"feedback.jsp\">Feedback</a></h3></td></tr>\n");
      out.write("            <tr height=\"500px\"><td colspan=\"4\"><marquee behavior=\"alternate\"><image src=\"images/2.jpg\"  height=\"110px\" width=\"150px\" />\n");
      out.write("                                                        <image src=\"images/3.jpg\"  height=\"110px\" width=\"150px\" />\n");
      out.write("                                                        <image src=\"images/15.jpg\"  height=\"110px\" width=\"150px\" />\n");
      out.write("                                                        <image src=\"images/16.jpg\"  height=\"110px\" width=\"150px\" />\n");
      out.write("                                                        <image src=\"images/17.jpg\"  height=\"110px\" width=\"150px\" /></marquee>\n");
      out.write("                    <h3 style=\"text-align: justify;width: 100%;\"> Airlines is the national carrier of India, offering the best way to fly to, from and around India. Among the few airlines to have won both a Skytrax five-star rating and World's Best Cabin \n");
      out.write("                        Crew award, Airlines takes our 40,000 guests daily on memorable journeys inspired by India’s diverse richness. Airlines embodies the incredible diversity of India, capturing its rich traditions, cultures, cuisines and warm hospitality on board, while opening up more of Malaysia’s destinations than any other airline.</h3>\n");
      out.write("                    <h3 style=\"text-align: justify;width: 100%;\">Since September 2015, the airline has been owned and operated by Malaysia Airlines Berhad. As a member of oneworld®, Malaysia Airlines and its partners in the global alliance offer a superior, seamless travel experience to more than 1,000 destinations in 150 plus countries, with special privileges and rewards for frequent flyers,\n");
      out.write("                        including access to more than 650 airport lounges worldwide. Up to 90 destinations will be serviced across Asia, Africa, the Americas and the Middle East via a new codeshare partnership with Emirates, signed in early 2016.\n");
      out.write("\n");
      out.write("</h3>\n");
      out.write("                    <h2>The Vision</h2><h3 style=\"text-align: justify;width: 100%;\">GoAir strives to maintain and enhance passenger’s perception of its services, and in doing so will consistently endeavour to improve on the quality and reliability of its operations. </h3>\n");
      out.write("                    <h2>The Mission</h2><h3 style=\"text-align: justify;width: 100%;\">To provide safe, secure and efficient transportation at all times with attention to essential details that uniquely differentiates our services, thus leading to strengthening and maintaining our position in the market.</h3>\n");
      out.write("                    </td>\n");
      out.write("               </tr>\n");
      out.write("               <tr height=\"20px\" align=\"center\"><td colspan=\"4\"><footer><h3>Airline Reservation Copyright &copy; 2017</h3></footer></td>\n");
      out.write("               </tr>\n");
      out.write("        </table>\n");
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
