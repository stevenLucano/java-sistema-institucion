<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.EstudianteSistema"%>
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
        <title>Estudiante | Asignación asignaturas</title>
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
        <h3 class="m-4 text-center">ASIGNACIÓN DE ASIGNATURAS</h3>
        <!--div class="container">
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
        </div-->
        <div class="container mt-4">
            <%
                String opc = (String)request.getAttribute("opc");
                String dataStr = (String)request.getAttribute("data");
            %>
            <div class="card">
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th class="text-center">ID</th>
                                <th>NOMBRE</th>
                                <th class="text-center">TIPOLOGÍA</th>
                                <th class="text-center">CREDITOS</th>
                                <th class="text-center">ASIGNAR</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            AsignaturaSistema asgSis = new AsignaturaSistema();
                            EstudianteSistema estSis = new EstudianteSistema();
                            
                            List<Asignatura> datos = asgSis.listarAsignaturas();
                            int idEst = Integer.parseInt((String)request.getAttribute("id"));
                            
                            List<Asignatura> asignadas = estSis.verAsignaturas(idEst);
                            
                            List<Integer> asignadasId = new ArrayList();
                            for(Asignatura asg: asignadas){
                                asignadasId.add(asg.getIdAsignatura());
                            }
                            
                            for(Asignatura asg: datos){
                            %>
                            <tr>
                                <td class="text-center"><%= asg.getIdAsignatura()%></td>
                                <td><%= asg.getNombre()%></td>
                                <td class="text-center"><%= asg.getTipo()%></td>
                                <td class="text-center"><%= asg.getCreditos()%></td>
                                <td class="text-center">
                                    <form id="asignarForm<%=asg.getIdAsignatura()%>" action="estudiante?p=registroAsignaturas" method="POST">
                                        <%if(asignadasId.contains(asg.getIdAsignatura())){%>
                                        <button class="btn btn-secondary" disabled><i class="bi bi-check-lg"></i></button>
                                        <%} else {%>
                                        <input type="hidden" value="<%=idEst%>" name="id" />
                                        <input type="hidden" value="<%=asg.getIdAsignatura()%>" name="idAsg" />
                                        <input type="hidden" value="true" name="acc"/>
                                        <input type="hidden" value="<%=opc%>" name="opc"/>
                                        <input type="hidden" value="<%=dataStr%>" name="data"/>
                                        <button class="btn btn-success"
                                                type="button"
                                                data-toggle="modal" 
                                                data-target="#asignarModal" 
                                                onclick="mostrarMensaje('<%=asg.getIdAsignatura()%>','<%=asg.getNombre()%>')"
                                        >
                                            <i class="bi bi-check-lg"></i>
                                        </button>
                                        <%}%>
                                    </form>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
                <div class="card-footer">
                        <form action="estudiante?p=buscar" method="POST">
                            <input type="hidden" value="<%=opc%>" name="selector"/>
                            <input type="hidden" value="<%=dataStr%>" name="txtBusquedaEst"/>
                            <button style="border:none;" class="float-right btn btn-outline-primary" type="submit">Regresar</button>
                        </form>
                </div>
            </div>
        </div>
                            
        <!-- Modal Asignar asignatura -->
        <div class="modal fade" id="asignarModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">ASIGNAR ASIGNATURA</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
                <div class="modal-body" id="textModal"></div>
              <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                <button id="btnSubmit" type="submit" class="btn btn-info">Si</button>
              </div>
            </div>
          </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        <script>
            const mostrarMensaje = (id, nombre) => {
                const btnSubmit = document.getElementById("btnSubmit");
                btnSubmit.setAttribute('form',"asignarForm"+id);
                
                const textModal = document.getElementById("textModal");
                textModal.innerHTML = "¿Esta seguro de asignar <b>" + nombre + "</b>?";
            }
        </script>
    </body>
</html>
