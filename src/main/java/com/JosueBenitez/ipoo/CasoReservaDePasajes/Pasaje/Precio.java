package com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje;

import java.util.Date;


public class Precio {
	private int id;
	private int precio;
	private Date fecha;
	
	public Precio (){

	}

	public Precio(int id, int precio, Date fecha) {
		super();
		this.id = id;
		this.precio = precio;
		this.fecha = fecha;
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
}
