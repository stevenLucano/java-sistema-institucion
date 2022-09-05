<%@page import="webservice.Estudiante"%>
<%@page import="java.util.List"%>
<%@page import="webservice.Asignatura"%>
<%@page import="Modelo.AsignaturaSistema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <style type="text/css">
            p {
                font-size: 20px;
            }
        </style>
        <title>Asignatura | Individual</title>
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
        <%
            AsignaturaSistema asgSis = new AsignaturaSistema();
            int idAsg = (Integer)request.getAttribute("idAsgBus");
            Asignatura asg = asgSis.buscarAsignatura(idAsg);
        %>
        <div class="row mt-4">
            <div class="col-sm-2"></div>
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-header bg-primary">
                        <h4 class="text-center text-light m-0">DATOS ASIGNATURA</h4>
                    </div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-sm-4 p-0"><p class="ml-3 font-weight-bold">ID Asignatura: </p></div>
                            <div class="col p-0"><p class="text-left"><%=asg.getIdAsignatura()%></p></div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-5 p-0"><p class="ml-3 font-weight-bold">Nombre:</p></div>
                                    <div class="col p-0"><p><%=asg.getNombre()%></p></div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="row d-flex align-items-center">
                                    <div class="col-sm-4 p-0"><p class="m-0 font-weight-bold">Créditos:</p></div>
                                    <div class="col p-0"><p class="m-0"><%=asg.getCreditos()%></p></div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-4 p-0"><p class="ml-3 font-weight-bold">Matriculados:</p></div>
                                    <div class="col p-0"><p><%=asg.getMatriculados()%></p></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="card-footer bg-white">
                        <a class="text-decoration-none float-right ml-3" 
                            href="#"
                            data-toggle="modal" data-target="#deleteModal" 
                            onclick="confirmarEliminacion('<%=asg.getIdAsignatura()%>','<%= asg.getNombre()%>')"
                        >
                            <i class="bi bi-trash-fill"></i> Eliminar
                        </a>
                        <a class="text-decoration-none float-right" href="asignatura?p=actualizar&id=<%=asg.getIdAsignatura()%>"><i class="bi bi-pen-fill"></i> Editar</a>
                    </div>
                </div>
            </div>
                    
            <!-- Lista estudiantes asignados -->
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-header bg-primary">
                        <h4 class="text-center text-light m-0">ESTUDIANTES ASIGNADOS</h4>
                    </div>
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th class="text-center">ID</th>
                                    <th>NOMBRES</th>
                                    <th class="text-center">CARRERA</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                List<Estudiante> datos = asgSis.verEstudiantes(idAsg);
                                for(Estudiante est:datos){

                                %>
                                <tr>
                                    <td class="text-center"><%= est.getIdEstudiante()%></td>
                                    <td><%= est.getPApellido()%> <%= est.getSApellido()%> <%= est.getNombres()%></td>
                                    <td class="text-center"><%= est.getCarrera()%></td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
                    </div>
                    <div class="card-footer bg-white">
                        <a class="float-right text-decoration-none" href="asignatura?p=visualizar">Regresar</a>
                    </div>
                </div>
            </div>
            <div class="col-sm-2"></div>
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
