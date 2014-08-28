
package com.mnws.java.tutorials.codingbat.warmup1.parrottrouble;

public class ParrotTroubleMyAttempt implements ParrotTrouble {

	@Override
	public boolean parrotTrouble(boolean talking, int hour) {
		return (talking && (hour < 7 || hour > 20));
	}

	
}
