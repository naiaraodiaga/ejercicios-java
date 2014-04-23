package com.naiaraodiaga.poo.ejercicio25;

public class Complejo {
	private double pReal;
	private double pImag;
	private static int contador = 0;
	
	
	public Complejo(){
		this.pReal = 0;
		this.pImag = 0;
		this.contador++;
	}
	
	public Complejo(double pReal, double pImag){
		this();
		this.pReal = pReal;
		this.pImag = pImag;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Complejo.contador = contador;
	}

	public double getpReal() {
		return pReal;
	}
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}
	
	public double getpImag() {
		return pImag;
	}
	public void setpImag(double pImag) {
		this.pImag = pImag;
	}
	
	public void asignar(double x, double y){
		this.pReal = x;
		this.pImag = y;
	}
	
	public void sumar(Complejo b){
		this.pReal += b.getpReal();
		this.pImag += b.getpImag();
	} 
	
	public static Complejo sumar(Complejo a, Complejo b){
		double real, imag;
		real = a.getpReal() + b.getpReal();
		imag = a.getpImag() + b.getpImag();
		
		return new Complejo(real, imag);
	} 
	
	public boolean equals(Complejo b){
		return ((this.pReal == b.getpReal()) && (this.pImag == b.getpImag()));
	}
	
	public void imprimir(){
		System.out.println("("+this.pReal +","+this.pImag+")");
	} 
}
