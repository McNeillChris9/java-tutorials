package com.mnws.java.tutorials.codingbat.warmup1.notstring;

public class NotStringMyAttempt implements NotString {

	@Override
	public String notString(String str) {
		String notText = "not";

		if (str.length() >= 3 && str.subSequence(0, 3).equals(notText))
			return str;

		return notText + " " + str;
	}

}
