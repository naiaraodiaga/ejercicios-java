package com.naiaraodiaga.juegos.numeros;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.naiaraodiaga.juegos.Juego;
import com.naiaraodiaga.juegos.excepciones.NoEsNumericoException;
import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;
import com.naiaraodiaga.juegos.interfaces.IJuegoAdivinaNumero;
import com.naiaraodiaga.juegos.interfaces.Jugable;
import com.naiaraodiaga.profesor.Teclado;

public class JuegoAdivinaNumero extends Juego implements IJuegoAdivinaNumero,
		Jugable {

	private int numAleatorio;

	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
		this.reiniciaPartida();
	}

	public int getNumAleatorio() {
		return numAleatorio;
	}

	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio = numAleatorio;
	}

	public void juega() throws NoEsNumericoException, NoHayMasVidasException {
		this.reiniciaPartida();
		this.mostrarMensaje("Adivine un nœmero entre 0 y 10: ");
		solicitarYCompararNumero();
	}

	public void solicitarYCompararNumero() throws NoHayMasVidasException,
			NoEsNumericoException {
		boolean hasAcertado = false;
		int num;
		Teclado teclado = new Teclado();
		while (this.getNumVidasRestantes() > 0 && !hasAcertado) {
			num = teclado.leerNumTeclado();
			if (num >= 0 && num <= 10) {
				if (validaNumero(num)) {
					if (num == this.numAleatorio) {
						hasAcertado = true;
						this.mostrarMensaje("Acertaste");
						this.actualizaRecord();
					} else if (this.quitaVida()) {
						if (num < numAleatorio)
							this.mostrarMensaje("El nœmero que buscamos es mayor");
						else
							this.mostrarMensaje("El nœmero que buscamos es menor");
					} else
						this.mostrarMensaje("No te quedan m‡s vidas");
				}
			}
			else{
				this.mostrarMensaje("Introduzca un nœmero entre 0 y 10: ");
			}
		}
	}

	@Override
	public boolean validaNumero(int num) {
		return true;
	}

	@Override
	public void muestraNombre() {
		this.mostrarMensaje("Adivina un número");
	}

	@Override
	public void muestraInfo() {
		this.mostrarMensaje("Descripción del juego: Adivine un número entre 0 y 10. Tiene 3 intentos en total");
	}

	@Override
	public void reiniciaPartida() {
		super.reiniciaPartida();
		this.calcularNumAleatorio();
	}

	public void calcularNumAleatorio() {
		Random random = new Random();
		random.setSeed(new Date().getTime());
		this.numAleatorio = (int) (random.nextInt(10));
	}
}
