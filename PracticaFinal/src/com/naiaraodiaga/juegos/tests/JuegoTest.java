package com.naiaraodiaga.juegos.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.naiaraodiaga.juegos.excepciones.NoEsNumericoException;
import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;
import com.naiaraodiaga.juegos.interfaces.Jugable;
import com.naiaraodiaga.juegos.numeros.JuegoAdivinaImpar;
import com.naiaraodiaga.juegos.numeros.JuegoAdivinaNumero;
import com.naiaraodiaga.juegos.numeros.JuegoAdivinaPar;
import com.naiaraodiaga.profesor.Teclado;

public class JuegoTest {

	static JuegoAdivinaNumero adivina;
	static JuegoAdivinaPar adivinaPar;
	static JuegoAdivinaImpar adivinaImpar;

	@Before
	public void setUp() throws Exception {
		adivina = new JuegoAdivinaNumero(3);
		adivinaPar = new JuegoAdivinaPar(3);
		adivinaImpar = new JuegoAdivinaImpar(3);
	}

	@Test
	public void test() throws Exception {
		Jugable juego;
		String opcion = "S";
		try {
			do {
				juego = eligeJuego();
				juego.muestraInfo();
				juego.juega();
				System.out.println("¿Desea jugar de nuevo? (Sí=S, No=N)");
				Scanner entrada = new Scanner(System.in);
				opcion = entrada.next();
			} while (opcion.equalsIgnoreCase("S"));
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		System.out.println("Fin del juego");
	}

	@SuppressWarnings("unused")
	public static Jugable eligeJuego() throws NoEsNumericoException {
		Vector<Jugable> juegos = new Vector<Jugable>(3);
		infoVector(juegos);
		juegos.add(adivina);
		juegos.add(adivinaPar);
		juegos.add(adivinaImpar);
		infoVector(juegos);

		System.out.println("*** JUEGOS ***");
		for (int i = 0; i < juegos.size(); i++) {
			System.out.print(i + " - ");
			juegos.get(i).muestraNombre();
		}
		int opcion = Integer.MAX_VALUE;
		Scanner entrada;
		Teclado teclado = new Teclado();
		while (opcion < 0 || opcion > juegos.size()) {
			System.out.println("Seleccione el juego: ");
			entrada = new Scanner(System.in);
			opcion = teclado.leerNumTeclado();
		}
		return juegos.get(opcion);
	}

	
	public static void infoVector(Vector<Jugable> vector) {
		System.out.println("Capacidad: " + vector.capacity());
		System.out.println("Tamaño: " + vector.size());
	}
}
