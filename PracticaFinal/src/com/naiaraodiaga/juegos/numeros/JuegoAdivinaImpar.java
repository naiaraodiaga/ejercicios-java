package com.naiaraodiaga.juegos.numeros;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
	}

	@Override
	public boolean validaNumero(int num) {
		if(num % 2 != 0)
			return true;
		else{
			this.mostrarMensaje("El número no es impar");
			return false;
		}
	}

	@Override
	public void muestraNombre() {
		this.mostrarMensaje("Adivina un número impar");
	}
	
	@Override
	public void muestraInfo() {
		this.mostrarMensaje("Descripción del juego: Adivine un número impar entre 0 y 10. Tiene 3 intentos en total");
	}
	
	@Override
	public void reiniciaPartida() {
		super.reiniciaPartida();
		while(super.getNumAleatorio() % 2 == 0){
			super.calcularNumAleatorio();
		}
	}
}
