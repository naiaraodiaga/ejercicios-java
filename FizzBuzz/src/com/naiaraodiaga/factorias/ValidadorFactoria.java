package com.naiaraodiaga.factorias;

import com.naiaraodiaga.fizzbuzz.Buzz;
import com.naiaraodiaga.fizzbuzz.Fizz;

public class ValidadorFactoria {

	public static final Fizz getFizzValidator(){
		Fizz f = new Fizz();
		
		return f;
	}
	
	public static final Buzz getBuzzValidator(){
		Buzz b = new Buzz();
		
		return b;
	}
}
