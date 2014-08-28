/**
 * CodingBat Warmup Exercise: sumDouble (http://codingbat.com/prob/p154485)  
 * 
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum. 
 * 
 * 	sumDouble(1, 2) -> 3
 * 	sumDouble(3, 2) -> 5
 * 	sumDouble(2, 2) -> 8
 * 	sumDouble(-1, 0) -> -1
 *	sumDouble(3, 3) -> 12
 *	sumDouble(0, 0) -> 0
 *  sumDouble(0, 1) -> 1
 *  sumDouble(3, 4) -> 7
 *  
 * @author cmcneill
 *
 */

package com.mnws.java.tutorials.codingbat.warmup1.sumdouble;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SumDoubleTest {

	SumDouble codeToTest;
	
	@Before
	public void setup(){
		codeToTest = new SumDoubleMyAttempt();
	}
	
	@Test
	public void test1() {
		assertEquals(3, codeToTest.sumDouble(1, 2));
	}

	@Test
	public void test2() {
		assertEquals(5, codeToTest.sumDouble(3, 2));
	}
	
	@Test
	public void test3() {
		assertEquals(8, codeToTest.sumDouble(2, 2));
	}
	
	@Test
	public void test4() {
		assertEquals(-1, codeToTest.sumDouble(-1, 0));
	}
	
	@Test
	public void test5() {
		assertEquals(12, codeToTest.sumDouble(3, 3));
	}
	
	@Test
	public void test6() {
		assertEquals(0, codeToTest.sumDouble(0, 0));
	}
	
	@Test
	public void test7() {
		assertEquals(1, codeToTest.sumDouble(0, 1));
	}
	
	@Test
	public void test8() {
		assertEquals(7, codeToTest.sumDouble(3, 4));
	}
	
}
