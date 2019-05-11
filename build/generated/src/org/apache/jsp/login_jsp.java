package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"animate.css\"/>\n");
      out.write("\t<style>\n");
      out.write("\tbody{\n");
      out.write("\t\t\n");
      out.write("\t\tbackground-size: cover;\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\tmargin:0;\n");
      out.write("\t\tpadding: 0;\n");
      out.write("\t\tfont-family:sans-serif;\n");
      out.write("\t\tbackground: url(images/login.jpg) no-repeat;\n");
      out.write("\t\tbackground-size: cover;\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t/*background-position:center;*/\n");
      out.write("\t\n");
      out.write("\t}\n");
      out.write("\t.main\n");
      out.write("\t{\n");
      out.write("\t\tmax-width:400px;\n");
      out.write("\t\tborder-radius: 20px;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tbackground:rgba(0,0,0,0.8);\n");
      out.write("\t\tbox-sizing:border-box;\n");
      out.write("\t\tpadding:40px;\n");
      out.write("\t\tcolor:#fff;\n");
      out.write("\t\tmargin-top:50px;\n");
      out.write("\t}\n");
      out.write("\t.h2\n");
      out.write("\t{\n");
      out.write("\t\ttext-align:center;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t.main p{\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("}\n");
      out.write("\t.my\n");
      out.write("\t{\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\tbox-sizing: border-box;\n");
      out.write("\t\tpadding: 12px 5px;\n");
      out.write("\t\tbackground:rgba(0,0,0,0.10);\n");
      out.write("\t\toutline:none;\n");
      out.write("\t\tborder:none;\n");
      out.write("\t\tborder-bottom:1px solid #fff;\n");
      out.write("\t\tcolor:white;\n");
      out.write("\t\tborder-radius:5px;\n");
      out.write("\t\tmargin:5px;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t.g\n");
      out.write("{\n");
      out.write("    width:100%;\n");
      out.write("\t\tbox-sizing: border-box;\n");
      out.write("\t\tpadding: 12px 5px;\n");
      out.write("\t\tbackground:rgba(0,0,0,0.10);\n");
      out.write("\t\toutline:none;\n");
      out.write("\t\tborder:none;\n");
      out.write("\t\tborder-bottom:1px solid #fff ;\n");
      out.write("\t\tcolor:black;\n");
      out.write("\t\tborder-radius:5px;\n");
      out.write("\t\tmargin:5px;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("        opacity:0.9;\n");
      out.write("}\n");
      out.write(".g j{\n");
      out.write("    \n");
      out.write("\tcolor:black;\n");
      out.write("}\n");
      out.write("\t.btn\n");
      out.write("\t{\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\tbox-sizing:border-box;\n");
      out.write("\t\tpadding: 10px,0;\n");
      out.write("\t\tbackground: #60adde;\n");
      out.write("\t\topacity:0.7;\n");
      out.write("\t\toutline:none;\n");
      out.write("\t\tborder:none;\n");
      out.write("\t\tborder-bottom:1px  #fff;\n");
      out.write("\t\tcolor:#fff;\n");
      out.write("\t\tborder-radius:20px;\n");
      out.write("\t\tfont-size:20px;\n");
      out.write("\t\tmargin-top:30px;\n");
      out.write("\t\theight:50px;\n");
      out.write("\t}\n");
      out.write("\t.btn:hover\n");
      out.write("{\n");
      out.write("\tbackground:#ffc107;\n");
      out.write("\tcolor:#000;\n");
      out.write("\tcursor:pointer;\n");
      out.write("}\n");
      out.write(".main a{\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\tfont-size:12px;\n");
      out.write("\tline-height:20px;\n");
      out.write("\tcolor:darkgrey;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("\t<h1 class=\"animated heartBeat\">Login Here</h1>\n");
      out.write("\t<form name=\"form\" action =\"logServlet\" method=\"get\" onsubmit=\" return myValidation()\">\n");
      out.write("\t\t<p>ID</p>\n");
      out.write("\t\t<input class= \"my\" type=\"text \" placeholder= \"ID\" name=\"id\" value=\"\"><br>\n");
      out.write("\t\t<p>Password</p>\n");
      out.write("\t\t<input  class=\"my\" type=\"password\" placeholder=\"password\" name=\"pass\" value=\"\"><br>\n");
      out.write("\t\t<p>Account</p>\n");
      out.write("\t\t<select class=\"g\" name=\"select\">\n");
      out.write("\t\t\t<option class=\"j\" value=\"\">---select---</option>\n");
      out.write("       <option  class=\"j\" value=\"Student\">Student/Faculty</option>\n");
      out.write("       \n");
      out.write("        <option  class=\"j\" value=\"Staff\">Staff</option>\n");
      out.write("         <option  class=\"j\" value=\"Admin\">Admin</option>\n");
      out.write("         </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<input class=\"btn\" class=\"animated tada\" type=\"submit\" name=\"\" value=\"login\"><br><br>\n");
      out.write("\t\t<a href=\"lostpass.jsp\">Lost your password?</a><br><br>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<script >\n");
      out.write("\t\tfunction myValidation(){\n");
      out.write("\t\tvar value=document.forms[\"form\"][\"id\"].value;\n");
      out.write("\t\tvar value1=document.forms[\"form\"][\"pwd\"].value;\n");
      out.write("\t\tvar value2=document.forms[\"form\"][\"acc\"].value;\n");
      out.write("\t\tif(value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Name input cannot be empty!\");\n");
      out.write("\t\t\t//return false;\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif(value1==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Password cannot be empty!\");\n");
      out.write("\t\t\t//return false;\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(value2==\"\"  )\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"select type!!!!\");\n");
      out.write("\t\t\tflag=false;\n");
      out.write("\t\t}\n");
      out.write("\t\treturn flag;\n");
      out.write("\t}\n");
      out.write("\t </script>\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
