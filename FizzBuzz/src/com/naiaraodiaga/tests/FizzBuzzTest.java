package com.naiaraodiaga.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.naiaraodiaga.fizzbuzz.Buzz;
import com.naiaraodiaga.fizzbuzz.Fizz;
import com.naiaraodiaga.fizzbuzz.FizzBuzz;

public class FizzBuzzTest {
	
	FizzBuzz fb;
	Fizz f;
	Buzz b;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();
		f = new Fizz();
		b = new Buzz();
	}
	
	@Test
	public void calcularMultiplo3() {
		assertEquals("Fizz", "Fizz", f.devolverTexto());
		
		assertFalse(f.esMultiploDe3(1));
		assertFalse(f.esMultiploDe3(2));
		assertTrue(f.esMultiploDe3(3));
		assertFalse(f.esMultiploDe3(4));
		assertFalse(f.esMultiploDe3(5));
		assertTrue(f.esMultiploDe3(6));
		assertFalse(f.esMultiploDe3(7));
		assertFalse(f.esMultiploDe3(8));
		assertTrue(f.esMultiploDe3(9));
		assertFalse(f.esMultiploDe3(10));
		assertTrue(f.esMultiploDe3(15));
	}
	
	@Test
	public void calcularMultiplo5() {
		assertEquals("Buzz", "Buzz", b.devolverTexto());
		
		assertFalse(b.esMultiploDe5(1));
		assertFalse(b.esMultiploDe5(2));
		assertFalse(b.esMultiploDe5(3));
		assertFalse(b.esMultiploDe5(4));
		assertTrue(b.esMultiploDe5(5));
		assertFalse(b.esMultiploDe5(6));
		assertFalse(b.esMultiploDe5(7));
		assertFalse(b.esMultiploDe5(8));
		assertFalse(b.esMultiploDe5(9));
		assertTrue(b.esMultiploDe5(10));
		assertTrue(b.esMultiploDe5(15));
	}
	
	@Test
	public void testCalcularNumero() {
		assertEquals("FizzBuzz 1", "1", fb.calcularFizzBuzzNumero(1));
		assertEquals("FizzBuzz 2", "2", fb.calcularFizzBuzzNumero(2));
		assertEquals("FizzBuzz 3", "Fizz", fb.calcularFizzBuzzNumero(3));
		assertEquals("FizzBuzz 4", "4", fb.calcularFizzBuzzNumero(4));
		assertEquals("FizzBuzz 5", "Buzz", fb.calcularFizzBuzzNumero(5));
		assertEquals("FizzBuzz 6", "Fizz", fb.calcularFizzBuzzNumero(6));
		assertEquals("FizzBuzz 7", "7", fb.calcularFizzBuzzNumero(7));
		assertEquals("FizzBuzz 8", "8", fb.calcularFizzBuzzNumero(8));
		assertEquals("FizzBuzz 9", "Fizz", fb.calcularFizzBuzzNumero(9));
		assertEquals("FizzBuzz 10", "Buzz", fb.calcularFizzBuzzNumero(10));
		assertEquals("FizzBuzz 15", "FizzBuzz", fb.calcularFizzBuzzNumero(15));
	}

	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz 1", "1", fb.print(1));
		assertEquals("FizzBuzz 3", "1 2 Fizz", fb.print(3));
		assertEquals("FizzBuzz 5", "1 2 Fizz 4 Buzz", fb.print(5));
		assertEquals("FizzBuzz 15", "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", fb.print(15));
	}

}
