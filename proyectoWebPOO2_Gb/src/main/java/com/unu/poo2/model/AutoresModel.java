package com.unu.poo2.model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.unu.poo2.beans.Autor;

public class AutoresModel extends Conexion {

	CallableStatement cs;
	ResultSet rs;

	public List<Autor> listarAutores() throws SQLException {
		try {
			List<Autor> lista = new ArrayList<>();
			String sql = "CALL sp_listarAutores ()";
			this.abrirConexion();
			cs = Conexion.prepareCall(sql);
			rs = cs.executeQuery();
			
			while(rs.next()) {
				Autor autor = new Autor();
				autor.setCodigoAutor(rs.getInt("idautor"));;
				autor.setNombreAutor(rs.getString("nombreautor"));
				autor.setNacionalidad(rs.getString("nacionalidadautor"));
				lista.add(autor);

			}
			
			this.cerrarConexion();
			return lista;
		} catch (SQLException ex) {
			this.cerrarConexion();;
			return null;
		}
	}

}
