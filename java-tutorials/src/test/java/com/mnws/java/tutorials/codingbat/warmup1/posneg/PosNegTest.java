/**
 * CodingBat Warmup Exercise: posNeg (http://codingbat.com/prob/p159227) 
 *  
 * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative. 
 *
 * posNeg(1, -1, false) -> true
 * posNeg(-1, 1, false) -> true
 * posNeg(-4, -5, true) -> true
 * posNeg(-4, -5, false) -> false
 * posNeg(-4, 5, false) -> true
 * posNeg(-4, 5, true) -> false
 * posNeg(1, 1, false) -> false
 * posNeg(-1, -1, false) -> false
 * posNeg(1, -1, true) -> false
 * posNeg(-1, 1, true) -> false
 * posNeg(1, 1, true) -> false
 * posNeg(-1, -1, true) -> true
 * posNeg(5, -5, false) -> true
 * posNeg(-6, 6, false) -> true
 * posNeg(-5, -6, false) -> false
 * posNeg(-2, -1, false) -> false
 * posNeg(1, 2, false) -> false
 * posNeg(-5, 6, true) -> false
 * posNeg(-5, -5, true) -> true
 * 
 */
package com.mnws.java.tutorials.codingbat.warmup1.posneg;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PosNegTest {

	PosNeg codeToTest;
	
	@Before
	public void setup(){
		codeToTest = new PosNegMyAttempt();
	}
	
	@Test
	public void test1() {
		assertTrue(codeToTest.posNeg(1, -1, false));
	}
	
	@Test
	public void test2() {
		assertTrue(codeToTest.posNeg(-1, 1, false));
	}
	
	@Test
	public void test3() {
		assertTrue(codeToTest.posNeg(-4, -5, true));
	}
	
	@Test
	public void test4() {
		assertFalse(codeToTest.posNeg(-4, -5, false));
	}
	
	@Test
	public void test5() {
		assertTrue(codeToTest.posNeg(-4, 5, false));
	}
	
	@Test
	public void test6() {
		assertFalse(codeToTest.posNeg(-4, 5, true));
	}
	
	@Test
	public void test7() {
		assertFalse(codeToTest.posNeg(1, 1, false));
	}
	
	@Test
	public void test8() {
		assertFalse(codeToTest.posNeg(-1, -1, false));
	}
	
	@Test
	public void test9() {
		assertFalse(codeToTest.posNeg(1, -1, true));
	}
	
	@Test
	public void test10() {
		assertFalse(codeToTest.posNeg(1, 1, true));
	}
	
	@Test
	public void test11() {
		assertTrue(codeToTest.posNeg(-1, -1, true));
	}
	
	@Test
	public void test12() {
		assertTrue(codeToTest.posNeg(5, -5, false));
	}
	
	@Test
	public void test13() {
		assertTrue(codeToTest.posNeg(-6, 6, false));
	}
	
	@Test
	public void test14() {
		assertFalse(codeToTest.posNeg(-5, -6, false));
	}
	
	@Test
	public void test15() {
		assertFalse(codeToTest.posNeg(-2, -1, false));
	}
	
	@Test
	public void test16() {
		assertFalse(codeToTest.posNeg(1, 2, false));
	}
	
	@Test
	public void test17() {
		assertFalse(codeToTest.posNeg(-5, 6, true));
	}
	
	@Test
	public void test18() {
		assertTrue(codeToTest.posNeg(-5, -5, true) );
	}

}
