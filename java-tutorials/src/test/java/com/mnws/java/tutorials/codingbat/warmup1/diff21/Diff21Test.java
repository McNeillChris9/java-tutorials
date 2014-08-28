/**
 * CodingBat Warmup Exercise: diff21 (http://codingbat.com/prob/p116624) 
 *  
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 
 * 
 * diff21(19) -> 2
 * diff21(10) -> 11
 * diff21(21) -> 0
 * diff21(22) -> 2
 * diff21(25) -> 8
 * diff21(30) -> 18
 * diff21(0) -> 21
 * diff21(1) -> 20
 * diff21(2) -> 19
 * diff21(-1) -> 22
 * diff21(-2) -> 23
 * diff21(50) -> 58
 *  
 */

package com.mnws.java.tutorials.codingbat.warmup1.diff21;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Diff21Test {

	Diff21 codeToTest;
	
	@Before
	public void startup(){
		codeToTest = new Diff21MyAttempt();
	}
	
	@Test
	public void test1() {
		assertEquals(2, codeToTest.diff21(19));
	}

	@Test
	public void test2() {
		assertEquals(11, codeToTest.diff21(10));
	}

	@Test
	public void test3() {
		assertEquals(0, codeToTest.diff21(21));
	}
	
	@Test
	public void test4() {
		assertEquals(2, codeToTest.diff21(22));
	}
	
	@Test
	public void test5() {
		assertEquals(8, codeToTest.diff21(25));
	}
	
	@Test
	public void test6() {
		assertEquals(18, codeToTest.diff21(30));
	}
	
	@Test
	public void test7() {
		assertEquals(21, codeToTest.diff21(0));
	}
	
	@Test
	public void test8() {
		assertEquals(20, codeToTest.diff21(1));
	}
	
	@Test
	public void test9() {
		assertEquals(19, codeToTest.diff21(2));
	}
	
	@Test
	public void test10() {
		assertEquals(22, codeToTest.diff21(-1));
	}
	
	@Test
	public void test11() {
		assertEquals(23, codeToTest.diff21(-2));
	}
	
	@Test
	public void test12() {
		assertEquals(58, codeToTest.diff21(50));
	}
	

	
}
