package com.JosueBenitez.ipoo.CasoReservaDePasajes.Avion;

import java.util.Date;

import com.JosueBenitez.ipoo.CasoReservaDePasajes.Otros.Ciudad;
import com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje.Pasaje;

public class Vuelo {
	private int id;
	private Date fechaVuelo;
	private Date fechaLlegada;
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private Avion avion;
	private Pasaje pasaje = new Pasaje();
	
	public Vuelo(){
		
	}

	public Vuelo(int id, Date fechaVuelo, Date fechaLlegada, Ciudad ciudadOrigen, Ciudad ciudadDestino, Avion avion, Pasaje pasaje) {
		super();
		this.id = id;
		this.fechaVuelo = fechaVuelo;
		this.fechaLlegada = fechaLlegada;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.avion = avion;
		this.pasaje = pasaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(Pasaje pasaje) {
		this.pasaje = pasaje;
	}

	
}
