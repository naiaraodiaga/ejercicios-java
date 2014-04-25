package com.naiaraodiaga.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.naiaraodiaga.excepciones.NumberNotValidException;
import com.naiaraodiaga.factorias.ValidadorFactoria;
import com.naiaraodiaga.fizzbuzz.Buzz;
import com.naiaraodiaga.fizzbuzz.Fizz;
import com.naiaraodiaga.fizzbuzz.FizzBuzz;
import com.naiaraodiaga.interfaces.IValidacion;

public class ValidadorFizzBuzzTests {

	FizzBuzz fb;
	Fizz f;
	Buzz b;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
		
		f = ValidadorFactoria.getFizzValidator();
		b = ValidadorFactoria.getBuzzValidator();
			
	}
	
	@Test
	public void calcularMultiplo3() throws NumberNotValidException {
		assertTrue(f instanceof IValidacion);
		assertEquals("Fizz", "Fizz", f.devolverTexto());
		
		assertFalse(f.esMultiplo(1));
		assertFalse(f.esMultiplo(2));
		assertTrue(f.esMultiplo(3));
		assertFalse(f.esMultiplo(4));
		assertFalse(f.esMultiplo(5));
		assertTrue(f.esMultiplo(6));
		assertFalse(f.esMultiplo(7));
		assertFalse(f.esMultiplo(8));
		assertTrue(f.esMultiplo(9));
		assertFalse(f.esMultiplo(10));
		assertTrue(f.esMultiplo(15));
	}
	
	@Test
	public void calcularMultiplo5() throws NumberNotValidException {
		assertEquals("Buzz", "Buzz", b.devolverTexto());
		
		assertFalse(b.esMultiplo(1));
		assertFalse(b.esMultiplo(2));
		assertFalse(b.esMultiplo(3));
		assertFalse(b.esMultiplo(4));
		assertTrue(b.esMultiplo(5));
		assertFalse(b.esMultiplo(6));
		assertFalse(b.esMultiplo(7));
		assertFalse(b.esMultiplo(8));
		assertFalse(b.esMultiplo(9));
		assertTrue(b.esMultiplo(10));
		assertTrue(b.esMultiplo(15));
	}
	
	@Test
	public void obtenerTexto() throws NumberNotValidException {
		assertEquals("FizzBuzz 1", "1", fb.obtenerTexto(1));
		assertEquals("FizzBuzz 2", "2", fb.obtenerTexto(2));
		assertEquals("FizzBuzz 3", "Fizz", fb.obtenerTexto(3));
		assertEquals("FizzBuzz 4", "4", fb.obtenerTexto(4));
		assertEquals("FizzBuzz 5", "Buzz", fb.obtenerTexto(5));
		assertEquals("FizzBuzz 6", "Fizz", fb.obtenerTexto(6));
		assertEquals("FizzBuzz 7", "7", fb.obtenerTexto(7));
		assertEquals("FizzBuzz 8", "8", fb.obtenerTexto(8));
		assertEquals("FizzBuzz 9", "Fizz", fb.obtenerTexto(9));
		assertEquals("FizzBuzz 10", "Buzz", fb.obtenerTexto(10));
		assertEquals("FizzBuzz 15", "FizzBuzz", fb.obtenerTexto(15));
	}

	@Test
	public void calcularTexto() throws NumberNotValidException {
		assertEquals("FizzBuzz 1", "1", fb.calcularFizzBuzzNumero(1));
		assertEquals("FizzBuzz 3", "1 2 Fizz", fb.calcularFizzBuzzNumero(3));
		assertEquals("FizzBuzz 5", "1 2 Fizz 4 Buzz", fb.calcularFizzBuzzNumero(5));
		assertEquals("FizzBuzz 15", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fb.calcularFizzBuzzNumero(15));
	}

}
