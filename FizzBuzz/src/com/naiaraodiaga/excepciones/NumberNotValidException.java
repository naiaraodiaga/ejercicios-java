package com.naiaraodiaga.excepciones;

public class NumberNotValidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4900699829132967182L;
	
	public NumberNotValidException (String message){
		super(message);
	}
}
