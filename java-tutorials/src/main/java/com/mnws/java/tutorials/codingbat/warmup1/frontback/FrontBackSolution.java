package com.mnws.java.tutorials.codingbat.warmup1.frontback;

public class FrontBackSolution implements FrontBack {

	@Override
	public String frontBack(String str) {

		if (str.length() <= 1) return str;

		String mid = str.substring(1, str.length() - 1);
		
		// last + mid + first
		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}

}
