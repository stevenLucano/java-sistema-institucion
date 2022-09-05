package Modelo;

import webservice.Estudiante;

/**
 *
 * @author Steven
 */
public class EstudianteSistema {

    public EstudianteSistema() {
    }

    public java.util.List<webservice.Estudiante> listarEstudiantes() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarEstudiantes();
    }

    public String agregarEstudiante(java.lang.String ident, java.lang.String nom, java.lang.String pApe, java.lang.String sApe, java.lang.String nac, java.lang.String cel, java.lang.String carr) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.agregarEstudiante(ident, nom, pApe, sApe, nac, cel, carr);
    }

    public String actualizarEstudiante(int id, java.lang.String ident, java.lang.String nom, java.lang.String pApe, java.lang.String sApe, java.lang.String nac, java.lang.String cel, java.lang.String carr) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizarEstudiante(id, ident, nom, pApe, sApe, nac, cel, carr);
    }

    public String eliminarEstudiante(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.eliminarEstudiante(id);
    }

    public Estudiante buscarEstudiante(int id, int ident, java.lang.String pApe) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.buscarEstudiante(id, ident, pApe);
    }

    public java.util.List<webservice.Asignatura> verAsignaturas(int idEst) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.verAsignaturas(idEst);
    }

    public String cambioAsignaturas(int idEst, int idAsg, int acc) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.cambioAsignaturas(idEst, idAsg, acc);
    }
}
