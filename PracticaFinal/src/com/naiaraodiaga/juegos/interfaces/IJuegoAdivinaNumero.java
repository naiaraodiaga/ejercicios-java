package com.naiaraodiaga.juegos.interfaces;

import com.naiaraodiaga.juegos.excepciones.NoEsNumericoException;
import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;

public interface IJuegoAdivinaNumero {
	public int getNumAleatorio();
	public void setNumAleatorio(int numAleatorio);
//	public int leerNumTeclado() throws NoEsNumericoException ;
//	public boolean esNumerico(String num);
	public void solicitarYCompararNumero() throws NoHayMasVidasException, NoEsNumericoException;
	public boolean validaNumero(int num);
	public void calcularNumAleatorio();
}
