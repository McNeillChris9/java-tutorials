package com.mnws.java.tutorials.codingbat.warmup1.backaround;

public class BackAroundSolution implements BackAround {

	@Override
	public String backAround(String str) {
		// Get the last char
		String last = str.substring(str.length() - 1);
		return last + str + last;
	}

}
