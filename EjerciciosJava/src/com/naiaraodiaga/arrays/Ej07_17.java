package com.naiaraodiaga.arrays;

import java.util.Arrays;

public class Ej07_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 5;
		int []array = new int[size]; 
		int contaIguales = 0;
		
		for(int i = 0 ; i < size; i++){
			array[i] = (int) (10*Math.random()+1);
			System.out.print(array[i] + "\t");
		}
		for(int i = 0; i < size / 2; i++){
			if(array[i] == array[(size-1)-i]) contaIguales++;
		}
		System.out.println("Array: "+ Arrays.toString(array));
		if(contaIguales == size / 2) System.out.println("\nEl array es capicœa");
		else System.out.println("\nEl array no es capicœa");
	}

}
