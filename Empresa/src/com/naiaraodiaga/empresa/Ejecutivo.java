package com.naiaraodiaga.empresa;

import com.naiaraodiaga.interfaces.IEjecutivo;
import com.naiaraodiaga.interfaces.IEmpresa;

public class Ejecutivo extends Empleado implements IEjecutivo{

	private int presupuesto;
	
	public Ejecutivo(IEmpresa empresa, String nombre, double sueldo) {
		super(empresa, nombre, sueldo);
	}

	public Ejecutivo(IEmpresa empresa, String nombre, double sueldo, int numEmpleado) {
		super(empresa, nombre, sueldo, numEmpleado);
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@Override
	public String toString(){
		return super.toString()+" "+"Ejecutivo";
	}
}
