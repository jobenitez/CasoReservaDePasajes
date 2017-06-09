package com.JosueBenitez.ipoo.CasoReservaDePasajes.Reserva;

import java.util.Date;

import com.JosueBenitez.ipoo.CasoReservaDePasajes.Avion.Vuelo;
import com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje.Pasaje;
import com.JosueBenitez.ipoo.CasoReservaDePasajes.Pasaje.Precio;

public class Reserva {
	
		private int id;
		private Date fechaHoraRealizacion;
		private Date fechaPago;
		private Date fechaExpiracion;
		private Cliente cliente;
		private Pasaje pasaje;
		private Vuelo vuelo;
		private Precio precioPasaje;
		
		public Reserva() {
			
		}


		public Reserva(int id, Date fechaHoraRealizacion, Date fechaPago, Date fechaExpiracion, Cliente cliente,
				Pasaje pasaje, Vuelo vuelo, Precio precioPasaje) {
			super();
			this.id = id;
			this.fechaHoraRealizacion = fechaHoraRealizacion;
			this.fechaPago = fechaPago;
			this.fechaExpiracion = fechaExpiracion;
			this.cliente = cliente;
			this.pasaje = pasaje;
			this.vuelo = vuelo;
			this.precioPasaje = precioPasaje;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public Date getFechaHoraRealizacion() {
			return fechaHoraRealizacion;
		}


		public void setFechaHoraRealizacion(Date fechaHoraRealizacion) {
			this.fechaHoraRealizacion = fechaHoraRealizacion;
		}


		public Date getFechaPago() {
			return fechaPago;
		}


		public void setFechaPago(Date fechaPago) {
			this.fechaPago = fechaPago;
		}


		public Date getFechaExpiracion() {
			return fechaExpiracion;
		}


		public void setFechaExpiracion(Date fechaExpiracion) {
			this.fechaExpiracion = fechaExpiracion;
		}


		public Cliente getCliente() {
			return cliente;
		}


		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}


		public Pasaje getPasaje() {
			return pasaje;
		}


		public void setPasaje(Pasaje pasaje) {
			this.pasaje = pasaje;
		}


		public Vuelo getVuelo() {
			return vuelo;
		}


		public void setVuelo(Vuelo vuelo) {
			this.vuelo = vuelo;
		}


		public Precio getPrecioPasaje() {
			return precioPasaje;
		}


		public void setPrecioPasaje(Precio precioPasaje) {
			this.precioPasaje = precioPasaje;
		}



	}

