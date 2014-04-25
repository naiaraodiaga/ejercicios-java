package com.naiaraodiaga.fizzbuzz;

import java.util.ArrayList;

import com.naiaraodiaga.excepciones.NumberNotValidException;
import com.naiaraodiaga.factorias.ValidadorFactoria;
import com.naiaraodiaga.fizzbuzz.Buzz;
import com.naiaraodiaga.fizzbuzz.Fizz;
import com.naiaraodiaga.interfaces.IValidacion;

public class FizzBuzz {
	private String texto = "FizzBuzz";
	private ArrayList<IValidacion> listaValidadores = new ArrayList<IValidacion>();
	Fizz f;
	Buzz b;

	public FizzBuzz() {
		f = ValidadorFactoria.getFizzValidator();
		b = ValidadorFactoria.getBuzzValidator();

		this.addValidador(f);
		this.addValidador(b);
	}

	public String calcularFizzBuzzNumero(int num) throws NumberNotValidException {
		String result = "";
		
		for(int i=1; i<=num; i++) {
			if (i != 1) {
				result += " ";
			}
			result += obtenerTexto(i);	
		}

		return result;
	}

	public String obtenerTexto(int num) throws NumberNotValidException {
		String result = "";
		
		for (IValidacion validador : listaValidadores){
			if (validador.esMultiplo(num)){
				result += validador.devolverTexto();
			}
		}

		if (result.length() == 0){
			result += String.valueOf(num);
		}
		
		return result;
	}

	public void addValidador(IValidacion v) {
		if (!this.listaValidadores.contains(v)) {
			this.listaValidadores.add(v);
		}
	}

}
