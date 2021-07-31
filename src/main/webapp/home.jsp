<%@page import="model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    HttpSession loginSession = request.getSession();
    String estado = (String) loginSession.getAttribute("estado");
    int tipoUsuario = -1;
    Usuario usuario = null;
    if(estado == "true"){
    	usuario = (Usuario) loginSession.getAttribute("usuario");
        tipoUsuario = (int) loginSession.getAttribute("tipoUsuario");
    }
    
    %>
<!DOCTYPE html>
<html >

<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<%@ include file="/WEB-INF/fragmentos/header_meta.jspf" %>
</head>

<body ng-app="app">
<%if(estado == "true"){ %>
	<nav class="navbar navbar-dark bg-info m-1 rounded">
	  <div class="container-fluid">
	    <span class="navbar-brand p-3 mb-0 h1">☀️SunSet !Hola <%=usuario.getNombre() %>! </span>
	    <div class="float-end">
	    	<a href="LogoutController" class="btn btn-primary">Cerrar sesión</a>
	    </div>
	  </div>
	</nav>
	<%if(tipoUsuario == 0) {%>
		<%@ include file="/WEB-INF/fragmentos/view/view_cliente.jspf" %>
	<%}else{%>
		<%@ include file="/WEB-INF/fragmentos/view/view_trabajador.jspf" %>
	<%} %>
	
<%} else{%>
<script>
  	location.href = "index.jsp";
</script>
<%} %>
<%@ include file="/WEB-INF/fragmentos/footer_meta.jspf" %>
</body>
</html>
