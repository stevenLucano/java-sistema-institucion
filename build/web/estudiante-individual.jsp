<%@page import="webservice.Estudiante"%>
<%@page import="java.util.List"%>
<%@page import="webservice.Asignatura"%>
<%@page import="Modelo.EstudianteSistema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <title>Estudiante | Individual</title>
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
        EstudianteSistema estSis = new EstudianteSistema();
        int idEst = Integer.parseInt((String)request.getAttribute("idBus"));
        int identEst = Integer.parseInt((String)request.getAttribute("identBus"));
        String priApEst = (String)request.getAttribute("priApBus");

        Estudiante est = estSis.buscarEstudiante(idEst, identEst, priApEst);
        %>
        <div class="row mt-4">
            <div class="col-sm-1"></div>
            <div class="col-sm-5">
                <div class="card">
                    <div class="card-header bg-primary">
                        <h4 class="text-center text-light m-0">DATOS PERSONALES</h4>
                    </div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-sm-3 p-0"><h5 class="ml-3">ID Estudiante: </h5></div>
                            <div class="col p-0"><p class="text-left"><%=est.getIdEstudiante()%></p></div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-4 p-0"><h5 class="ml-3">Nombres:</h5></div>
                                    <div class="col p-0"><p><%=est.getNombres()%></p></div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-4 p-0"><h5 >Apellidos:</h5></div>
                                    <div class="col p-0"><p><%=est.getPApellido()%> <%=est.getSApellido()%></p></div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-5 p-0"><h5 class="ml-3">Identificación:</h5></div>
                                    <div class="col p-0"><p><%=est.getIdentificacion()%></p></div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-7 p-0"><h5 >Fecha de nacimiento:</h5></div>
                                    <div class="col p-0"><p><%=est.getNacimiento()%></p></div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-3 p-0"><h5 class="ml-3">Celular:</h5></div>
                                    <div class="col p-0"><p><%=est.getCelular()%></p></div>
                                </div>
                            </div>
                            <div class="col">
                                <div class="row">
                                    <div class="col-sm-3 p-0"><h5 >Carrera:</h5></div>
                                    <div class="col p-0"><p><%=est.getCarrera()%></p></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="card-footer bg-white">
                        <a class="text-decoration-none float-right ml-3" 
                            href="#"
                            data-toggle="modal" data-target="#deleteModal" 
                            onclick="confirmarEliminacion('<%=est.getIdEstudiante()%>','<%= est.getNombres()%> <%= est.getPApellido()%> <%= est.getSApellido()%>')"
                        >
                            <i class="bi bi-trash-fill"></i> Eliminar
                        </a>
                        <a class="text-decoration-none float-right" href="estudiante?p=actualizar&id=<%=est.getIdEstudiante()%>"><i class="bi bi-pen-fill"></i> Editar</a>
                    </div>
                </div>
            </div>
                    
            <!-- Lista de materias del estudiante -->
            <div class="col-sm-5">
                <%
                        String opc = (String)request.getAttribute("opc");
                        String data = (String)request.getAttribute("data");
                %>
                <div class="card">
                    <div class="card-header bg-primary">
                        <h4 class="text-center text-light m-0">MATERIAS ASIGNADAS</h4>
                    </div>
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th class="text-center">ID</th>
                                    <th>NOMBRE</th>
                                    <th class="text-center">TIPOLOGÍA</th>
                                    <th class="text-center">CREDITOS</th>
                                    <th class="text-center">DESASIGNAR</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                List<Asignatura> datos = estSis.verAsignaturas(est.getIdEstudiante());
                                for(Asignatura asg:datos){

                                %>
                                <tr>
                                    <td class="text-center"><%= asg.getIdAsignatura()%></td>
                                    <td><%= asg.getNombre()%></td>
                                    <td class="text-center"><%= asg.getTipo()%></td>
                                    <td class="text-center"><%= asg.getCreditos()%></td>
                                    <td class="text-center">
                                        <form id="desasignarForm<%=asg.getIdAsignatura()%>" action="estudiante?p=desasignar" method="POST">
                                            <input type="hidden" value="<%=est.getIdEstudiante()%>" name="idEst"/>
                                            <input type="hidden" value="<%=asg.getIdAsignatura()%>" name="idAsg"/>
                                            <input type="hidden" value="<%=idEst%>" name="a"/>
                                            <input type="hidden" value="<%=identEst%>" name="b"/>
                                            <input type="hidden" value="<%=priApEst%>" name="c"/>
                                            <input type="hidden" value="<%=opc%>" name="opc"/>
                                            <input type="hidden" value="<%=data%>" name="data"/>
                                            <!--button type="submit" class="btn btn-danger">
                                                <i class="bi bi-x-lg"></i>
                                            </button-->
                                            <button class="btn btn-danger"
                                                type="button"
                                                data-toggle="modal" 
                                                data-target="#desasignarModal" 
                                                onclick="mostrarMensaje('<%=asg.getIdAsignatura()%>','<%=asg.getNombre()%>')"
                                            >
                                                <i class="bi bi-x-lg"></i>
                                            </button>
                                        </form>
                                    </td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
                    </div>
                    <div class="card-footer bg-white">
                        <form action="estudiante?p=registroAsignaturas" method="POST" class="d-inline">
                            <input type="hidden" value="<%=est.getIdEstudiante()%>" name="id"/>
                            <input type="hidden" value="false" name="acc"/>
                            <input type="hidden" value="<%=opc%>" name="opc"/>
                            <input type="hidden" value="<%=data%>" name="data"/>
                            <button style="border:none;" class="btn btn-outline-primary" type="submit">Asignar nueva</button>
                        </form>
                        <form action="estudiante?p=visualizar" method="POST" class="d-inline">
                            <button style="border:none;" class="float-right btn btn-outline-primary" type="submit">Regresar</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-sm-1"></div>
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
                <a id="linkBorrar" href="estudiante?p=eliminar&id=<!--%=est.getIdEstudiante()%>" class="btn btn-info">Si</a>
              </div>
            </div>
          </div>
        </div> 
        
        <!-- Modal Desasignar asignatura -->
        <div class="modal fade" id="desasignarModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">DESASIGNAR ASIGNATURA</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
                <div class="modal-body" id="textModalDes"></div>
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
            // Cambio de url para eliminar el estudiante deseado
            const confirmarEliminacion = (id, nombre) => {
                const linkBorrar = document.getElementById("linkBorrar");
                linkBorrar.href = "estudiante?p=eliminar&id="+id;
                
                const textModal = document.getElementById("textModal");
                textModal.innerHTML = "¿Desea eliminar al estudiante <b>" + nombre + "</b>?";
            }
            
            const mostrarMensaje = (id, nombre) => {
                const btnSubmit = document.getElementById("btnSubmit");
                btnSubmit.setAttribute('form',"desasignarForm"+id);
                
                const textModal = document.getElementById("textModalDes");
                textModal.innerHTML = "¿Esta seguro de desasignar <b>" + nombre + "</b>?";
            }
        </script>
    </body>
</html>
