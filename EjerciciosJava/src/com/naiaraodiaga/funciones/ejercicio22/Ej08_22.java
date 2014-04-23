package com.naiaraodiaga.funciones.ejercicio22;

import java.util.Scanner;
import java.util.Vector;

public class Ej08_22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Introduzca un nœmero: ");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		Vector<Integer> primos = divisoresPrimos(num);
		System.out.println(primos);
	}

	public static Vector<Integer> divisoresPrimos(int num){
		Vector<Integer> primos = new Vector<Integer>();
		for(int i=0; i<=num; i++){
			if(esPrimo(i)) primos.add(i); 
		}
		return primos;
	}
	
	public static boolean esPrimo(int num){
		for(int i=(num-1); i>1; i--){
			if(num % i == 0) return false;
		}
		return true;
	}
}
