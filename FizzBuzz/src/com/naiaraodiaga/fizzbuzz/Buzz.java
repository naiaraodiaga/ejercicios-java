package com.naiaraodiaga.fizzbuzz;

import com.naiaraodiaga.interfaces.IValidacion;

public class Buzz {
	public String texto = "Buzz";
	
	public boolean esMultiploDe5(int num){
		return (num % 5 == 0);
	}

	public String devolverTexto(){
		return texto;
	}
}
