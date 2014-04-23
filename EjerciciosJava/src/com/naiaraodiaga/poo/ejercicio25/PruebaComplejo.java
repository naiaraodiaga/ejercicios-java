package com.naiaraodiaga.poo.ejercicio25;

public class PruebaComplejo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Complejo complejo = new Complejo();
		complejo.asignar(2, 7);
		complejo.imprimir();
		
		Complejo complejo1 = new Complejo(3.2, 4.1);
		Complejo complejo2 = new Complejo(5.6, 7.8);
		complejo1.sumar(complejo2);
		complejo1.imprimir();
		
		Complejo complejo3 = new Complejo(3.2, 4.1);
		Complejo complejo4 = new Complejo(5.6, 7.8);
		Complejo suma = Complejo.sumar(complejo3, complejo4);
		suma.imprimir();
		
		
		System.out.println("("+complejo1.getpReal() +","+complejo1.getpImag()+") y ("+ suma.getpReal() +","+suma.getpImag() + ") son iguales? " +complejo1.equals(suma));
		System.out.println("Contador: "+Complejo.getContador());
	}

}
