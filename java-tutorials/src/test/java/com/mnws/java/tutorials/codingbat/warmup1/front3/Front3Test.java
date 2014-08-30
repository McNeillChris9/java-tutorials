/**
 * CodingBat Warmup Exercise: front3 (http://codingbat.com/prob/p136351) 
 * 
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front. 
 * 
 * front3("Java") -> "JavJavJav"
 * front3("Chocolate") -> "ChoChoCho"
 * front3("abc") -> "abcabcabc"
 */
package com.mnws.java.tutorials.codingbat.warmup1.front3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Front3Test {

	Front3 codeToTest;
	
	@Before
	public void setUp() throws Exception {
		codeToTest = new Front3MyAttempt();
	}

	@Test
	public void test1() {
		assertEquals("JavJavJav", codeToTest.front3("Java"));
	}
	
	@Test
	public void test2() {
		assertEquals("ChoChoCho", codeToTest.front3("Chocolate"));
	}
	
	@Test
	public void test3() {
		assertEquals("abcabcabc", codeToTest.front3("abc"));
	}

	@Test
	public void test4() {
		assertEquals("abcabcabc", codeToTest.front3("abcXYZ"));
	}
	
	@Test
	public void test5() {
		assertEquals("ababab", codeToTest.front3("ab"));
	}
	
	@Test
	public void test6() {
		assertEquals("aaa", codeToTest.front3("a"));
	}
	
	@Test
	public void test7() {
		assertEquals("", codeToTest.front3(""));
	}
}
