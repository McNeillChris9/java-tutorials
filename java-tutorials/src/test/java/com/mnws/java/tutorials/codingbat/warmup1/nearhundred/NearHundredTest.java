/**
 * CodingBat Warmup Exercise: nearHundred (http://codingbat.com/prob/p184004) 
 *  
 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
 * 
 * nearHundred(93) -> true
 * nearHundred(90) -> true
 * nearHundred(89) -> false
 * nearHundred(110) -> true
 * nearHundred(111) -> false
 * nearHundred(121) -> false
 * nearHundred(0) -> false
 * nearHundred(5) -> false
 * nearHundred(191) -> true
 * nearHundred(189) -> false
 * nearHundred(190) -> true
 * nearHundred(200) -> true
 * nearHundred(210) -> true
 * nearHundred(211) -> false
 * nearHundred(290) -> false
 *  
 */

package com.mnws.java.tutorials.codingbat.warmup1.nearhundred;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class NearHundredTest {

	NearHundred codeToTest;
	
	@Before
	public void setup(){
		codeToTest = new NearHundredMyAttempt();
	}
	
	@Test
	public void test1() {
		assertTrue(codeToTest.nearHundred(93));
	}
	
	@Test
	public void test2() {
		assertTrue(codeToTest.nearHundred(90));
	}
	
	@Test
	public void test3() {
		assertFalse(codeToTest.nearHundred(89));
	}
	
	@Test
	public void test4() {
		assertTrue(codeToTest.nearHundred(110));
	}
	
	@Test
	public void test5() {
		assertFalse(codeToTest.nearHundred(111));
	}
	
	@Test
	public void test6() {
		assertFalse(codeToTest.nearHundred(121));
	}
	
	@Test
	public void test7() {
		assertFalse(codeToTest.nearHundred(0));
	}
	
	@Test
	public void test8() {
		assertFalse(codeToTest.nearHundred(5));
	}
	
	@Test
	public void test9() {
		assertTrue(codeToTest.nearHundred(191));
	}
	
	@Test
	public void test10() {
		assertFalse(codeToTest.nearHundred(189));
	}
	
	@Test
	public void test11() {
		assertTrue(codeToTest.nearHundred(190));
	}
	
	@Test
	public void test12() {
		assertTrue(codeToTest.nearHundred(200));
	}
	
	@Test
	public void test13() {
		assertTrue(codeToTest.nearHundred(210));
	}
	
	
	@Test
	public void test14() {
		assertFalse(codeToTest.nearHundred(211));
	}
	
	
	@Test
	public void test15() {
		assertFalse(codeToTest.nearHundred(290));
	}
	
	

}
