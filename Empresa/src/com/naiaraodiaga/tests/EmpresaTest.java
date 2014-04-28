package com.naiaraodiaga.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.naiaraodiaga.empresa.Empleado;
import com.naiaraodiaga.empresa.Empresa;
import com.naiaraodiaga.excepciones.NoHayEmpleadosException;
import com.naiaraodiaga.excepciones.TamanioEmpleadosException;
import com.naiaraodiaga.interfaces.IEjecutivo;

public class EmpresaTest {

	Empresa empresa;
	
	@Before
	public void setUp() throws Exception {
		empresa = new Empresa("NOVA", 10);
		empresa.nuevoEmpleado("Naiara", 2000.00);
	}

	
	@Test
	public void addEmpleado() throws TamanioEmpleadosException {
		assertEquals("addEmpleado", 1, empresa.getArrayEmpleados().size());
	}
	
	@Test
	public void despedirEmpleado() throws NoHayEmpleadosException{
		empresa.despedirEmpleado(0);
		assertFalse(empresa.getArrayEmpleados().contains(0));
	}
	
	@Test
	public void reducirNumEmpleados() throws TamanioEmpleadosException, NoHayEmpleadosException{
		empresa.nuevoEmpleado("Ibai", 1500.00); // Num. empleado = 1
		empresa.nuevoEmpleado("Aitor", 1800.50);  // Num. empleado = 2
		empresa.nuevoEmpleado("Ainhoa", 1350.0);  // Num. empleado = 3
		empresa.nuevoEmpleado("Ilargi", 1225.0);  // Num. empleado = 4
		
		System.out.println(empresa.getArrayEmpleados().toString());
		
		empresa.despedirEmpleado(1); // Elimino a Ibai con num. empleado = 1
		
		System.out.println(empresa.getArrayEmpleados().toString());
		
		assertEquals("Naiara", 0, empresa.getEmpleado(0).getNumEmpleado());
		assertEquals("Aitor", 1, empresa.getEmpleado(1).getNumEmpleado());
		assertEquals("Ainhoa", 2, empresa.getEmpleado(2).getNumEmpleado());
		assertEquals("Ilargi", 3, empresa.getEmpleado(3).getNumEmpleado());	
	}
	
	@Test
	public void ascenderEmpleado() throws TamanioEmpleadosException{
		empresa.getEmpleado(0).ascender();
		assertTrue(this.empresa.getEmpleado(0) instanceof IEjecutivo);
		empresa.nuevoEmpleado("Iraun", 1225.0);
		assertFalse(this.empresa.getEmpleado(1) instanceof IEjecutivo);
	}
}
