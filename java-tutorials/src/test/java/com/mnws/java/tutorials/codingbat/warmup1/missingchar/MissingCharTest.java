/**
 * CodingBat Warmup Exercise: missingChar (http://codingbat.com/prob/p190570) 
 * 
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). 
 * 
 * missingChar("kitten", 1) -> "ktten"
 * missingChar("kitten", 0) -> "itten"
 * missingChar("kitten", 4) -> "kittn"
 * missingChar("Hi", 0) -> "i"	
 * missingChar("Hi", 1) -> "H"	
 * missingChar("code", 0) -> "ode"	
 * missingChar("code", 1) -> "cde"	
 * missingChar("code", 2) -> "coe"	
 * missingChar("code", 3) -> "cod"	
 * missingChar("chocolate", 8) -> "chocolat"	
 * 
 * 
 */
package com.mnws.java.tutorials.codingbat.warmup1.missingchar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MissingCharTest {

	MissingChar codeToTest;
	
	@Before
	public void setUp() throws Exception {
		codeToTest = new MissingCharMyAttempt();
	}

	@Test
	public void test1() {
		assertEquals("ktten", codeToTest.missingChar("kitten", 1));
	}
	
	@Test
	public void test2() {
		assertEquals("itten", codeToTest.missingChar("kitten", 0));
	}
	
	@Test
	public void test3() {
		assertEquals("kittn", codeToTest.missingChar("kitten", 4));
	}
	
	@Test
	public void test4() {
		assertEquals("i", codeToTest.missingChar("Hi", 0));
	}
	
	@Test
	public void test5() {
		assertEquals("H", codeToTest.missingChar("Hi", 1));
	}
	
	@Test
	public void test6() {
		assertEquals("ode", codeToTest.missingChar("code", 0));
	}
	
	@Test
	public void test7() {
		assertEquals("cde", codeToTest.missingChar("code", 1));
	}
	
	@Test
	public void test8() {
		assertEquals("coe", codeToTest.missingChar("code", 2));
	}
	
	@Test
	public void test9() {
		assertEquals("cod", codeToTest.missingChar("code", 3));
	}
	
	@Test
	public void test10() {
		assertEquals("chocolat", codeToTest.missingChar("chocolate", 8));
	}
	
}
