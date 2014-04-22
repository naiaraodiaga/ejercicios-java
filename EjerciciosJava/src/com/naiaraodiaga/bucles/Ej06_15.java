package com.naiaraodiaga.bucles;

import java.util.Scanner;

public class Ej06_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int intentos = 0, num;
		int numAleatorio  = (int) (100*Math.random()+1);
		boolean hasAcertado = false;
		while(intentos < 5 && !hasAcertado){
			System.out.println("Introduzca un n�mero: ");
			Scanner entrada = new Scanner (System.in);
			num = entrada.nextInt();
			if(num == numAleatorio){
				hasAcertado = true;
			} 
			else{
				if(num < numAleatorio) System.out.println("El n�mero que buscamos es mayor");
				else System.out.println("El n�mero que buscamos es menor");
			}
			intentos++;
		}
		if(hasAcertado){
			System.out.println("Enhorabuena! Has acertado el n�mero");
		}
		else{
			System.out.println("Oooooh mala suerte! \nEl n�mero que busc�bamos era el "+numAleatorio+" \nOtra vez ser�...");
		} 
		
		
		
	}

}
