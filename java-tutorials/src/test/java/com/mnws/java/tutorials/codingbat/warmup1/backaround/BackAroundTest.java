/**
 * CodingBat Warmup Exercise: backAround (http://codingbat.com/prob/p161642) 
 *
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 *	
 * backAround("cat") -> "tcatt"
 * backAround("Hello") -> "oHelloo"
 * backAround("a") -> "aaa"
 * backAround("abc") -> "cabcc"	
 * backAround("read") -> "dreadd"	
 * backAround("boo") -> "obooo"	
 * 
 */
package com.mnws.java.tutorials.codingbat.warmup1.backaround;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BackAroundTest {

	BackAround codeToTest;

	@Before
	public void setup() {
		codeToTest = new BackAroundMyAttempt();
	}

	@Test
	public void test1() {
		assertEquals("tcatt", codeToTest.backAround("cat"));
	}

	@Test
	public void test2() {
		assertEquals("oHelloo", codeToTest.backAround("Hello"));
	}

	@Test
	public void test3() {
		assertEquals("aaa", codeToTest.backAround("a"));
	}

	@Test
	public void test4() {
		assertEquals("cabcc", codeToTest.backAround("abc"));
	}

	@Test
	public void test5() {
		assertEquals("dreadd", codeToTest.backAround("read"));
	}

	@Test
	public void test6() {
		assertEquals("obooo", codeToTest.backAround("boo"));
	}

}
