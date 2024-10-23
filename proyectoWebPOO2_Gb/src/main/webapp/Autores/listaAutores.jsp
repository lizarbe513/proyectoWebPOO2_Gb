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
	<table border="1">
		<thead>
			<th>Cod Autor</th>
			<th>Nombre Autor</th>
			<th>Cod Autor</th>
		</thead>
	</table>
	<tbody>
		<%
		List<Autor> listaAutores = (List<Autor>) request.getAttribute("listaAutores");
		if (listaAutores != null) {
			for (Autor autor : listaAutores) {
		%>
		<tr>
			<td><%=autor.getNacionalidad()%></td>
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
			<td></td>
		</tr>
		<%
		}
		%>
	</tbody>
</body>
</html>