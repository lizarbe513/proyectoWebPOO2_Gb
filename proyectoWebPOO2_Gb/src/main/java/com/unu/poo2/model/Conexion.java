package com.unu.poo2.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	private String url = "jdbc:mysql://localhost:3306/bibliotecapoo2";
	private String usuario="root";
	private String contrasena="123456";
	protected Connection Conexion;

	public void abrirConexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Conexion = DriverManager.getConnection(url, usuario, contrasena);
			System.out.println("CONEXION EXITOSA");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cerrarConexion () {
		try {
			if(Conexion != null && !Conexion.isClosed()) {
				Conexion.close();
				System.out.println("CONEXION CERRADA");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
