package com.unu.poo2.beans;

public class Autor {
	private int codigoAutor;
	private String nacionalidad;
	private String nombreAutor;
	
	public Autor() {
		super();
	}

	public Autor(int codigoAutor, String nacionalidad, String nombreAutor) {
		this.codigoAutor = codigoAutor;
		this.nacionalidad = nacionalidad;
		this.nombreAutor = nombreAutor;
	}
	
	public int getCodigoAutor() {
		return codigoAutor;
	}
	
	public void setCodigoAutor(int codigoAutor) {
		this.codigoAutor = codigoAutor;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombreAutor() {
		return nombreAutor;
	}
	
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	
}
