package com.naiaraodiaga.interfaces;

import com.naiaraodiaga.interfaces.IEmpleado;

public interface IEjecutivo extends IEmpleado{
	public double getPresupuesto();
	public void setPresupuesto(int presupuesto);
	public String toString();

}
