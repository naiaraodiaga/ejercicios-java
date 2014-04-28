package com.naiaraodiaga.empresa;

import com.naiaraodiaga.interfaces.IEmpleado;
import com.naiaraodiaga.interfaces.IEmpresa;

public class Empleado implements IEmpleado {
	private IEmpresa empresa;
	private String nombre;
	private double sueldo;
	private int numEmpleado;

	public Empleado(IEmpresa empresa, String nombre, double sueldo) {
		this(empresa, nombre, sueldo, empresa.getContador());
	}

	public Empleado(IEmpresa empresa, String nombre, double sueldo,
			int numEmpleado) {
		this.empresa = empresa;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numEmpleado = numEmpleado;

	}

	public IEmpresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(IEmpresa empresa) {
		this.empresa = empresa;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	@Override
	public void reducirNumEmpleado(){
		this.numEmpleado--;
	}

	@Override
	public String toString() {
		return String.valueOf(this.numEmpleado) + " " + this.nombre + " "
				+ String.valueOf(this.sueldo);
	}

	@Override
	public final void aumentarSueldo(int porcentaje) {
		try {
			this.sueldo += this.sueldo * (porcentaje) / 100;
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Override
	public void despedir() {
		this.empresa = null;
	}

	@Override
	public void ascender() {
		Ejecutivo ejecutivo = new Ejecutivo(this.empresa, this.nombre, this.sueldo, this.numEmpleado); 
		this.empresa.ascender(ejecutivo);
	}
}
