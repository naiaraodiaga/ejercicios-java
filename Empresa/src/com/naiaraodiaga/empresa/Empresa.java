package com.naiaraodiaga.empresa;

import java.util.ArrayList;

import com.naiaraodiaga.excepciones.NoExisteEmpleadoException;
import com.naiaraodiaga.excepciones.NoHayEmpleadosException;
import com.naiaraodiaga.excepciones.TamanioEmpleadosException;
import com.naiaraodiaga.interfaces.IEmpleado;
import com.naiaraodiaga.interfaces.IEmpresa;

public class Empresa implements IEmpresa{

	private String nombre;
	private int tamanio;
	private ArrayList<IEmpleado> arrayEmpleados;
	private int numEmpleado;
	private int contador;
	
	public Empresa(String nombre, int tamanio) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.contador = 0;
		arrayEmpleados = new ArrayList<IEmpleado>();
	}

	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanio() {
		return tamanio;
	}


	public ArrayList<IEmpleado> getArrayEmpleados() {
		return arrayEmpleados;
	}

	public IEmpleado getEmpleado(int indice) throws NoExisteEmpleadoException {
		if(indice < this.contador)
			return arrayEmpleados.get(indice);
		else 
			throw new NoExisteEmpleadoException("El usuario no existe");
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public void incContador(){
		this.contador++;
	}
	
	@Override
	public void nuevoEmpleado(String nombre, double sueldo) throws TamanioEmpleadosException {
		
		if(this.contador < this.tamanio){
			Empleado newEmpleado = new Empleado (this, nombre, sueldo);
			this.arrayEmpleados.add(this.contador, newEmpleado);
			this.contador++;
		}
		else{
			throw new TamanioEmpleadosException("Se ha excedido el número de empleados");
		}
	}
	
	@Override
	public void despedirEmpleado(int indice) throws NoHayEmpleadosException{
		if(!this.arrayEmpleados.isEmpty() && this.arrayEmpleados.size()>=indice){
			this.arrayEmpleados.get(indice).despedir();
			this.arrayEmpleados.remove(indice);
			this.contador--;
			reducirNumEmpleados(indice);	
		}
		else{
			throw new NoHayEmpleadosException("La empresa no tiene empleados para despedir");
		}
		
	}
	
	@Override
	public void reducirNumEmpleados(int indice){
		for(int i = indice; i < this.contador; i++){
			this.arrayEmpleados.get(i).reducirNumEmpleado();
		}
	}
	
	public void ascender(IEmpleado ejecutivo) throws NoExisteEmpleadoException{
		IEmpleado empleado = this.getEmpleado(ejecutivo.getNumEmpleado());
		if(empleado != null){
			this.arrayEmpleados.set(this.arrayEmpleados.indexOf(empleado), ejecutivo);
		}
		
//		this.arrayEmpleados.set(ejecutivo.getNumEmpleado(), ejecutivo);
	}
}
