package com.naiaraodiaga.juegos.interfaces;

import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;

public interface IJuego {
	public int getNumVidasRestantes();
	public void setNumVidasRestantes(int numVidasRestantes);
	public void muestraVidasRestantes();
	public boolean quitaVida() throws NoHayMasVidasException;
	public void reiniciaPartida();
	public void actualizaRecord();
}
