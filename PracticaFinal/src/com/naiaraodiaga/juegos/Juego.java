package com.naiaraodiaga.juegos;

import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;
import com.naiaraodiaga.juegos.interfaces.IJuego;

public abstract class Juego implements IJuego {
	private int vidasRestantes;
	private int vidas;
	private static int RECORD = 0;

	public Juego(int num) {
		this.vidasRestantes = num;
		this.vidas = num;
	}

	@Override
	public int getNumVidasRestantes() {
		return vidasRestantes;
	}

	@Override
	public void muestraVidasRestantes() {
		mostrarMensaje(String.valueOf(this.vidasRestantes));
	}

	@Override
	public boolean quitaVida() throws NoHayMasVidasException {
		if (this.vidasRestantes > 0) {
			this.vidasRestantes--;
			return (this.vidasRestantes > 0);
		} else {
			throw new NoHayMasVidasException("Juego terminado.");
		}
	}

	@Override
	public void reiniciaPartida() {
		this.vidasRestantes = this.vidas;
	}

	@Override
	public void actualizaRecord() {
		if (this.vidasRestantes == RECORD) {
			mostrarMensaje("Se ha alcanzado el record");
		} else if (this.vidasRestantes > RECORD) {
			mostrarMensaje("Se ha alcanzado el record: " + this.vidasRestantes);
		}
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
