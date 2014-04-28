package com.naiaraodiaga.interfaces;

import java.util.ArrayList;

import com.naiaraodiaga.excepciones.NoHayEmpleadosException;
import com.naiaraodiaga.excepciones.TamanioEmpleadosException;

public interface IEmpresa {
	public String getNombre();
	public void setNombre(String nombre);
	public int getTamanio();
	public ArrayList<IEmpleado> getArrayEmpleados();
	public IEmpleado getEmpleado(int indice);
	public void nuevoEmpleado(String nombre, double sueldo) throws TamanioEmpleadosException;
	public int getContador();
	public void setContador(int contador);
	public void incContador();
	public void despedirEmpleado(int indice) throws NoHayEmpleadosException;
	public void reducirNumEmpleados(int indice);
	public void ascender(IEmpleado empleado);
}
