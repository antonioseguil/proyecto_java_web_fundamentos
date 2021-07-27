<%@page import="model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    HttpSession loginSession = request.getSession();
    Usuario usuario = (Usuario) loginSession.getAttribute("usuario");
    int tipoUsuario = (int) loginSession.getAttribute("tipoUsuario");
    String estado = (String) loginSession.getAttribute("estado");
    %>
<!DOCTYPE html>
<html ng-app="app">

<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<%@ include file="/WEB-INF/fragmentos/header_meta.jspf" %>
</head>

<body>
<nav class="navbar navbar-dark bg-info m-1 rounded">
  <div class="container-fluid">
    <span class="navbar-brand p-3 mb-0 h1">☀️SunSet !Hola <%=usuario.getNombre() %>! </span>
  </div>
</nav>

<%if(tipoUsuario == 0) {%>
	<%@ include file="/WEB-INF/fragmentos/view/view_cliente.jspf" %>
<%} else{%>
	<%@ include file="/WEB-INF/fragmentos/view/view_trabajador.jspf" %>
<%} %>


<%@ include file="/WEB-INF/fragmentos/footer_meta.jspf" %>
</body>
<%if(estado == null){ %>
<script>
 	location.href = "index.jsp";
</script>
<%} %>
</html>
