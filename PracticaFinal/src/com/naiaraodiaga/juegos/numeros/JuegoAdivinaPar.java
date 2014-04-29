package com.naiaraodiaga.juegos.numeros;

import java.util.Date;
import java.util.Random;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

	public JuegoAdivinaPar(int vidas) {
		super(vidas);
	}

	@Override
	public boolean validaNumero(int num) {
		if(num % 2 == 0)
			return true;
		else{
			this.mostrarMensaje("El número no es par");
			return false;
		}
	}
	
	@Override
	public void muestraNombre() {
		this.mostrarMensaje("Adivina un número par");
	}
	
	@Override
	public void muestraInfo() {
		this.mostrarMensaje("Descripción del juego: Adivine un número par entre 0 y 10. Tiene 3 intentos en total");
	}
	
	@Override
	public void reiniciaPartida() {
		super.reiniciaPartida();
		while(super.getNumAleatorio() % 2 != 0){
			super.calcularNumAleatorio();
		}
	}
}
