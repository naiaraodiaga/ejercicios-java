package com.naiaraodiaga.juegos.tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.naiaraodiaga.app.Application;
import com.naiaraodiaga.factory.JuegoFactory;
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
	ByteArrayInputStream in;
	
	@Before
	public void setUp() throws Exception {
		adivina = JuegoFactory.nuevoJuegoAdivinaNumero(3);
		adivinaPar = JuegoFactory.nuevoJuegoAdivinaPar(3);
		adivinaImpar = JuegoFactory.nuevoJuegoAdivinaImpar(3);
	}

	@Test
	public void clasesYObjetos() throws NoHayMasVidasException {
		adivina.muestraVidasRestantes();

		assertEquals("Vidas iniciales", 3, adivina.getNumVidasRestantes());
		
		adivina.quitaVida();
		
		assertEquals("Vidas restantes", 2, adivina.getNumVidasRestantes());
		
		adivina.muestraVidasRestantes();
	}

	@Test
	public void ocultacionDeAtributos() throws NoHayMasVidasException {
		adivina.muestraVidasRestantes();
		assertEquals("Vidas iniciales", 3, adivina.getNumVidasRestantes());
		
		assertTrue(adivina.quitaVida());
		
		assertEquals("Vidas restantes", 2, adivina.getNumVidasRestantes());
		
		adivina.muestraVidasRestantes();
		
		adivina.reiniciaPartida();
		adivina.muestraVidasRestantes();
		assertEquals("Vidas restantes", 3, adivina.getNumVidasRestantes());
		
		adivina.actualizaRecord();
	}
	
	@Test
	public void testJuegoAdivinaNumero() throws NoEsNumericoException, NoHayMasVidasException {
		adivina.muestraNombre();
		adivina.muestraInfo();
//		adivina.juega();
	}
	
	@Test
	public void testJuegoAdivinaPar() throws NoEsNumericoException, NoHayMasVidasException {
		assertTrue(adivinaPar.validaNumero(4));
	}
	
	@Test
	public void testJuegoAdivinaImpar() throws NoEsNumericoException, NoHayMasVidasException {
		assertTrue(adivinaImpar.validaNumero(7));
	}
	
	@Test
	public void testTeclado() throws NoEsNumericoException, NoHayMasVidasException {
		Teclado teclado = new Teclado();
		assertTrue(teclado.esNumerico("3"));
		assertFalse(teclado.esNumerico("a"));
	}
	
	
	@Test
	public void test() throws Exception {
		Jugable juego;
//		in = new ByteArrayInputStream("0".getBytes());
//		System.setIn(in);
		String opcion = "S";
		try {
			do {
				juego = Application.eligeJuego();
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
