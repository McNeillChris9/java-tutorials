/**
 * CodingBat Warmup Exercise: makes10 (http://codingbat.com/prob/p182873) 
 *  
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. 
 * 
 * makes10(9, 10) -> true
 * makes10(9, 9) -> false
 * makes10(1, 9) -> true
 * makes10(10, 1) -> true
 * makes10(10, 10) -> true
 * makes10(8, 2) -> true
 * makes10(8, 3) -> false
 * makes10(10, 42) -> true
 * makes10(12, -2) -> true
**/

package com.mnws.java.tutorials.codingbat.warmup1.makes10;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Makes10Test {

	Makes10 codeToTest;
	
	@Before
	public void setup(){
		codeToTest = new Makes10MyAttempt();		
	}
	
	@Test
	public void test1() {
		assertTrue(codeToTest.makes10(9, 10));
	}

	@Test
	public void test2() {
		assertFalse(codeToTest.makes10(9, 9));
	}
	
	@Test
	public void test3() {
		assertTrue(codeToTest.makes10(1, 9));
	}
	
	@Test
	public void test4() {	
		assertTrue(codeToTest.makes10(10, 1));
	}
	
	@Test
	public void test5() {
		assertTrue(codeToTest.makes10(10, 10));
	}
	
	@Test
	public void test6() {
		assertTrue(codeToTest.makes10(8, 2));
	}
	
	@Test
	public void test7() {
		assertFalse(codeToTest.makes10(8, 3));
	}
	
	@Test
	public void test8() {
		assertTrue(codeToTest.makes10(10, 42));
	}
	
	@Test
	public void test9() {
		assertTrue(codeToTest.makes10(12, -2));
	}
	
	
	
}
