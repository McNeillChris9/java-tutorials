package com.mnws.java.tutorials.codingbat.warmup1.sumdouble;

public class SumDoubleMyAttempt implements SumDouble {

	@Override
	public int sumDouble(int a, int b) {
		return (a == b)? (a+b)*2 : a+b ;
		/**
		 * Alternative (initial attempt before refactoring)
		 
		 if(a == b) {
		 
			return (a + b) * 2;
		}else{
			return a + b;
		}
		**/
	}

}
