package com.naiaraodiaga.basicos;

import java.util.Scanner;

public class Ej04_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int radio;
		double volumen, superficie;

		System.out.println("Introduzca el radio de la esfera: ");
		Scanner entrada = new Scanner(System.in);
		radio = entrada.nextInt();

		volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
		superficie = 4 * Math.PI * Math.pow(radio, 2);
		
		System.out.println("El volumen de la esfera es: " + volumen);
		System.out.println("La superficie de la esfera es: " + superficie);
	}

}
