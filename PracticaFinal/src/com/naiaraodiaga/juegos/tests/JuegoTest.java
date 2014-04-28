package com.naiaraodiaga.juegos.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.naiaraodiaga.juegos.Juego;
import com.naiaraodiaga.juegos.excepciones.NoHayMasVidasException;

public class JuegoTest {

	Juego juego, juego2; 
	
	@Before
	public void setUp() throws Exception {
		juego = new Juego(5);
		juego2 = new Juego(5);
	}

	
	@Test
	public void testRestarYMostrarVidas() throws NoHayMasVidasException {
		System.out.println("Juego 1 - Vidas iniciales");
		juego.muestraVidasRestantes();
		assertEquals("Vidas iniciales", 5, juego.getNumVidasRestantes());
		System.out.println("Juego 1 - Resto vida");
		juego.quitaVida();
		assertEquals("Vidas restantes", 4, juego.getNumVidasRestantes());
		juego.muestraVidasRestantes();
		System.out.println("Juego 2 - Vidas iniciales");
		juego2.muestraVidasRestantes();
		System.out.println("Juego 1");
		juego.muestraVidasRestantes();
	}

}
