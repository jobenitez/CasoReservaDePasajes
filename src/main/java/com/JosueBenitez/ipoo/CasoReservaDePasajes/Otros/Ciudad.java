package com.JosueBenitez.ipoo.CasoReservaDePasajes.Otros;

public class Ciudad {
	private int id;
	private String nombre;
	private Pais pais;
	
	public Ciudad (){

	}

	public Ciudad(int id, String nombre, Pais pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	
}

