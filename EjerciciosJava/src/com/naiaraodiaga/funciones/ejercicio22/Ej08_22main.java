package com.naiaraodiaga.funciones.ejercicio22;

import java.util.Scanner;
import java.util.Vector;

public class Ej08_22main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduzca un nœmero: ");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		Primos primo = new Primos(num);
		Vector<Integer> divisores = primo.divisoresPrimos();
		System.out.println(divisores);
	}

}
