/**
 * CodingBat Warmup Exercise: parrotTrouble (http://codingbat.com/prob/p140449) 
 *  
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble. 
 * 
 * parrotTrouble(true, 6) -> true
 * parrotTrouble(true, 7) -> false
 * parrotTrouble(false, 6) -> false
 * parrotTrouble(true, 21) -> true
 * parrotTrouble(false, 21) -> false
 * parrotTrouble(false, 20) -> false
 * parrotTrouble(true, 23) -> true
 * parrotTrouble(false, 23) -> false
 * parrotTrouble(true, 20) -> false
 * parrotTrouble(false, 12) -> false
 *  
 */


package com.mnws.java.tutorials.codingbat.warmup1.parrottrouble;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ParrotTroubleTest {

	ParrotTrouble codeToTest;
	
	@Before
	public void setup(){
		codeToTest = new ParrotTroubleMyAttempt();
	}
	
	@Test
	public void test1() {
		assertTrue(codeToTest.parrotTrouble(true,  6));
	}
	
	@Test
	public void test2() {
		assertFalse(codeToTest.parrotTrouble(true,  7));
	}
	
	@Test
	public void test3() {
		assertFalse(codeToTest.parrotTrouble(false,  6));
	}
	
	@Test
	public void test4() {
		assertTrue(codeToTest.parrotTrouble(true,  21));
	}
	
	@Test
	public void test5() {
		assertFalse(codeToTest.parrotTrouble(false,  21));
	}
	
	@Test
	public void test6() {
		assertFalse(codeToTest.parrotTrouble(false,  20));
	}
	
	@Test
	public void test7() {
		assertTrue(codeToTest.parrotTrouble(true,  23));
	}

	@Test
	public void test8() {
		assertFalse(codeToTest.parrotTrouble(false,  23));
	}
	
	@Test
	public void test9() {
		assertFalse(codeToTest.parrotTrouble(true,  20));
	}
	
	@Test
	public void test10() {
		assertFalse(codeToTest.parrotTrouble(false,  12));
	}
}
