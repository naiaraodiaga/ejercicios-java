package com.naiaraodiaga.poo.ejercicio26;

public class PruebaRacional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Racional racional = new Racional(2, 3);
		racional.imprimir();

		Racional r1 = new Racional (3,4);
		r1.imprimir();
		r1.suma(racional);
		r1.imprimir();
	}

}
