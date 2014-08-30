package com.mnws.java.tutorials.codingbat.warmup1.front3;

public class Front3Solution implements Front3 {

	@Override
	public String front3(String str) {
		String front;
		if (str.length() <= 3) {
			front = str;
		} else {
			front = str.substring(0, 3);
		}

		return front + front + front;
	}

}
