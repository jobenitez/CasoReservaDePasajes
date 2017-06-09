package com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje;

public class Ejecutivo extends Pasaje{
	private int id;
	private String asientoEejecutivo;
	private String filaAccesoEspecial;
	private String desayuno;
	private String almuerzo;
	private String cena;
	private String mediaMañana;
	private String mediaTarde;
	private String postrePremiun;
	private String bebidas;
	private String artMultimedia;
	
	public Ejecutivo (){

	}

	public Ejecutivo(int id, String asientoEejecutivo, String filaAccesoEspecial, String desayuno, String almuerzo,
			String cena, String mediaMañana, String mediaTarde, String postrePremiun, String bebidas,
			String artMultimedia) {
		super();
		this.id = id;
		this.asientoEejecutivo = asientoEejecutivo;
		this.filaAccesoEspecial = filaAccesoEspecial;
		this.desayuno = desayuno;
		this.almuerzo = almuerzo;
		this.cena = cena;
		this.mediaMañana = mediaMañana;
		this.mediaTarde = mediaTarde;
		this.postrePremiun = postrePremiun;
		this.bebidas = bebidas;
		this.artMultimedia = artMultimedia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAsientoEejecutivo() {
		return asientoEejecutivo;
	}

	public void setAsientoEejecutivo(String asientoEejecutivo) {
		this.asientoEejecutivo = asientoEejecutivo;
	}

	public String getFilaAccesoEspecial() {
		return filaAccesoEspecial;
	}

	public void setFilaAccesoEspecial(String filaAccesoEspecial) {
		this.filaAccesoEspecial = filaAccesoEspecial;
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

	public String getMediaMañana() {
		return mediaMañana;
	}

	public void setMediaMañana(String mediaMañana) {
		this.mediaMañana = mediaMañana;
	}

	public String getMediaTarde() {
		return mediaTarde;
	}

	public void setMediaTarde(String mediaTarde) {
		this.mediaTarde = mediaTarde;
	}

	public String getPostrePremiun() {
		return postrePremiun;
	}

	public void setPostrePremiun(String postrePremiun) {
		this.postrePremiun = postrePremiun;
	}

	public String getBebidas() {
		return bebidas;
	}

	public void setBebidas(String bebidas) {
		this.bebidas = bebidas;
	}

	public String getArtMultimedia() {
		return artMultimedia;
	}

	public void setArtMultimedia(String artMultimedia) {
		this.artMultimedia = artMultimedia;
	}
	
}

