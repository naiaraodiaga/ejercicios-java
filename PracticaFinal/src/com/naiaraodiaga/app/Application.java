package com.naiaraodiaga.app;

import java.util.Scanner;
import java.util.Vector;

import com.naiaraodiaga.factory.JuegoFactory;
import com.naiaraodiaga.juegos.excepciones.NoEsNumericoException;
import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;
import com.naiaraodiaga.juegos.interfaces.Jugable;
import com.naiaraodiaga.profesor.Teclado;

public class Application {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			jugar();
		} catch(NoEsNumericoException e) {
			System.out.println(e.getMessage());
		} catch(NoHayMasVidasException e2) {
			System.out.println(e2.getMessage());
		}
		
	}
	
	public static Jugable eligeJuego() throws NoEsNumericoException {
		Vector<Jugable> juegos = new Vector<Jugable>(3);
		
		infoVector(juegos);
		
		juegos.add(JuegoFactory.nuevoJuegoAdivinaNumero(3));
		juegos.add(JuegoFactory.nuevoJuegoAdivinaPar(3));
		juegos.add(JuegoFactory.nuevoJuegoAdivinaImpar(3));
		
		infoVector(juegos);

		System.out.println("*** JUEGOS ***");
		for (int i = 0; i < juegos.size(); i++) {
			System.out.print(i + " - ");
			juegos.get(i).muestraNombre();
		}
		
		int opcion = Integer.MAX_VALUE;
		Teclado teclado = new Teclado();
		while (opcion < 0 || opcion > juegos.size()) {
			System.out.println("Seleccione el juego: ");
			opcion = teclado.leerNumTeclado();
		}
		return juegos.get(opcion);
	}
	
	public static void infoVector(Vector<Jugable> vector) {
		System.out.println("Capacidad: " + vector.capacity());
		System.out.println("Tama–o: " + vector.size());
	}

	
	public static void jugar() throws Exception {
		Jugable juego;
		String opcion = "S";
		try {
			do {
				juego = eligeJuego();
				juego.muestraInfo();
				juego.juega();
				System.out.println("Desea jugar de nuevo? (S’=S, No=N)");
				Scanner entrada = new Scanner(System.in);
				opcion = entrada.next();
			} while (opcion.equalsIgnoreCase("S"));
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		System.out.println("Fin del juego");
	}
}
