package com.naiaraodiaga.fizzbuzz;

public class FizzBuzz {
	private String texto = "FizzBuzz";
	Fizz f;
	Buzz b;
	
	public FizzBuzz() {
		f = new Fizz();
		b = new Buzz();
	}
	
	public String calcularFizzBuzzNumero(int num){
		String result = "";
		if (f.esMultiploDe3(num) && b.esMultiploDe5(num)){
			result = texto;
		}else if (f.esMultiploDe3(num)){
			result = f.devolverTexto();
		}else if (b.esMultiploDe5(num)){
			result = b.devolverTexto();
		}else{
			result = String.valueOf(num);
		}
		
		return result;
	}
	
	public String print(int num){
		String result = "";
		for (int i=1; i<=num; i++){
			if (i == 1){
				result = calcularFizzBuzzNumero(i);
			}else{
				result += " " + calcularFizzBuzzNumero(i);
			}
			
//			if (i != num){
//				result += " ";
//			}
		}
		
		return result;
	}
	
	

}
