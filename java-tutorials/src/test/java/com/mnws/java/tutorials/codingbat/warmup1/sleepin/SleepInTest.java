/**
 * CodingBat Warmup Exercise: sleepIn (http://codingbat.com/prob/p187868)  
 * 
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 
 *
 *	sleepIn(false, false) -> true
 *	sleepIn(true, false) ->  false
 *	sleepIn(false, true) -> true
 *  sleepIn(true, true) -> true
 *	
 * @author cmcneill
 *
 */

package com.mnws.java.tutorials.codingbat.warmup1.sleepin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.mnws.java.tutorials.codingbat.warmup1.sleepin.SleepIn;
import com.mnws.java.tutorials.codingbat.warmup1.sleepin.SleepInMyAttempt;


public class SleepInTest {

	SleepIn codeToTest;
	
	@Before
	public void setup(){		
		codeToTest = new SleepInMyAttempt();
	}
	
	@Test
	public void test1(){
		assertTrue(codeToTest.sleepIn(false, false));		
	}
	
	@Test
	public void test2(){
		assertFalse(codeToTest.sleepIn(true, false));		
	}
	
	@Test
	public void test3(){
		assertTrue(codeToTest.sleepIn(false, true));		
	}
	
	@Test
	public void test4(){
		assertTrue(codeToTest.sleepIn(true, true));		
	}
	
}
