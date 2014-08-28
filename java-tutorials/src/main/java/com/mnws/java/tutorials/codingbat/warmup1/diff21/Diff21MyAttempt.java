package com.mnws.java.tutorials.codingbat.warmup1.diff21;

public class Diff21MyAttempt implements Diff21 {

	@Override
	public int diff21(int n) {
		int absDiff = Math.abs(n - 21);
		
		if(n > 21)
		{
			absDiff = absDiff * 2;
		}
		
		return absDiff;
	}

}
