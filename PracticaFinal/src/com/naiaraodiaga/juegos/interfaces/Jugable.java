package com.naiaraodiaga.juegos.interfaces;

import com.naiaraodiaga.juegos.excepciones.NoEsNumericoException;
import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;

public interface Jugable {
	public abstract void juega() throws NoEsNumericoException, NoHayMasVidasException;
	public void muestraNombre();
	public void muestraInfo();
}
