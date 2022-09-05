package Controlador;

import Modelo.EstudianteSistema;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import webservice.Asignatura;
import webservice.Estudiante;

/**
 *
 * @author Steven
 */
public class ControlEstudiante extends HttpServlet {

    EstudianteSistema estudianteSis = new EstudianteSistema();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina = request.getParameter("p");
        
        switch(pagina){
            
            // Llevar a registro-estudiante.jsp
            case "registro":
                request.getRequestDispatcher("/registro-estudiante.jsp").forward(request, response);
                break;
                
            // Registrar un nuevo estudiante con parametros de un Form
            case "registroEst":
                String ident = request.getParameter("txtIdenEst");
                String nom = request.getParameter("txtNomEst");
                String priAp = request.getParameter("txtPriAp");
                String segAp = request.getParameter("txtSegAp");
                String nac = request.getParameter("txtNacEst");
                String cel = request.getParameter("txtCelEst");
                String carr = request.getParameter("txtCarrEst");

                String res = estudianteSis.agregarEstudiante(ident, nom, priAp, segAp, nac, cel, carr);
                
                if(res.equals("error")){
                    request.setAttribute("errAdd", "true");
                    
                } else {
                    request.setAttribute("modalAdd", "true");
                    
                }
                request.getRequestDispatcher("registro-estudiante.jsp").forward(request, response);
                break;
            
            // Llevar a actualizacion-estudiante.jsp con el id de un estudiante
            case "actualizar":
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("idEst", id+"");
                request.getRequestDispatcher("actualizacion-estudiante.jsp").forward(request, response);
                break;
                
            // Actualizar un estudiante de id recibido con nuevos parametros de un Form
            case "actualizarEst":
                int idAc = Integer.parseInt(request.getParameter("txtIdEstAc"));
                String identAc = request.getParameter("txtIdenEstAc");
                String nomAc = request.getParameter("txtNomEstAc");
                
                String priApAc = request.getParameter("txtPriApAc");
                String segApAc = request.getParameter("txtSegApAc");
                String nacAc = request.getParameter("txtNacEstAc");
                String celAc = request.getParameter("txtCelEstAc");
                String carrAc = request.getParameter("txtCarrEstAc");
                
                estudianteSis.actualizarEstudiante(idAc, identAc, nomAc, priApAc, segApAc, nacAc, celAc, carrAc);
                
                request.setAttribute("modalEdit", "true");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
                
            // Eliminar un estudiante de id recibido
            case "eliminar":
                int idEl = Integer.parseInt(request.getParameter("id"));
                List<Asignatura> asignaturas = estudianteSis.verAsignaturas(idEl);
                
                // Cada asignatura que tenga el estudiante la desasigna
                for(Asignatura asg: asignaturas){
                    estudianteSis.cambioAsignaturas(idEl, asg.getIdAsignatura(), 0);
                }
                
                String resElEst = estudianteSis.eliminarEstudiante(idEl);
                request.setAttribute("modalDelete", "true");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
                
            // Redireccionar a la vista principal
            case "visualizar":
                response.sendRedirect("/SistemaInstitucion");
                break;
            
            // Buscar un estudiante mediante su User id, identificación o primer apellido
            case "buscar":
                String opc = request.getParameter("selector");
                int idBus = 0;
                int identBus = 0;
                String priApBus = "";
                
                if(opc.equals("1")){
                    try {
                        // Evitar el ingreso de caracteres diferentes de números
                        idBus = Integer.parseInt(request.getParameter("txtBusquedaEst"));
                        request.setAttribute("data", idBus+"");
                        
                    } catch (NumberFormatException e) {
                        request.setAttribute("errorNum", "true");
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                        break;
                    }
                } else if(opc.equals("2")){
                    try {
                        // Evitar el ingreso de caracteres diferentes de números
                        identBus = Integer.parseInt(request.getParameter("txtBusquedaEst"));
                        request.setAttribute("data", identBus+"");
                        
                    } catch (NumberFormatException e) {
                        request.setAttribute("errorNum", "true");
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                        break;
                    }
                } else {
                    priApBus = request.getParameter("txtBusquedaEst");
                    request.setAttribute("data", priApBus);
                }
                
                Estudiante est = estudianteSis.buscarEstudiante(idBus, identBus, priApBus);
                
                if(est.getIdEstudiante() != 0) {
                    request.setAttribute("idBus", idBus+"");
                    request.setAttribute("identBus", identBus+"");
                    request.setAttribute("priApBus", priApBus);
                    request.setAttribute("opc", opc);
                    
                    request.getRequestDispatcher("estudiante-individual.jsp").forward(request, response); 
                } else {
                    request.setAttribute("noEncontrado", "true");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                break;
                
            // Desasignar una asignatura a un estudiante
            case "desasignar":
                int idEstDes = Integer.parseInt(request.getParameter("idEst"));
                int idAsgDes = Integer.parseInt(request.getParameter("idAsg"));
                estudianteSis.cambioAsignaturas(idEstDes, idAsgDes, 0);
                
                String dataAuxA = request.getParameter("data");
                String opcAuxA = request.getParameter("opc");
                
                int idB = Integer.parseInt(request.getParameter("a"));
                int identB = Integer.parseInt(request.getParameter("b"));
                String priApB = request.getParameter("c");
                
                request.setAttribute("idBus", idB+"");
                request.setAttribute("identBus", identB+"");
                request.setAttribute("priApBus", priApB);
                request.setAttribute("data", dataAuxA);
                request.setAttribute("opc", opcAuxA);
                
                request.getRequestDispatcher("estudiante-individual.jsp").forward(request, response);
                break;
                
            // Asignar una asignatura a un estudiante 
            case "registroAsignaturas":
                int idEstRegAsg = Integer.parseInt(request.getParameter("id"));
                int idAsgReg = 0;
                
                String dataAux = request.getParameter("data");
                String opcAux = request.getParameter("opc");
                boolean asignar = Boolean.parseBoolean(request.getParameter("acc"));
                
                if(asignar){
                    idAsgReg = Integer.parseInt(request.getParameter("idAsg"));
                    estudianteSis.cambioAsignaturas(idEstRegAsg, idAsgReg, 1);
                }
                request.setAttribute("id", idEstRegAsg+"");
                request.setAttribute("data", dataAux);
                request.setAttribute("opc", opcAux);
                request.getRequestDispatcher("asignar-asignatura.jsp").forward(request, response);
                break;
                
            // Redirecciona a la vista principal
            default:
                response.sendRedirect("/SistemaInstitucion");
                break;
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
