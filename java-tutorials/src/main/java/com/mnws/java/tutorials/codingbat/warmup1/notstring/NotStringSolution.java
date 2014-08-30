package com.mnws.java.tutorials.codingbat.warmup1.notstring;

public class NotStringSolution implements NotString {

	@Override
	public String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}

		return "not " + str;
	}

}
