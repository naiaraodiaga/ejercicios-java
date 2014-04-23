package com.naiaraodiaga.funciones.ejercicio22;

import java.util.Vector;

public class Primos {

	public Vector<Integer> divisoresPrimos(int num){
		Vector<Integer> primos = new Vector<Integer>();
		for(int i=0; i<=num; i++){
			if(esPrimo(i)) primos.add(i); 
		}
		return primos;
	}
	
	public boolean esPrimo(int num){
		for(int i=(num-1); i>1; i--){
			if(num % i == 0) return false;
		}
		return true;
	}
}
