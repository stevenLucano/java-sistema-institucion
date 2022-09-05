<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <title>Asignatura | Registro</title>
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
        <div class="container mt-4 d-flex flex-column align-items-center">
            <h3 class="mb-4 text-center">REGISTRAR NUEVA ASIGNATURA</h3>
            
            <div class="col-sm-6">
                <div class="card">
                    <div class="card-body">
                        <form id="agregarForm" action="asignatura?p=registroAsg" method="POST" class="needs-validation" novalidate>
                            <div class="form-group">
                                <label for="txtNomAsg">Nombre</label>
                                <input type="text" class="form-control" id="txtNomAsg" name="txtNomAsg" required>
                            </div>
                            <div class="form-group">
                                <label for="txtTipoAsg">Tipologia</label>
                                <input type="text" class="form-control" id="txtTipoAsg" name="txtTipoAsg" required>
                            </div>
                            <div class="form-group">
                                <label for="txtCredAsg">Creditos</label>
                                <input type="number" class="form-control" id="txtCredAsg" name="txtCredAsg" required>
                            </div>
                            <button data-toggle="modal" 
                                    data-target="#addModal"
                                    type="button"
                                    class="btn btn-primary float-right"
                            >
                                Registrar
                            </button>
                            
                        </form>
                    </div>
                    <div class="card-footer">
                        <a href="asignatura?p=visualizar" class="float-right">Regresar</a>
                    </div>
                </div>    
            </div>
            
            <!-- Alerta de agregado de asignatura -->
            <%
            boolean opcModalAdd = Boolean.parseBoolean((String)request.getAttribute("modalAdd"));
            boolean errAdd = Boolean.parseBoolean((String)request.getAttribute("errAdd"));
            if(opcModalAdd || errAdd){
                if(opcModalAdd){
            %>
            <div style="width:50%" class="alert alert-success alert-dismissible fade show mt-4" role="alert">
                <strong>Se agregó la asignatura con éxito.</strong>
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <%}else{%>
            <div style="width:50%" class="alert alert-danger alert-dismissible fade show mt-4" role="alert">
                <strong>Ya existe una asignatura con el nombre dado.</strong>
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <%}}%> 
        </div>
        
        <!-- Modal Agregar -->
        <div class="modal fade" id="addModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">AGREGAR ASIGNATURA</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
                <div class="modal-body" id="textModal"><p>¿Está seguro de registrar una nueva asignatura?</p></div>
              <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Cancelar</button>
                <button type="submit" form="agregarForm" class="btn btn-info">Si</button>
              </div>
            </div>
          </div>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
        <script>
            // Example starter JavaScript for disabling form submissions if there are invalid fields
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
