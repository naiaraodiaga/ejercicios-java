package com.naiaraodiaga.arrays;

import java.util.Arrays;

public class Ej07_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		int [] array1, array2, array3;
		array1 = new int[size];
		array2 = new int[size];
		for(int i = 0 ; i < size; i++){
			array1[i] = (int) (10*Math.random()+1);
			array2[i] = (int) (10*Math.random()+1);
		}
		array3 = new int[array1.length + array2.length];
		for(int i = 0; i< size; i++){
			array3[i] = array1[i];
		}
		for(int j = 5, i=0; j < (2 * size) && i < size; j++, i++){
				array3[j] = array2[i];	
		}
		System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		System.out.println("Array 3: "+Arrays.toString(array3));
	}

}
