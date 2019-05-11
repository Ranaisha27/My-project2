package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lostpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>WELCOME</title>\n");
      out.write("\t<style>\n");
      out.write("\thtml,body\n");
      out.write("\t{\n");
      out.write("\t\tmargin:0;\n");
      out.write("\t\tpadding:0;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\theight:100%;\n");
      out.write("\t}\n");
      out.write("\t.b1\n");
      out.write("\t{\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\theight:100%;\n");
      out.write("\t\tmargin:auto;\n");
      out.write("\t\tbackground:url(images/welcome1.jpg)no-repeat;\n");
      out.write("\t\ttop:0;\n");
      out.write("\t\tdisplay:table;\n");
      out.write("\t\tbackground-size:cover;\n");
      out.write("\t\topacity:0.9;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t.b1 .in1{\n");
      out.write("\t\tdisplay:table-cell;\n");
      out.write("\t\tvertical-align: middle;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\tmax-width:none; \n");
      out.write("\t}\n");
      out.write("\t.content{\n");
      out.write("\t\tmax-width:500px;\n");
      out.write("\t\tmargin:auto;\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\t}\n");
      out.write("\t.content h1\n");
      out.write("\t{\n");
      out.write("\t\tfont-family:'Century Gothic',sans-serif;\n");
      out.write("\t\tcolor:#f9f3f4;\n");
      out.write("\t\tfont-size:500%;\n");
      out.write("\t\ttext-shadow:0 0 300px #000;\n");
      out.write("\t}\n");
      out.write("\t.content .btn\n");
      out.write("\t{\n");
      out.write("\t\tborder-radius:9px;\n");
      out.write("\t\tcolor:#f9f3f4;\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tfont-family:'Century Gothic',sans-serif;\n");
      out.write("\t\tborder:3px solid;\n");
      out.write("\t\tpadding:7px 13px;\n");
      out.write("\t\tfont-weight: bold;\n");
      out.write("opacity:0.7;\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t.content .btn:hover\n");
      out.write("\t{\n");
      out.write("\t\t\n");
      out.write("\tbackground:#60adde;\n");
      out.write("\t\n");
      out.write("\tcolor:#fff;\n");
      out.write("\tcursor:pointer;\n");
      out.write("\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("1\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write(" \n");
      out.write("  $(\"#div3\").fadeIn(\"slow\", 0.15);\n");
      out.write("  });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<section class=\"b1\">\n");
      out.write("\t<div class=\"in1\">\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t\t<div id=\"div3\" >\n");
      out.write("\t\t\t<h1>CONTACT ADMIN FOR PASSWORD</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<a class=\"btn\" href=\"login.jsp\">BACK</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("</body>\n");
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
