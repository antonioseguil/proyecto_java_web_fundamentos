<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> -->
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Login</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="css/main.css" />
  </head>
  <body>
    <!-- formulario de login -->

    <div class="container">
      <div class="row">
        <div class="col-7 p-5 mt-5">
          <figure class="figure">
            <img
              src="img/undraw_wine_tasting_30vw.svg"
              alt="fondo"
              class="figure-img img-fluid rounded"
            />
            <figcaption class="figure-caption">sunset...</figcaption>
          </figure>
        </div>
        <div class="col-4 mt-5 p-5">
          <form class="row" action="home.jsp">
            <div class="col-12">
              <p class="h3 text-center">Iniciar sesión</p>
            </div>
            <div class="col-12 mt-2">
              <div class="form-floating mb-3">
                <input
                  name="txtUsuario"
                  id="txtUsuario"
                  type="text"
                  class="form-control"
                  placeholder="Usuario"
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

    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
      integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
      integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
