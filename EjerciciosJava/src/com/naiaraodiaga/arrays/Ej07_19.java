package com.naiaraodiaga.arrays;

import java.util.Arrays;

public class Ej07_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size1 = 3, size2 = 5;
		int [] array1, array2, array3;
		array1 = new int[size1];
		array2 = new int[size2];
		for(int i = 0 ; i < size1; i++){
			array1[i] = (int) (10*Math.random()+1);
		}
		for(int i = 0 ; i < size2; i++){
			array2[i] = (int) (10*Math.random()+1);
		}
		System.out.println("Array 1: "+Arrays.toString(array1));
		System.out.println("Array 2: "+Arrays.toString(array2));
		if(size1 > size2){
			array3 = new int[size1];
			array3 = array1;
			for(int i = 0; i< size2; i++){
				array3[i] = array3[i]+array2[i];
			}
		} 
		else {
			array3 = new int[size2];
			array3 = array2;
			for(int i=0; i<size1; i++){
				array3[i] = array3[i]+array1[i];
			}
		}
		
		
		System.out.println("Array 3: "+Arrays.toString(array3));
	}

}
