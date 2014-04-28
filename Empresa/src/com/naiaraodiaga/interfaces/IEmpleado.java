package com.naiaraodiaga.interfaces;

public interface IEmpleado {

	public String getNombre();
	public void setNombre(String nombre);
	public double getSueldo();
	public void setSueldo(double sueldo);
	public int getNumEmpleado();
	public void setNumEmpleado(int numEmpleado);
	public String toString();
	public void aumentarSueldo(int porcentaje);
	public void despedir();
	public void reducirNumEmpleado();
	public void ascender();
}
