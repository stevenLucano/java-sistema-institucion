<%@page import="webservice.Estudiante"%>
<%@page import="Modelo.EstudianteSistema"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <title>Estudiante | Actualización</title>
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
        
        <!-- Formulario para actualizar los datos del estudiante -->
        <div class="container mt-4 d-flex flex-column align-items-center">
            <h3 class="mb-4 text-center">ACTUALIZAR ESTUDIANTE</h3>
            <div class="card col-sm-8 p-0">
                <div class="card-body">
                    <form id="actualizarForm" action="estudiante?p=actualizarEst" method="POST" class="needs-validation" novalidate>
                        <%
                            int id = Integer.parseInt((String)request.getAttribute("idEst"));
                            EstudianteSistema estudiante = new EstudianteSistema();
                            Estudiante est = estudiante.buscarEstudiante(id,0,"");
                        %>
                        <div class="row mb-2">
                            <div class="col">
                                <label for="txtIdEstAc">ID</label>
                                <input type="text" class="form-control" id="txtIdEstAc" name="txtIdEstAc" value="<%=est.getIdEstudiante()%>" readonly>
                            </div>
                            <div class="col">
                                <label for="txtNomEstAc">Nombres</label>
                                <input type="text" class="form-control" id="txtNomEstAc" name="txtNomEstAc" value="<%=est.getNombres()%>" required>
                            </div>
                        </div>
                        <div class="row mb-2">
                            <div class="col">
                                <label for="txtPriApAc">Primer Apellido</label>
                                <input type="text" class="form-control" id="txtPriApAc" name="txtPriApAc" value="<%=est.getPApellido()%>" required>
                            </div>
                            <div class="col">
                                <label for="txtSegApAc">Segundo Apellido</label>
                                <input type="text" class="form-control" id="txtSegApAc" name="txtSegApAc" value="<%=est.getSApellido()%>">
                            </div>
                        </div>
                        <div class="row mb-2">
                            <div class="col">
                                <label for="txtIdenEstAc">Número de identificación</label>
                                <input type="number" class="form-control" id="txtIdenEstAc" name="txtIdenEstAc" value="<%=est.getIdentificacion()%>" aria-describedby="idenHelp" required>
                                <small id="idenHelp" class="form-text text-muted">Digite el número sin puntos, ni comas</small>
                            </div>
                            <div class="col">
                                <label for="txtNacEstAc">Fecha de nacimiento</label>
                                <input type="date" class="form-control" id="txtNacEstAc" value="<%=est.getNacimiento()%>" name="txtNacEstAc" required>
                            </div>
                        </div>
                        <div class="row mb-2">
                            <div class="col">
                                <label for="txtCelEstAc">Celular</label>
                                <input type="text" class="form-control" id="txtCelEstAc" value="<%=est.getCelular()%>" name="txtCelEstAc" required>
                            </div>
                            <div class="col">
                                <label for="txtCarrEstAc">Carrera</label>
                                <input type="text" class="form-control" id="txtCarrEstAc" value="<%=est.getCarrera()%>" name="txtCarrEstAc" required>
                            </div>
                        </div>
                        <div class="justify-content-end">
                            <button class="btn btn-primary"
                                    data-toggle="modal" 
                                    data-target="#editModal"
                                    type="button"
                            >
                                Actualizar
                            </button>
                        </div>
                    </form>
                </div>
                <div class="card-footer">
                    <a href="estudiante?p=visualizar">Cancelar</a>
                </div>
            </div>
        </div>
                            
        <!-- Modal Actualizar -->
        <div class="modal fade" id="editModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">ACTUALIZAR ESTUDIANTE</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
                <div class="modal-body" id="textModal"><p>¿Está seguro de actualizar los datos del estudiante?</p></div>
              <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                <!--a id="linkBorrar" href="estudiante?p=eliminar&id=<!--%=est.getIdEstudiante()%>" class="btn btn-info">Si</a-->
                <button type="submit" form="actualizarForm" class="btn btn-info">Si</button>
              </div>
            </div>
          </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        <script>
            // Validación de formularios (Bootstrap)
            (function() {
              'use strict';
              window.addEventListener('load', function() {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                let forms = document.getElementsByClassName('needs-validation');
                // Loop over them and prevent submission
                let validation = Array.prototype.filter.call(forms, function(form) {
                  form.addEventListener('submit', function(event) {
                    if (form.checkValidity() === false) {
                      event.preventDefault();
                      event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                  }, false);
                });
              }, false);
            })();
        </script>
    </body>
</html>
