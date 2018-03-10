/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servelet;
import dataservice.Animal;
import bussinessservice.BussinessService;
import bussinessservice.BussinessService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Night
 */
@WebServlet(name = "Animalmodification", urlPatterns = {"/Animalmodification"})
public class Animalmodification extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
              BussinessService proxy=new BussinessService_Service().getBussinessServicePort();
              HttpSession session = request.getSession();
            String name=request.getParameter("txtname");
            String description=request.getParameter("txtdescription");
                    String scientificname=request.getParameter("txtscientificname");                
                        String link=request.getParameter("txtlink");
                    String noofcategories=request.getParameter("txtnoofcategories");
            String username=(String)session.getAttribute("username");
            if(request.getParameter("btnsearch") != null){
                 
                request.setAttribute("Result", proxy.searchanimals(name));
                  request.getRequestDispatcher("Animal_modification.jsp").forward(request, response);
               
            }
            if(request.getParameter("btndelete") != null){
                if(proxy.deleteanimal(name) == 1){
                   request.setAttribute("result", "deleted");
                }
                else{
                 request.setAttribute("result", "not deleted");
                }
                  request.getRequestDispatcher("Animal_modification.jsp").forward(request, response);
            }
             if(request.getParameter("btnupdate") != null){
                 List<Animal> animal = new ArrayList<Animal>();
        Animal a=new Animal();
        a.setName(name);
        a.setDescription(description);
        a.setNoofcategories(Integer.parseInt(noofcategories));
        a.setLink(link);
        a.setScientificname(scientificname);
        animal.add(a);
        if(proxy.updateanimal(animal,username)==1){
                   request.setAttribute("result", "updated");
                }
                else{
               request.setAttribute("result", "not updated");
                }
          request.getRequestDispatcher("Animal_modification.jsp").forward(request, response);
            }
              if(request.getParameter("btnadd") != null){
                    List<Animal> animal = new ArrayList<Animal>();
        Animal a=new Animal();
        a.setName(name);
        a.setDescription(description);
        a.setNoofcategories(Integer.parseInt(noofcategories));
        a.setLink(link);
        a.setScientificname(scientificname);
        animal.add(a);
        if(proxy.addanimal(animal,username) == 1){
                    request.setAttribute("Result", "added");
                }
                else{
                 request.setAttribute("Result", "not added");
                }
        request.getRequestDispatcher("Addanimals.jsp").forward(request, response);
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
