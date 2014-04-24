package com.naiaraodiaga.clasesEstandar.ejercicio24;

public abstract class OtroValidadorNIF {
	public static final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	public static void comprobarNif(String nif){
		if(numeroValido(nif) && tieneLetraFinal(nif)){
			if(getLetra(nif).toString().equalsIgnoreCase(letraDNI(nif)) && sizeCorrecto(nif))
				imprimirResultado(true, nif);
			else imprimirResultado(false, nif);
		}
		else
			imprimirResultado(false, nif);
	}
	
	public static boolean numeroValido(String nif){
		String digitos = getDigitos(nif);
		
		for(int i=0; i<digitos.length(); i++){
			if (!Character.isDigit(digitos.charAt(i))) return false;
		}
		return true;
	}
	
	public static boolean tieneLetraFinal(String nif){
		return (Character.isLetter(getLetra(nif)));
	}
	
	public static String getDigitos(String nif){
		return nif.substring(0, nif.length()-1);
	}
	
	public static Character getLetra(String nif){
		return (nif.charAt(nif.length()-1));
	}
	

	
	public static String letraDNI(String nif) {
	    return String.valueOf(letras.charAt(Integer.parseInt(getDigitos(nif)) % 23));
	}
	
	public static boolean sizeCorrecto(String nif){
		return (nif.length() == 9);
	}
	
	
	public static void imprimirResultado(boolean nifCorrecto, String nif){
		if(nifCorrecto) 
			System.out.println("NIF correcto: "+getDigitos(nif));
		else 
			System.out.println("NIF no valido");
	}

}
