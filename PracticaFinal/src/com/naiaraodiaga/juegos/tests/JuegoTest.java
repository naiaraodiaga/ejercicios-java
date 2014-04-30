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
	public void adivinaNumeroRestarVida() throws NoHayMasVidasException {
		assertEquals("Vidas iniciales", 3, adivina.getNumVidasRestantes());

		adivina.quitaVida();

		assertEquals("Vidas restantes", 2, adivina.getNumVidasRestantes());
	}

	@Test
	public void adivinaNumeroReiniciarPartida() throws NoHayMasVidasException {
		assertEquals("Vidas iniciales", 3, adivina.getNumVidasRestantes());

		assertTrue(adivina.quitaVida());

		assertEquals("Vidas restantes", 2, adivina.getNumVidasRestantes());

		adivina.reiniciaPartida();

		assertEquals("Vidas restantes", 3, adivina.getNumVidasRestantes());
	}

	@Test
	public void adivinaNumeroValidarNumero() throws NoEsNumericoException,
			NoHayMasVidasException {
		assertTrue(adivina.validaNumero(1));
		assertTrue(adivina.validaNumero(2));
	}

	@Test
	public void adivinaNumeroValidarNumeroAleatorio()
			throws NoEsNumericoException, NoHayMasVidasException {

		adivina.calcularNumAleatorio();
		int numAleatorio = adivina.getNumAleatorio();
		assertTrue("Random menor o igual a 10", numAleatorio <= 10);
		assertTrue("Random mayor o igual a 0", numAleatorio >= 0);

		assertFalse("Random mayor que 10", numAleatorio > 10);
		assertFalse("Random menor que 0", numAleatorio < 0);
	}

	@Test
	public void adivinaParValidarNumero() throws NoEsNumericoException,
			NoHayMasVidasException {
		assertTrue(adivinaPar.validaNumero(0));
		assertFalse(adivinaPar.validaNumero(1));
		assertTrue(adivinaPar.validaNumero(2));
		assertFalse(adivinaPar.validaNumero(3));
		assertTrue(adivinaPar.validaNumero(4));
		assertFalse(adivinaPar.validaNumero(5));
	}

	@Test
	public void adivinaParReiniciarPartida() throws NoEsNumericoException,
			NoHayMasVidasException {
		assertEquals("Vidas iniciales", 3, adivinaPar.getNumVidasRestantes());

		assertTrue(adivinaPar.quitaVida());

		assertEquals("Vidas restantes", 2, adivinaPar.getNumVidasRestantes());

		adivinaPar.reiniciaPartida();

		assertEquals("Vidas restantes", 3, adivinaPar.getNumVidasRestantes());
	}

	@Test
	public void adivinaImparValidarNumero() throws NoEsNumericoException,
			NoHayMasVidasException {
		assertTrue(adivinaImpar.validaNumero(1));
		assertFalse(adivinaImpar.validaNumero(2));
		assertTrue(adivinaImpar.validaNumero(3));
		assertFalse(adivinaImpar.validaNumero(4));
		assertTrue(adivinaImpar.validaNumero(5));
	}

	@Test
	public void adivinaImparReiniciarPartida() throws NoEsNumericoException,
			NoHayMasVidasException {
		assertEquals("Vidas iniciales", 3, adivinaImpar.getNumVidasRestantes());

		assertTrue(adivinaImpar.quitaVida());

		assertEquals("Vidas restantes", 2, adivinaImpar.getNumVidasRestantes());

		adivinaImpar.reiniciaPartida();

		assertEquals("Vidas restantes", 3, adivinaImpar.getNumVidasRestantes());
	}

	@Test
	public void testTeclado() throws NoEsNumericoException,
			NoHayMasVidasException {
		Teclado teclado = new Teclado();
		assertTrue(teclado.esNumericoValido("1"));
		assertTrue(teclado.esNumericoValido("9"));
		assertFalse(teclado.esNumericoValido("a"));
		assertFalse(teclado.esNumericoValido("z"));
		assertFalse(teclado.esNumericoValido("-1"));
		assertFalse(teclado.esNumericoValido("1.0"));
	}

	@Test
	public void applicationEligeJuego() throws NoEsNumericoException,
			NoHayMasVidasException {
		in = new ByteArrayInputStream("0".getBytes());
		System.setIn(in);

		Jugable juego;
		juego = Application.eligeJuego();
		assertTrue(juego instanceof JuegoAdivinaNumero);

		
		in = new ByteArrayInputStream("1".getBytes());
		System.setIn(in);

		juego = Application.eligeJuego();
		assertTrue(juego instanceof JuegoAdivinaPar);

		
		in = new ByteArrayInputStream("2".getBytes());
		System.setIn(in);

		juego = Application.eligeJuego();
		assertTrue(juego instanceof JuegoAdivinaImpar);		
	}
}
