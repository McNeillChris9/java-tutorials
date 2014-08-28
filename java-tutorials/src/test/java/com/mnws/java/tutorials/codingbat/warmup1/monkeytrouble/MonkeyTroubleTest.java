/**
 * CodingBat Warmup Exercise: monkeyTrouble (http://codingbat.com/prob/p181646) 
 *  
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble. 
 * 
 * monkeyTrouble(true, true) -> true
 * monkeyTrouble(false, false) -> true
 * monkeyTrouble(true, false) -> false
 * monkeyTrouble(false, true) -> false
 *  
 */

package com.mnws.java.tutorials.codingbat.warmup1.monkeytrouble;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MonkeyTroubleTest {

	MonkeyTrouble codeToTest;
	
	@Before
	public void setup(){
		codeToTest = new MonkeyTroubleMyAttempt();
	}
	
	@Test
	public void test1(){
		assertTrue(codeToTest.monkeyTrouble(true, true));
	}
	
	@Test
	public void test2(){
		assertTrue(codeToTest.monkeyTrouble(false, false));
	}
	
	@Test
	public void test3(){
		assertFalse(codeToTest.monkeyTrouble(true, false));
	}
	
	@Test
	public void test4(){
		assertFalse(codeToTest.monkeyTrouble(false, true));
	}
	
}
