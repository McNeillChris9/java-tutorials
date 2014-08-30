/**
 * CodingBat Practice Exercise: helloName (http://codingbat.com/prob/p171896) 
 *  
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 * 
 * helloName("Bob") -> "Hello Bob!"
 * helloName("Alice") -> "Hello Alice!" 
 * helloName("X") -> "Hello X!"
 * helloName("Dolly") -> "Hello Dolly!"
 * helloName("Alpha") -> "Hello Alpha!"
 * helloName("Omega") -> "Hello Omega!"
 * helloName("Goodbye") -> "Hello Goodbye!"
 * helloName("ho ho ho") -> "Hello ho ho ho!"	
 * helloName("xyz!") -> "Hello xyz!!"	
 * helloName("Hello") -> "Hello Hello!"	
 *  
 */

package com.mnws.java.tutorials.codingbat.string1.helloname;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloNameTest {

	HelloName codeToTest;
	
	@Before 
	public void setup(){
		codeToTest = new HelloNameMyAttempt();
	}
	
	@Test
	public void test1() {
		assertEquals("Hello Bob!", codeToTest.helloName("Bob"));
	}
	
	@Test
	public void test2(){
		assertEquals("Hello Alice!", codeToTest.helloName("Alice"));		
	}
	
	@Test
	public void test3(){
		assertEquals("Hello X!", codeToTest.helloName("X"));		
	}
	
	@Test
	public void test4(){
		assertEquals("Hello Dolly!", codeToTest.helloName("Dolly"));		
	}
	
	@Test
	public void test5(){
		assertEquals("Hello Alpha!", codeToTest.helloName("Alpha"));		
	}
	
	@Test
	public void test6(){
		assertEquals("Hello Omega!", codeToTest.helloName("Omega"));		
	}
	
	@Test
	public void test7(){
		assertEquals("Hello Goodbye!", codeToTest.helloName("Goodbye"));		
	}
	
	@Test
	public void test8(){
		assertEquals("Hello ho ho ho!", codeToTest.helloName("ho ho ho"));		
	}
	
	@Test
	public void test9(){
		assertEquals("Hello Hello!", codeToTest.helloName("Hello"));		
	}

}
