package com.JosueBenitez.ipoo.CasoReservaDePasajes.Avion;

public class Asiento {

		private int id;
		private String tipo;
		
		public Asiento (){

		}

		public Asiento(int id, String tipo) {
			super();
			this.id = id;
			this.tipo = tipo;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}


}
