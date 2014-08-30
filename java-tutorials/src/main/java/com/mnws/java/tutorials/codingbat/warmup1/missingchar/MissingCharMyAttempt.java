package com.mnws.java.tutorials.codingbat.warmup1.missingchar;

public class MissingCharMyAttempt implements MissingChar {

	@Override
	public String missingChar(String str, int n) {
		String front = str.substring(0, n);
		String end = str.substring(n + 1);
		
		return front + end;
	}

}
