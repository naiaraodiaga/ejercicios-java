package com.naiaraodiaga.interfaces;

import com.naiaraodiaga.excepciones.NumberNotValidException;

public interface IValidacion {
	public boolean esMultiplo(int num) throws NumberNotValidException;
	public String devolverTexto();
}
