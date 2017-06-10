package com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje;

import com.JosueBenitez.ipoo.CasoReservaDePasajes.Otros.Empresa;

public class Pasaje {
	private int id;
	private int precio;
	private Servicio servicio = new Servicio();
	private Empresa empresa;
	private Precio precioPasaje = new Precio();
	private PasajeAlternativo pasajeAlternativo = new PasajeAlternativo();
	
	
	public Pasaje (){

	}


	public Pasaje(int id, int precio, Servicio servicio, Empresa empresa, Precio precioPasaje,
			PasajeAlternativo pasajeAlternativo) {
		super();
		this.id = id;
		this.precio = precio;
		this.servicio = servicio;
		this.empresa = empresa;
		this.precioPasaje = precioPasaje;
		this.pasajeAlternativo = pasajeAlternativo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public Servicio getServicio() {
		return servicio;
	}


	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}


	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public Precio getPrecioPasaje() {
		return precioPasaje;
	}


	public void setPrecioPasaje(Precio precioPasaje) {
		this.precioPasaje = precioPasaje;
	}


	public PasajeAlternativo getPasajeAlternativo() {
		return pasajeAlternativo;
	}


	public void setPasajeAlternativo(PasajeAlternativo pasajeAlternativo) {
		this.pasajeAlternativo = pasajeAlternativo;
	}

	public void obtServicios(int id, String nombre, double costo){
		
	}   
}


