package com.naiaraodiaga.fizzbuzz;

import com.naiaraodiaga.excepciones.NumberNotValidException;
import com.naiaraodiaga.validadores.Validador;

public class Fizz extends Validador{
	
	public Fizz() {
		this.texto = "Fizz";
	}

	@Override
	public boolean esMultiplo(int num) throws NumberNotValidException{
		this.validateException(num);
		return (num % 3 == 0);
	}
	
}
