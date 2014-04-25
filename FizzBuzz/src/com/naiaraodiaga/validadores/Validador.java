package com.naiaraodiaga.validadores;

import com.naiaraodiaga.excepciones.NumberNotValidException;
import com.naiaraodiaga.interfaces.IValidacion;

public abstract class Validador implements IValidacion{
	protected String texto;
	
	public abstract boolean esMultiplo(int num) throws NumberNotValidException;
	
	public String devolverTexto(){
		return this.texto;
	}
	
	protected void validateException(int num) throws NumberNotValidException{
		if(num < 1){
			throw new NumberNotValidException("Nœmero no v‡lido: Es menor que 1.");
		}
	}
}
