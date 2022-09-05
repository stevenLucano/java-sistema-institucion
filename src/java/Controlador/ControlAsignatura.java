/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

//import Modelo.AsignaturaSistema;
import Modelo.AsignaturaSistema;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webservice.Asignatura;

/**
 *
 * @author Steven
 */
public class ControlAsignatura extends HttpServlet {

    
    AsignaturaSistema asignaturaSis = new AsignaturaSistema();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acceso = "";
        String pagina = request.getParameter("p");
        
        switch(pagina){
            // Llevar a registro-asignatura.jsp
            case "registro":
                acceso = "registro-asignatura.jsp";
                break;
                
            // Registrar una nueva asignatura con parametros de un Form
            case "registroAsg":
                String nom = request.getParameter("txtNomAsg");
                String tipo = request.getParameter("txtTipoAsg");
                int cred = Integer.parseInt(request.getParameter("txtCredAsg"));

                String res = asignaturaSis.agregarAsignatura(nom, tipo, cred, 0);
                
                if(res.equals("error")){
                    request.setAttribute("errAdd", "true");
                    
                } else {
                    request.setAttribute("modalAdd", "true");
                    
                }
                acceso = "registro-asignatura.jsp";
                break;
            
            // Llevar a actualizacion-asignatura.jsp con el id de una asignatura
            case "actualizar":
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("idAsg", id+"");
                acceso = "actualizacion-asignatura.jsp";
                break;
            
            // Actualizar una asignatura de id recibido con nuevos parametros de un Form
            case "actualizarAsg":
                int idAc = Integer.parseInt(request.getParameter("txtIdAsgAc"));
                String nomAc = request.getParameter("txtNomAsgAc");
                String tipoAc = request.getParameter("txtTipoAsgAc");
                int credAc = Integer.parseInt(request.getParameter("txtCredAsgAc"));
                int matAc = Integer.parseInt(request.getParameter("txtMatAsgAc"));
                
                asignaturaSis.actualizarAsignatura(idAc, nomAc, tipoAc, credAc, matAc);
                request.setAttribute("modalEdit", "true");
                acceso = "vista-asignatura.jsp";
                break;
                
            // Eliminar una asignatura de id recibido
            case "eliminar":
                int idEl = Integer.parseInt(request.getParameter("id"));
                asignaturaSis.eliminarAsignatura(idEl);
                
                request.setAttribute("modalDelete", "true");
                acceso = "vista-asignatura.jsp";
                break;
                
            // Redireccionar a la vista asignatura
            case "visualizar":
                acceso = "vista-asignatura.jsp";
                break;
                
            // Buscar una asignatura mediante su id
            case "buscar":
                int idAsgBus;
                try {
                    idAsgBus = Integer.parseInt(request.getParameter("txtBusquedaAsg"));
                } catch (NumberFormatException e) {
                    request.setAttribute("errorNum", "true");
                    request.getRequestDispatcher("vista-asignatura.jsp").forward(request, response);
                    break;
                }
                
                Asignatura asg = asignaturaSis.buscarAsignatura(idAsgBus);
                
                if(asg.getIdAsignatura()!= 0) {
                    request.setAttribute("idAsgBus", idAsgBus);
                    request.getRequestDispatcher("asignatura-individual.jsp").forward(request, response);
                } else {
                    request.setAttribute("noEncontrado", "true");
                    request.getRequestDispatcher("vista-asignatura.jsp").forward(request, response);
                }
                break;
            
            // Trae la vista asignatura
            default:
                acceso = "vista-asignatura.jsp";
                break;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(acceso);
        dispatcher.forward(request,response);
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
