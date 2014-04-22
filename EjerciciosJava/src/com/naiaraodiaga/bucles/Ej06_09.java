package com.naiaraodiaga.bucles;

import java.util.Scanner;

public class Ej06_09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num, resultado;

		System.out.println("Introduzca un nœmero: ");
		Scanner entrada = new Scanner(System.in);
		resultado = entrada.nextInt();
		num = resultado - 1;

		for(int i = num; i>0 ; i--){
			resultado = resultado * i;
		}
		System.out.println("El factorial es: "+resultado);
	}

}
