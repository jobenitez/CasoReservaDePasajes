package com.JosueBenitez.ipoo.CasoReservaDePasajes.Reserva;

import java.util.Date;

public class Cliente {
	private int id;
	private String nombre;
	private Date fechaNac;
	private String nacionalidad;
	private String tipoDoc;
	private String nroDoc;
	private String email;
	private String direcion;
	private int pasaporte;
	private String password;
	
	public Cliente (){

	}

	public Cliente(int id, String nombre, Date fechaNac, String nacionalidad, String tipoDoc, String nroDoc,
			String email, String direcion, int pasaporte, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.email = email;
		this.direcion = direcion;
		this.pasaporte = pasaporte;
		this.password = password;
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

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public int getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
