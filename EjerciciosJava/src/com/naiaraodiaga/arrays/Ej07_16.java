package com.naiaraodiaga.arrays;

import java.util.Scanner;

public class Ej07_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 10;
		int []array = new int[size]; 
		int menor = Integer.MAX_VALUE, mayor = Integer.MIN_VALUE;
		
		
		for(int i = 0 ; i < size; i++){
			array[i] = (int) (100*Math.random()+1);
			if(menor > array[i]) menor = array[i];
			if(mayor < array[i]) mayor = array[i];
			System.out.print(array[i] + "\t");
		}
		System.out.println("\nEl mayor es: "+mayor);
		System.out.println("El menor es: "+menor);
	}

}
