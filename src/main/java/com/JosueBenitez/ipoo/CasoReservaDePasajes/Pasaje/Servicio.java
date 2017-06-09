package com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje;

public class Servicio {
	private int id;
	private String nombre;
	private double costo;

	
	
	public Servicio(int id, String nombre, double costo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.costo = costo;
	}



	public Servicio() {
		// TODO Auto-generated constructor stub
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



	public double getCosto() {
		return costo;
	}



	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	

}
