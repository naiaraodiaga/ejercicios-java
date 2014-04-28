package com.naiaraodiaga.juegos;

import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;
import com.naiaraodiaga.juegos.interfaces.IJuego;

public class Juego implements IJuego{
	private int vidasRestantes;
	private int vidas;
	private static int record = 0;
	
	public Juego(int num) {
		this.vidasRestantes = num;
		this.vidas = num;
	}

	@Override
	public int getNumVidasRestantes() {
		return vidasRestantes;
	}

	@Override
	public void setNumVidasRestantes(int numVidasRestantes) {
		this.vidasRestantes = numVidasRestantes;
	}
	
	@Override
	public void muestraVidasRestantes() {
		System.out.println(vidasRestantes); 
	}

	@Override
	public boolean quitaVida() throws NoHayMasVidasException {
		if(this.vidasRestantes > 0){
			this.vidasRestantes--;
			return (this.vidasRestantes > 0);
		}
		else
			throw new NoHayMasVidasException("Juego terminado por pantalla");
	}

	@Override
	public void reiniciaPartida() {
		this.vidasRestantes = this.vidas;
		
	}

	@Override
	public void actualizaRecord() {
		if(vidasRestantes == record)
			mostrarMensaje("Se ha alcanzado el record");
		else if (this.vidasRestantes > record){
			
			mostrarMensaje("Se ha alcanzado el record");
		}
	}

	public void mostrarMensaje(String mensaje){
		System.out.println(mensaje);
	}
}
