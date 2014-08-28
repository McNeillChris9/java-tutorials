package com.mnws.java.tutorials.codingbat.warmup1.sleepin;

public class SleepInMyAttempt implements SleepIn {

	@Override
	public boolean sleepIn(boolean weekday, boolean vacation) {		
		return (!weekday || vacation);
	}

}
