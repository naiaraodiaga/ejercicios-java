package com.naiaraodiaga.poo.ejercicio26;

public class Racional {
	private int numerador, denominador;
	
	public Racional(){
		this.numerador = 1;
		this.denominador = 1;
	}
	
	public Racional(int num, int den){
		this.numerador = num;
		if(den != 0)
			this.denominador = den;
		else
			this.denominador = 1;
	}
	
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	public void asignaNumerador(int x){
		this.numerador = x;
	}
	public void asignaDenominador(int y){
		this.denominador = y;
	}
	public void imprimir(){
		System.out.println(this.numerador +"/"+ this.denominador);
	}
	
	public String toString(){
		return (this.numerador +"/"+ this.denominador).toString();
	}
	public Racional suma(Racional b){
		int num = this.numerador*b.getDenominador() + this.denominador*b.getNumerador();
		int den = this.denominador * b.getDenominador();
		
		return new Racional(num, den);
	}
	public Racional resta(Racional b){
		
		int num =  this.denominador * b.getNumerador() - this.numerador * b.getDenominador();
		int den = this.denominador * b.getDenominador();
		
		return new Racional(num, den); 
	}
	public Racional producto(Racional b){
		this.numerador *= b.getNumerador();
		this.denominador *= b.getDenominador();
		
		return new Racional(this.numerador, this.denominador);
	}
	public Racional division(Racional b){
		this.numerador *= b.getDenominador();
		this.denominador *= b.getNumerador();
		
		return new Racional (this.numerador, this.denominador);
	}
	public boolean esIgual(Racional b){
		return ((this.numerador == b.getNumerador()) && (this.denominador == b.getDenominador()));
	}
}
