package com.mnws.java.tutorials.codingbat.warmup1.makes10;

public class Makes10Solution implements Makes10 {

	@Override
	public boolean makes10(int a, int b) {		
		return (a == 10 || b == 10 || a+b == 10);	
	}

}
