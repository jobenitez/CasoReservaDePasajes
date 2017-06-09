package com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje;

public class PasajeAlternativo {
	
	private int id;
	private String descuento;
	
	public PasajeAlternativo(){
		
	}

	public PasajeAlternativo(int id, String descuento) {
		super();
		this.id = id;
		this.descuento = descuento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	
}
