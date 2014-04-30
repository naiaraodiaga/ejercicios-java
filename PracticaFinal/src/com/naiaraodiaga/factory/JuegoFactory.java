package com.naiaraodiaga.factory;

import com.naiaraodiaga.juegos.numeros.JuegoAdivinaImpar;
import com.naiaraodiaga.juegos.numeros.JuegoAdivinaNumero;
import com.naiaraodiaga.juegos.numeros.JuegoAdivinaPar;

public abstract class JuegoFactory {

	public static final JuegoAdivinaNumero nuevoJuegoAdivinaNumero(int vidas) {
		return new JuegoAdivinaNumero(vidas);
	}
	
	public static final JuegoAdivinaPar nuevoJuegoAdivinaPar(int vidas) {
		return new JuegoAdivinaPar(vidas);
	}
	
	public static final JuegoAdivinaImpar nuevoJuegoAdivinaImpar(int vidas) {
		return new JuegoAdivinaImpar(vidas);
	}
}
