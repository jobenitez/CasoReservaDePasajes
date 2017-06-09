package com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje;

public class Economico extends Pasaje{
	private int id;
	private String asiendoComodo;
	private String desayuno;
	private String almuerzo;
	private String cena;
	
	public Economico(){

	}

	public Economico(int id, String asiendoComodo, String desayuno, String almuerzo, String cena) {
		super();
		this.id = id;
		this.asiendoComodo = asiendoComodo;
		this.desayuno = desayuno;
		this.almuerzo = almuerzo;
		this.cena = cena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsiendoComodo() {
		return asiendoComodo;
	}

	public void setAsiendoComodo(String asiendoComodo) {
		this.asiendoComodo = asiendoComodo;
	}

	public String getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}

	public String getAlmuerzo() {
		return almuerzo;
	}

	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}
	
}

