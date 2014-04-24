package com.naiaraodiaga.clasesEstandar.ejercicio24;

import java.util.Scanner;

public class PruebaValidarNIF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nif = "";
		
		while(nif.length() != 9){
			System.out.println("Introduzca un NIF v‡lido: ");
			Scanner entrada = new Scanner (System.in);
			nif = entrada.next();
		}
		ValidarNIF validador = new ValidarNIF(nif);
		validador.comprobarNif();
		
	}

}
