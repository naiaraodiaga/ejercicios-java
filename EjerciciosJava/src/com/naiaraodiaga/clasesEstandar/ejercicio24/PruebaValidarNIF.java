package com.naiaraodiaga.clasesEstandar.ejercicio24;

import java.util.Scanner;

public class PruebaValidarNIF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nif = "";

		
		System.out.println("Introduzca un NIF v�lido: ");
		Scanner entrada = new Scanner(System.in);
		nif = entrada.next();
		
		System.out.println("\nVALIDADOR INSTANCIADO");
		ValidarNIF validador = new ValidarNIF(nif);
		validador.comprobarNif();

		System.out.println("\nVALIDADOR SIN INSTANCIAR (ABSTRACT & M�TODOS EST�TICOS)");
		OtroValidadorNIF.comprobarNif(nif);
	}

}
