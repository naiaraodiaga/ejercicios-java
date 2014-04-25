package com.naiaraodiaga.fizzbuzz;

import com.naiaraodiaga.excepciones.NumberNotValidException;
import com.naiaraodiaga.validadores.Validador;

public class Buzz extends Validador{
	
	public Buzz() {
		this.texto = "Buzz";
	}

	@Override
	public boolean esMultiplo(int num) throws NumberNotValidException{
		this.validateException(num);
		return (num % 5 == 0);
	}
}
