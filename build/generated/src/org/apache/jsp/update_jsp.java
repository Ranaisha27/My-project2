package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import Model.schedule;
import org.hibernate.cfg.Configuration;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("    body{\n");
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
      out.write("    background-color:rgba(0,0,0,0.9);\n");
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
      out.write("  .nav a:hover{\n");
      out.write("      border:1px solid white;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("h1{\n");
      out.write("  font-size: 40px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  font-weight: 300;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-bottom: 15px;\n");
      out.write("}\n");
      out.write("table{\n");
      out.write("  width:100%;\n");
      out.write("/*  table-layout: fixed;*/\n");
      out.write("}\n");
      out.write(".tbl-header{\n");
      out.write("  background-color: rgba(0,0,0,0.9);\n");
      out.write(" }\n");
      out.write(".tbl-content{\n");
      out.write(" /*height:300px;*/\n");
      out.write("  overflow-x:auto;\n");
      out.write("  margin-top: 0px;\n");
      out.write("  border: 1px solid rgba(0,0,0,0.9);\n");
      out.write("}\n");
      out.write("th{\n");
      out.write(" \n");
      out.write("  padding: 20px 15px;\n");
      out.write("  text-align: left;\n");
      out.write("  font-weight: 500;\n");
      out.write("  font-size: 16px;\n");
      out.write("  color: #fff;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("td{\n");
      out.write("   \n");
      out.write("  background-color: rgba(0,0,0,0.7);\n");
      out.write("  \n");
      out.write("\n");
      out.write("  padding: 15px;\n");
      out.write("  text-align: left;\n");
      out.write("  vertical-align:middle;\n");
      out.write("  font-weight: 300;\n");
      out.write("  font-size: 12px;\n");
      out.write("  color: #fff;\n");
      out.write("  border-bottom: solid 1px rgba(0,0,0,0.7);\n");
      out.write("}\n");
      out.write(".btn\n");
      out.write("  {\n");
      out.write("    width:20%;\n");
      out.write("    margin:auto;\n");
      out.write("    margin-left:370px;\n");
      out.write("    box-sizing:border-box;\n");
      out.write("    padding: 10px,0;\n");
      out.write("    background: white;\n");
      out.write("    opacity:0.7;\n");
      out.write("    outline:none;\n");
      out.write("    border:none;\n");
      out.write("    border-bottom:1px  #fff;\n");
      out.write("    color:black;\n");
      out.write("    border-radius:20px;\n");
      out.write("    font-size:15px;\n");
      out.write("\n");
      out.write("    height:35px;\n");
      out.write("\n");
      out.write("  }\n");
      out.write("  .btn:hover\n");
      out.write("{\n");
      out.write("  background:grey;\n");
      out.write("  color:#000;\n");
      out.write("  cursor:pointer;\n");
      out.write("}\n");
      out.write(".demo\n");
      out.write("{\n");
      out.write("  display:flex;\n");
      out.write("      background-color: black;\n");
      out.write("      padding:20px;\n");
      out.write("            flex-wrap:wrap;\n");
      out.write("      flex-direction:row;\n");
      out.write("      justify-content: space-around;\n");
      out.write("      width:90%;\n");
      out.write("      margin-top: 50px;\n");
      out.write("      opacity:0.8;\n");
      out.write("     margin:auto;\n");
      out.write("}\n");
      out.write(" .demo input[type=text]\n");
      out.write("    {\n");
      out.write("      margin-top:3px;\n");
      out.write("       border-radius: 10px;\n");
      out.write("      width:200px;\n");
      out.write("      height:30px;\n");
      out.write("      \n");
      out.write("          }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("body{\n");
      out.write("  background: url(images/welcome1.jpg)no-repeat;\n");
      out.write(" background-size:cover;\n");
      out.write("  font-family: 'Roboto', sans-serif;\n");
      out.write("}\n");
      out.write("section{\n");
      out.write("  margin: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("<div class=\"header\"><h1>ADMIN</h1></div>\n");
      out.write("<div class=\"nav\">\n");
      out.write(" \n");
      out.write("  <a href=\"viewall.html\">ALL INFO</a>\n");
      out.write("  <a href=\"update.jsp\">UPDATE SCHEDULE</a>\n");
      out.write("  <a href=\"display.jsp\"> ADD SCHEDULE</a>\n");
      out.write("  <a href=\"delete.jsp\">DELETE SCHEDULE</a>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("  <!--for demo wrap-->\n");
      out.write("  <h1>BUS DETAILS</h1>\n");
      out.write("  <div class=\"tbl-header\">\n");
      out.write("    <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          \n");
      out.write("    <th>BUS NO</th>\n");
      out.write("  <th>FROM</th>\n");
      out.write("    <th>TO</th>\n");
      out.write("    <th>VIA</th>\n");
      out.write("    <th>TIME</th>\n");
      out.write("    \n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("  <div class=\"tbl-content\">\n");
      out.write("   \n");
      out.write("      <tbody>\n");
      out.write("         ");
 
                    String number,pick,drop,route,time;
                    Configuration cf = null;
                    SessionFactory sf = null;
                    Session s = null;
                    schedule sch = null;
                    try{
                        cf = new Configuration();
                        cf.configure();
                        sf = cf.buildSessionFactory();
                        s = sf.openSession();
                        Query q = s.createQuery("from schedule");
                        Iterator it = q.iterate();
                        while (it.hasNext()){
                            
                            sch = (schedule)it.next();
                            number = sch.getBusno();
                            pick = sch.getPickup();
                            drop = sch.getDropto();
                            route = sch.getVia();
                            time = sch.getTime();
                            System.out.println(number);
                            
                
      out.write("        \n");
      out.write("                \n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td>");
      out.print(number);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(pick);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(drop);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(route);
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(time);
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("                        \n");
      out.write("                        ");

                            }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    
                
      out.write("\n");
      out.write("         \n");
      out.write("      </tbody>\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write(" <div class=\"demo\">\n");
      out.write("  <h1>UPDATE SCHEDULE</h1>\n");
      out.write(" <form  action =\"update\" method=\"get\">\n");
      out.write("      <input type=\"text\" placeholder=\"BUS NO\" name=\"busno\">\n");
      out.write("       <input type=\"text\" placeholder=\"FROM\" name=\"pickup\">\n");
      out.write("        <input type=\"text\" placeholder=\"TO\" name=\"dropto\">\n");
      out.write("         <input type=\"text\" placeholder=\"VIA\" name=\"via\">\n");
      out.write("         <input type=\"text\" placeholder=\"TIME\" name=\"time\">\n");
      out.write("         \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <div>\n");
      out.write("             <button class=\"btn\" type=\"submit\">UPDATE</button>  \n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("\n");
      out.write("</form>\n");
      out.write("<div style=\"clear: both;\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
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
