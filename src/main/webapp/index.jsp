<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> -->
<%
HttpSession sesion = request.getSession();
String estado = (String) sesion.getAttribute("estado");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Login</title>
    <%@ include file="/WEB-INF/fragmentos/header_meta.jspf" %>
  </head>
  <body>
    <!-- formulario de login -->

    <div class="container">
      <div class="row">
        <div class="col-7 p-5 mt-5">
          <figure class="figure">
            <img
              src="img/undraw_wine_tasting_30vw.svg"
              class="figure-img img-fluid rounded"
            />
            <figcaption class="figure-caption">sunset...</figcaption>
          </figure>
        </div>
        <div class="col-4 mt-5 p-5">
          <form class="row" action="LoginController" method="post">
          	
            <div class="col-12">
              <p class="h3 text-center">Iniciar sesión</p>
            </div>
            
            <% String error = (String) request.getAttribute("error"); %>
            <%if(error != null){ %>
            <div class="alert alert-danger alert-dismissible fade show" role="alert">
			  <p>Usuario o contraseña erroneas, por favor revise sus credenciales.</p>
			  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
			</div>
            <%} %>
			
            <div class="col-12 mt-2">
              <div class="form-floating mb-3">
                <input
                  name="txtUsuario"
                  id="txtUsuario"
                  type="text"
                  class="form-control"
                  placeholder="Usuario"
                  required
                />
                <label for="txtUsuario">Usuario:</label>
              </div>
            </div>
            <div class="col-12 mt-2">
              <div class="form-floating mb-3">
                <input
                  id="txtPassword"
                  name="txtPassword"
                  type="password"
                  class="form-control"
                  placeholder="password"
                  required
                />
                <label for="txtPassword">Contraseña:</label>
              </div>
            </div>
            <div class="col-12 mt-3 d-grid">
              <button type="submit" class="btn btn-success btn-block">
                Ingresar
              </button>
            </div>
            
          </form>
        </div>
      </div>
    </div>
    
	<%if(estado == "true"){ %>
	<script>
	location.href = "home.jsp";
	</script>
	<%} %>
    <%@ include file="/WEB-INF/fragmentos/footer_meta.jspf" %>
  </body>
</html>
