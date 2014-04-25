package com.naiaraodiaga.validadores;

import com.naiaraodiaga.interfaces.IValidacion;

public abstract class Validador implements IValidacion{
	private String texto;

	public abstract boolean esMultiplo(int num);
	
	public String devolverTexto(){
		return this.texto;
	}
}
