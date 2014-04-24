package com.naiaraodiaga.clasesEstandar.ejercicio24;

import java.lang.Character;

public class ValidarNIF {
	private String nif;
	private String letra;
	public static final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public ValidarNIF(){
		this.nif="11111111A";
	}
	public ValidarNIF(String nif){
		this.nif = nif;
	}
	
	public boolean numeroValido(){
		String digitos = getDigitos();
		
		for(int i=0; i<digitos.length(); i++){
			if (!Character.isDigit(digitos.charAt(i))) return false;
		}
		return true;
	}
	
	public boolean tieneLetraFinal(){
		return (Character.isLetter(getLetra()));
	}
	
	public String getDigitos(){
		return this.nif.substring(0, this.nif.length()-1);
	}
	
	public Character getLetra(){
		return (this.nif.charAt(this.nif.length()-1));
	}
	
	
	public void comprobarNif(){
		if(numeroValido() && tieneLetraFinal()){
			if(this.getLetra().toString().equalsIgnoreCase(letraDNI()) && sizeCorrecto())
				imprimirResultado(true);
			else imprimirResultado(false);
		}
		else
			imprimirResultado(false);
	}
	
	public String letraDNI() {
	    return String.valueOf(this.letras.charAt(Integer.parseInt(getDigitos()) % 23));
	}
	
	public boolean sizeCorrecto(){
		return (nif.length() == 9);
	}
	
	
	public void imprimirResultado(boolean nifCorrecto){
		if(nifCorrecto) 
			System.out.println("NIF correcto: "+getDigitos());
		else 
			System.out.println("NIF no valido");
	}
}
