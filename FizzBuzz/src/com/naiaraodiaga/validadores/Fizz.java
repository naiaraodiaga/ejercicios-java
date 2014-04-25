package com.naiaraodiaga.validadores;

public class Fizz extends Validador{
	private String texto = "Fizz";

	@Override
	public boolean esMultiplo(int num) {
		return (num % 3 == 0);
	}
}
