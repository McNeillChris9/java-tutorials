/**
 * CodingBat Warmup Exercise: notString (http://codingbat.com/prob/p191914) 
 * 
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings. 
 * 
 * notString("candy") -> "not candy"
 * notString("x") -> "not x" 
 * notString("not bad") -> "not bad" 
 * notString("not") -> "not"
 * notString("is not") -> "not is not"	
 * notString("no") -> "not no"	
 */

package com.mnws.java.tutorials.codingbat.warmup1.notstring;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NotStringTest {

	NotString codeToTest;

	@Before
	public void setUp() throws Exception {
		codeToTest = new NotStringMyAttempt();
	}

	@Test
	public void test1() {
		assertEquals("not candy", codeToTest.notString("candy"));
	}

	@Test
	public void test2() {
		assertEquals("not x", codeToTest.notString("x"));
	}

	@Test
	public void test3() {
		assertEquals("not bad", codeToTest.notString("not bad"));
	}

	@Test
	public void test4() {
		assertEquals("not", codeToTest.notString("not"));
	}

	@Test
	public void test5() {
		assertEquals("not is not", codeToTest.notString("is not"));
	}

	@Test
	public void test6() {
		assertEquals("not no", codeToTest.notString("no"));
	}

}
