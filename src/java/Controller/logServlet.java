
package Controller;

import Model.user;
import Model.userDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class logServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       
       String id=request.getParameter("id");
       
       String pass=request.getParameter("pass");
       
       String user=request.getParameter("select");
         
       userDAO ud = new userDAO();
      
       boolean flag = false;
       if(user.equals("Student")){
           flag = ud.auth(id,pass);
           if(flag){
               response.sendRedirect("Studenttable.jsp");
           }
           else
           {
            response.sendRedirect("login.jsp");   
           }
       }
       
       else if(user.equals("Admin")){
            flag = ud.authAdmin(id,pass);
           if(flag){
               response.sendRedirect("admin.jsp");
           }
           else
           {
            response.sendRedirect("login.jsp");   
           }   
       }     
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}






