package com.mnws.java.tutorials.codingbat.warmup1.backaround;

public class BackAroundMyAttempt implements BackAround {

	@Override
	public String backAround(String str) {
		String last = str.substring(str.length() - 1);

		return last + str + last;
	}

}
