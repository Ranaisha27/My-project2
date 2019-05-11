package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title></title>\n");
      out.write("  <style>\n");
      out.write("  body{\n");
      out.write("    background-size: cover;\n");
      out.write("    margin:0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family:sans-serif;\n");
      out.write("    background: url(images/too.jpg) no-repeat;\n");
      out.write("    background-size:cover;\n");
      out.write("    /*background-position:center;*/\n");
      out.write("  }\n");
      out.write("  .main{\n");
      out.write("    width:100%;\n");
      out.write("    height:100px;\n");
      out.write("    background-color:rgba(0,0,0,0.6);\n");
      out.write("  }\n");
      out.write("  .header{\n");
      out.write("    width:25%;\n");
      out.write("    line-height:80px;\n");
      out.write("    float:left;\n");
      out.write("     }\n");
      out.write("     .header h1{\n");
      out.write("      padding-left:70px;\n");
      out.write("      font-weight:bold;\n");
      out.write("      color:white;\n");
      out.write("      font-size:25px;\n");
      out.write("     }\n");
      out.write("  \n");
      out.write("  .nav\n");
      out.write("  {\n");
      out.write("    float:right;\n");
      out.write("    list-style:none;\n");
      out.write("    margin-top:30px;\n");
      out.write("  }\n");
      out.write("  .nav a{\n");
      out.write("    color:white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    padding:5px 20px;\n");
      out.write("    font-family:\"Roboto\",sans-serif;\n");
      out.write("    font-size:22px;\n");
      out.write("    /*border:1px solid white;*/\n");
      out.write("  }\n");
      out.write(" \n");
      out.write("  .nav a:hover{border:1px solid white;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  .hero{\n");
      out.write("    position:absolute;\n");
      out.write("    width:1000px;\n");
      out.write("    margin-left:170px;\n");
      out.write("    margin-top:0px;\n");
      out.write("  } \n");
      out.write("  .hero h1{\n");
      out.write("    font-family:Calibri;\n");
      out.write("    font-size:70px;\n");
      out.write("    text-align:center;\n");
      out.write("    margin-top:50px;\n");
      out.write("  color: white;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .demo\n");
      out.write("    {\n");
      out.write("      display:flex;\n");
      out.write("      background-color: transparent;\n");
      out.write("      padding:20px;\n");
      out.write("            flex-wrap:wrap;\n");
      out.write("      flex-direction:row;\n");
      out.write("      justify-content: space-around;\n");
      out.write("      height:300px;\n");
      out.write("      width:100%;\n");
      out.write("      margin-top: 150px;\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("    .demo div{\n");
      out.write("\n");
      out.write("      background-color:white;\n");
      out.write("      text-align:center;\n");
      out.write("      margin:10px;\n");
      out.write("      font-size:50px;\n");
      out.write("      padding:10px;\n");
      out.write("      width:25%;\n");
      out.write("      height:300px;\n");
      out.write("      border-radius:40px;\n");
      out.write("      opacity:0.8;\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("    .demo input[type=text]\n");
      out.write("    {\n");
      out.write("      margin-top:3px;\n");
      out.write("       border-radius: 10px;\n");
      out.write("      margin-bottom: 30%;\n");
      out.write("      width:200px;\n");
      out.write("      height:50px;\n");
      out.write("      \n");
      out.write("          }\n");
      out.write("    .demo h6\n");
      out.write("    {\n");
      out.write("   \n");
      out.write("   font-family:Adobe Gothic Std B;  \n");
      out.write("     }\n");
      out.write("    .btn{\n");
      out.write("      background: grey;\n");
      out.write("      border-bottom:1px  grey;\n");
      out.write("    color:#fff;\n");
      out.write("    border-radius:20px;\n");
      out.write("    height:60px;\n");
      out.write("    width:90px;\n");
      out.write("    }\n");
      out.write("   /* .btn\n");
      out.write("  {\n");
      out.write("    width:50%;\n");
      out.write("    box-sizing:border-box;\n");
      out.write("    padding: 10px,0;\n");
      out.write("    background: #60adde;\n");
      out.write("    opacity:0.7;\n");
      out.write("    outline:none;\n");
      out.write("    border:none;\n");
      out.write("    border-bottom:1px  #fff;\n");
      out.write("    color:#fff;\n");
      out.write("    border-radius:20px;\n");
      out.write("    font-size:20px;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  .btn:hover\n");
      out.write("{\n");
      out.write("  background:#ffc107;\n");
      out.write("  color:#000;\n");
      out.write("  cursor:pointer;\n");
      out.write("}*/\n");
      out.write("  \n");
      out.write("      \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("<div class=\"header\"><h1>ADMIN</h1></div>\n");
      out.write("<div class=\"nav\">\n");
      out.write("\n");
      out.write("  <a href=\"viewall.html\">ALL</a>\n");
      out.write("  <a href=\"update.jsp\">UPDATE SCHEDULE</a>\n");
      out.write("  <a href=\"display.jsp\"> ADD SCHEDULE</a>\n");
      out.write("  <a href=\"delete.jsp\">DELETE SCHEDULE</a>\n");
      out.write("  <a href=\"login.jsp\">LOGOUT</a>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"hero\">\n");
      out.write("  <h1 class=\"wow fadeInUp\" data-wow-delay=\"0.6s\">SEARCH HERE!</h1>\n");
      out.write(" </div>\n");
      out.write(" <div class=\"demo\">\n");
      out.write("  <div class=\"A\">\n");
      out.write("      <h6> BY BUS ROUTE\n");
      out.write("      <br>\n");
      out.write("     \n");
      out.write("    \n");
      out.write("    <form class=\"k\" action=\"search\"  method= \"post\">\n");
      out.write("      <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("      <button class=\"btn\" type=\"submit\">SEARCH</button>\n");
      out.write("    </h6></form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"B\">\n");
      out.write("    <h6>BY BUS NUMBER\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <form class=\"k\" action=\"search1\" method=\"post\" >\n");
      out.write("      <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("     \n");
      out.write("     \n");
      out.write("      <button class=\"btn\" type=\"submit\">SEARCH</i></button>\n");
      out.write("    </form>\n");
      out.write("  </h6>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"C\"><h6>\n");
      out.write("  BY DROP POINT \n");
      out.write("    <br>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <form class=\"k\" action=\"search2\">\n");
      out.write("      <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("      <button class=\"btn\" type=\"submit\">SEARCH</button>\n");
      out.write("    </form>\n");
      out.write("  </h6>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
