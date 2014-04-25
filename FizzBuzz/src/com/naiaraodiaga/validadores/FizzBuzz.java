package com.naiaraodiaga.validadores;

import java.util.ArrayList;

import com.naiaraodiaga.fizzbuzz.Buzz;
import com.naiaraodiaga.fizzbuzz.Fizz;
import com.naiaraodiaga.interfaces.IValidacion;

public class FizzBuzz {
	private String texto = "FizzBuzz";
	private ArrayList <IValidacion> listaValidadores = new  ArrayList<IValidacion>();
	Fizz f;
	Buzz b;
	
	public FizzBuzz() {
		f = new Fizz();
		b = new Buzz();
		listaValidadores.add((IValidacion) f);
		listaValidadores.add((IValidacion) b);
	}
	
	public String calcularFizzBuzzNumero(int num){
		String result = "";
		

			for (IValidacion v : listaValidadores) {
				if (v.esMultiplo(num)){
					result += v.devolverTexto();
				}
				else
				{result = String.valueOf(num);
				}
			}
		
		
		return result;
	}
	
	public String print(int num){
		String result = "";
		for (int i=1; i<=num; i++){
				result += calcularFizzBuzzNumero(i);
			
			
			if (i != num) result += " ";
		}
		
		return result;
	}
	
	

}
