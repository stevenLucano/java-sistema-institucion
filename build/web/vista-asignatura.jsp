<%@page import="java.util.List"%>
<%@page import="webservice.Asignatura"%>
<%@page import="Modelo.AsignaturaSistema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <title>Asignatura | Vista</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-primary">
            <a class="navbar-brand" href="estudiante?p=visualizar">
                <h5 style="margin: 0" class="text-light">SISTEMA DE REGISTRO I.E</h5>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
              <ul class="navbar-nav">
                <li class="nav-item dropdown">
                  <a style="border:none;" class="dropdown-toggle btn btn-lg btn-outline-light" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
                    Estudiante
                  </a>
                  <div class="dropdown-menu">
                    <a class="dropdown-item" href="estudiante?p=visualizar">Visualizar</a>
                    <a class="dropdown-item" href="estudiante?p=registro">Registrar</a>
                  </div>
                </li>
                <li class="nav-item dropdown">
                  <a style="border:none;" class="dropdown-toggle btn btn-lg btn-outline-light" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
                    Asignatura
                  </a>
                  <div class="dropdown-menu mr-5">
                    <a class="dropdown-item" href="asignatura?p=visualizar">Visualizar</a>
                    <a class="dropdown-item" href="asignatura?p=registro">Registrar</a>
                  </div>
                </li>
              </ul>
            </div>
        </nav>
        <h3 class="m-4 text-center">LISTA DE ASIGNATURAS</h3>
        <div class="container">
            <div class="row">
                <div class="col-sm-7 d-flex align-items-center justify-content-end">
                    <h5 class="m-0">Filtrar asignatura:</h5>
                </div>
                <div class="col-sm-5">
                    <form action="asignatura?p=buscar" method="POST">
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="basic-addon3">ID Asignatura</span>
                            </div>
                            <input type="text" class="form-control" name="txtBusquedaAsg">
                            <div class="input-group-append">
                              <button class="btn btn-outline-secondary" type="submit"><i class="bi bi-search"></i></button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <%
            boolean encontrado = Boolean.parseBoolean((String)request.getAttribute("noEncontrado"));
            boolean errNum = Boolean.parseBoolean((String)request.getAttribute("errorNum"));
            if(encontrado || errNum){
            %>
            <div class="row">
                <div class="col-sm-7"></div>
                <div class="col">
                    <% if(encontrado){%>
                    <p class="m-0">No se encontró la asignatura.</p>
                    <%}else{%>
                    <p class="m-0">Solo puede ingresar números.</p>
                    <%}%>
                </div>
            </div>
            <%}%>
        </div>
        <div class="container mt-4">
            <!-- Alerta eliminación y actualización -->
            <%
                boolean opcModalDel = Boolean.parseBoolean((String)request.getAttribute("modalDelete"));
                boolean opcModalEdt = Boolean.parseBoolean((String)request.getAttribute("modalEdit"));
                if(opcModalDel || opcModalEdt){
            %>
            <div class="alert alert-success alert-dismissible fade show mt-4" role="alert">
                <%
                    if(opcModalDel){
                %>
                <strong>Se eliminó la asignatura con éxito.</strong>
                <%} else {%>
                <strong>Se actualizó la asignatura con éxito.</strong>
                <%}%>
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <%}%> 
            <div class="card">
                <div class="card-header">
                    <a href="asignatura?p=registro" class="btn btn-info">Registrar Asignatura</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th class="text-center">ID</th>
                                <th>NOMBRE</th>
                                <th class="text-center">TIPOLOGÍA</th>
                                <th class="text-center">CREDITOS</th>
                                <th class="text-center">MATRICULADOS</th>
                                <th class="text-center">ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            AsignaturaSistema asgSis = new AsignaturaSistema();
                            List<Asignatura> datos = asgSis.listarAsignaturas();
                            for(Asignatura asg: datos){
                            %>
                            <tr>
                                <td class="text-center">
                                    <form action="asignatura?p=buscar" method="POST">
                                        <input type="hidden" value="<%= asg.getIdAsignatura()%>" name="txtBusquedaAsg"/>
                                        <button style="border:none;" class="btn btn-outline-info btn-sm" type="submit"><%= asg.getIdAsignatura()%></button>
                                    </form>
                                </td>
                                <td><%= asg.getNombre()%></td>
                                <td class="text-center"><%= asg.getTipo()%></td>
                                <td class="text-center"><%= asg.getCreditos()%></td>
                                <td class="text-center"><%= asg.getMatriculados()%></td>
                                <td class="text-center">
                                    <a href="asignatura?p=actualizar&id=<%=asg.getIdAsignatura()%>" class="btn btn-info"><i class="bi bi-pen-fill"></i></a>
                                    <button class="btn btn-danger" 
                                            data-toggle="modal" data-target="#deleteModal" 
                                            onclick="confirmarEliminacion('<%=asg.getIdAsignatura()%>','<%= asg.getNombre()%>')"
                                    >
                                        <i class="bi bi-trash-fill"></i>
                                    </button>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
                        
        <!-- Modal Eliminar -->
        <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">ELIMINAR ESTUDIANTE</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body" id="textModal"></div>
              <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                <a id="linkBorrarAsg" href="#" class="btn btn-info">Si</a>
              </div>
            </div>
          </div>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        <script>
            // Cambio de url para eliminar el estudiante deseado
            const confirmarEliminacion = (id, nombre) => {
                const linkBorrar = document.getElementById("linkBorrarAsg");
                linkBorrar.href = "asignatura?p=eliminar&id="+id;
                
                const textModal = document.getElementById("textModal");
                textModal.innerHTML = "¿Desea eliminar la asignatura <b>" + nombre + "</b>?";
            }
        </script>
    </body>
</html>
