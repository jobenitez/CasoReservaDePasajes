package com.JosueBenitez.ipoo.CasoReservaDePasajes.Avion;

public class TipoAvion {
	private int id;
	private String descripcion;
	private double importeMinimoRentable;
	private Asiento asiento = new Asiento();
	
	public TipoAvion (){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporteMinimoRentable() {
		return importeMinimoRentable;
	}

	public void setImporteMinimoRentable(double importeMinimoRentable) {
		this.importeMinimoRentable = importeMinimoRentable;
	}

	public Asiento getAsiento() {
		return asiento;
	}

	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
}

	
	
