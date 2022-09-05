package Modelo;

import webservice.Asignatura;

/**
 *
 * @author Steven
 */
public class AsignaturaSistema {

    public AsignaturaSistema() {
    }

    public java.util.List<webservice.Asignatura> listarAsignaturas() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarAsignaturas();
    }

    public String agregarAsignatura(java.lang.String nombre, java.lang.String tipo, int cred, int matri) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.agregarAsignatura(nombre, tipo, cred, matri);
    }

    public String actualizarAsignatura(int id, java.lang.String nombre, java.lang.String tipo, int cred, int matri) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizarAsignatura(id, nombre, tipo, cred, matri);
    }

    public String eliminarAsignatura(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.eliminarAsignatura(id);
    }

    public Asignatura buscarAsignatura(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.buscarAsignatura(id);
    }

    public java.util.List<webservice.Estudiante> verEstudiantes(int idAsg) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.verEstudiantes(idAsg);
    }
}
