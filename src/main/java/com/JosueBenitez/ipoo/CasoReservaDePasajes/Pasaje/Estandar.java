package com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje;

public class Estandar extends Pasaje{
	private int id;
	private String asiendoComodo;
	private String desayuno;
	private String almuerzo;
	private String cena;
	private String mediaMaņana;
	private String mediaTarde;
	private String artMultimedia;
	private String postre;
	
	public Estandar (){

	}

	public Estandar(int id, String asiendoComodo, String desayuno, String almuerzo, String cena, String mediaMaņana,
			String mediaTarde, String artMultimedia, String postre) {
		super();
		this.id = id;
		this.asiendoComodo = asiendoComodo;
		this.desayuno = desayuno;
		this.almuerzo = almuerzo;
		this.cena = cena;
		this.mediaMaņana = mediaMaņana;
		this.mediaTarde = mediaTarde;
		this.artMultimedia = artMultimedia;
		this.postre = postre;
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

	public String getMediaMaņana() {
		return mediaMaņana;
	}

	public void setMediaMaņana(String mediaMaņana) {
		this.mediaMaņana = mediaMaņana;
	}

	public String getMediaTarde() {
		return mediaTarde;
	}

	public void setMediaTarde(String mediaTarde) {
		this.mediaTarde = mediaTarde;
	}

	public String getArtMultimedia() {
		return artMultimedia;
	}

	public void setArtMultimedia(String artMultimedia) {
		this.artMultimedia = artMultimedia;
	}

	public String getPostre() {
		return postre;
	}

	public void setPostre(String postre) {
		this.postre = postre;
	}
	
	public void obtServicios(int id, String nombre, double costo){
		
	}
	
	
}
