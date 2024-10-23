<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String url = "http://localhost:8080/proyectoWebPOO2_Gb/";
	%>
	<h3>Nuevo Autor</h3>
	<form role="form" action="<%=url %>AutoresController" method="POST">
		<input type="hidden" name="op" value="insertar">
		Nombre del Autor: <input type="text" name="nombre" id="insertar"/><br>
		Nacionalidad : <input type="text" name="nacionalidad" id="insertar"/><br>
		
		<input type="submit" value="Guardar">
		<a href ="<%=url %>AutoresController?op=listar">volver</a>
	 </form>
</body>
</html>