/**
 * CodingBat Warmup Exercise: frontBack (http://codingbat.com/prob/p123384) 
 * 
 * Given a string, return a new string where the first and last chars have been exchanged. 
 * 
 * frontBack("code") -> "eodc"
 * frontBack("a") -> "a"
 * frontBack("ab") -> "ba"
 */
package com.mnws.java.tutorials.codingbat.warmup1.frontback;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FrontBackTest {

	FrontBack codeToTest;
	
	@Before
	public void setUp() throws Exception {
		codeToTest = new FrontBackMyAttempt();
	}

	@Test
	public void test1() {
		assertEquals("eodc", codeToTest.frontBack("code"));
	}

	@Test
	public void test2() {
		assertEquals("a", codeToTest.frontBack("a"));
	}
	
	@Test
	public void test3() {
		assertEquals("ba", codeToTest.frontBack("ab"));
	}
	
	@Test
	public void test4() {
		assertEquals("", codeToTest.frontBack(""));
	}
	
	@Test
	public void test5() {
		assertEquals("ehocolatC", codeToTest.frontBack("Chocolate"));
	}
	
	@Test
	public void test6() {
		assertEquals("Java", codeToTest.frontBack("aavJ"));
	}
	
	@Test
	public void test7() {
		assertEquals("oellh", codeToTest.frontBack("hello"));
	}
	
}
