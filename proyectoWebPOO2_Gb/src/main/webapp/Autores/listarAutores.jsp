<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<%@ page import="com.unu.poo2.beans.Autor"%>

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
	<a type ="button" href="<%=url%>AutoresController?op=nuevo">Nuevo Autor</a>
	<table border="1">
		<thead>
			<tr>
			<th>Cod Autor</th>
			<th>Nombre Autor</th>
			<th>Cod Autor</th>
			</tr>
		</thead>

		<tbody>
			<%
			List<Autor> listaAutores = (List<Autor>) request.getAttribute("listarAutores");
			if (listaAutores != null) {
				for (Autor autor : listaAutores) {
			%>
			<tr>
				<td><%=autor.getCodigoAutor()%></td>
				<td><%=autor.getNombreAutor()%></td>
				<td><%=autor.getNacionalidad()%></td>
				<td></td>
			</tr>
			<%
			}
			} else {
			%>
			<tr>
				<td>No hay datos</td>
				<td>No hay datos</td>
				<td>No hay datos</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>