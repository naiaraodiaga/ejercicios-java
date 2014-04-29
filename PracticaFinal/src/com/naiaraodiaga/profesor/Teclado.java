package com.naiaraodiaga.profesor;

import java.util.Scanner;

import com.naiaraodiaga.juegos.excepciones.NoEsNumericoException;

public class Teclado {

	public Teclado() {
		// TODO Auto-generated constructor stub
	}
	
	public int leerNumTeclado() throws NoEsNumericoException {
		String num;
		Scanner entrada = new Scanner (System.in);
		num = entrada.next();
		if(esNumerico(String.valueOf(num)))
			return Integer.parseInt(num);
		else
			throw new NoEsNumericoException("Debe introducir un nœmero entre 0 y 10");
	}


	public boolean esNumerico(String num) {
		for(int i = 0; i < num.length(); i++){
			if(!Character.isDigit(num.charAt(i)))
				return false;
		}
		return true;
	}

}
