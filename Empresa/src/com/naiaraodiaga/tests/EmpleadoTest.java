package com.naiaraodiaga.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.naiaraodiaga.empresa.Empleado;
import com.naiaraodiaga.empresa.Empresa;
import com.naiaraodiaga.excepciones.NoExisteEmpleadoException;
import com.naiaraodiaga.excepciones.TamanioEmpleadosException;

public class EmpleadoTest {
	Empresa empresa;
	Empleado empleado;
	
	@Before
	public void setUp() throws Exception {
		empresa = new Empresa ("NOVA", 10);
		empresa.nuevoEmpleado("Leire", 1000.0);
		empleado = (Empleado) empresa.getEmpleado(0);
	}

	@Test
	public void testToString() throws TamanioEmpleadosException, NoExisteEmpleadoException {
		empresa.nuevoEmpleado("Aitor", 1800.50);
		Empleado newEmpleado = (Empleado) empresa.getEmpleado(1);
		assertEquals("toString", "0 Leire 1000.0", empleado.toString());
		assertEquals("toString", "1 Aitor 1800.5", newEmpleado.toString());
	}
	
	public void aumentarSueldo(){
		empleado.aumentarSueldo(10);
		assertEquals("Aumentar sueldo", 1100.00, empleado.getSueldo(), 0);
	}
	
	public void despedir(){
		empleado.despedir();
		assertEquals("despedir", null, empleado.getEmpresa());
	}
	
	
}
