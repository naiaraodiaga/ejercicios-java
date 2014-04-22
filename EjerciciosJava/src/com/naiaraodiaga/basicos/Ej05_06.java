package com.naiaraodiaga.basicos;

import java.util.Scanner;

public class Ej05_06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double peso, altura, imc;

		System.out.println("Introduzca su peso: ");
		Scanner entrada = new Scanner(System.in);
		peso = entrada.nextDouble();
		System.out.println("Introduzca su altura: ");
		entrada = new Scanner(System.in);
		altura = entrada.nextDouble();
		
		imc = peso / Math.pow(altura, 2);
		
		if(imc < 16){
			System.out.println("Critero de ingreso en hospital");
		}
		else if(imc >= 16 && imc <17){
			System.out.println("Infrapeso");
		}
		else if(imc >= 17 && imc <18){
			System.out.println("Bajo peso");
		}
		else if(imc >= 18 && imc < 25){
			System.out.println("Peso normal (saludable)");
		}
		else if(imc >= 25 && imc < 30){
			System.out.println("Sobrepeso");
		}
		else if(imc >= 30 && imc < 35){
			System.out.println("Sobrepeso cr—nico");
		}
		else if(imc >= 35 && imc < 40){
			System.out.println("Obesidad prem—rbida");
		}
		else{
			System.out.println("Obesidad m—rbida");
		}

	}

}
