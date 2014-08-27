package com.mnws.java.tutorials.codingbat.arraylike;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class ArrayLikeTest {
	
	ArrayLike testClass;
	
	@Before
	public void setup()
	{
		testClass = new ArrayLikeSolution();
	}
	
	@Test
	public void test1()
	{		
		int[] arr = {1, 6, 8, 7, 0, 0};
		assertTrue(testClass.arrayLike(arr, 8));	
	}
	
	@Test 
	public void test2()
	{
		int[] arr = {1, 6, 8, 7, 0, 0};
		assertFalse(testClass.arrayLike(arr, 4));		
	}
	
	@Test
	public void test3()
	{
		int[] arr = {1, 6, 8, 7, 0, 0};
		assertTrue(testClass.arrayLike(arr, 2));
	}	
	
	@Test
	public void test4()
	{
		int[] arr = {1, 6, 8, 7, 0, 0};
		assertFalse(testClass.arrayLike(arr, 9));
	}
	
	@Test
	public void test5()
	{
		int[] arr = {11, 11, 5, 5, 1, 11, 4};
		assertFalse(testClass.arrayLike(arr, 11));
	}
	
	@Test
	public void test6()
	{
		int[] arr = {11, 11, 5, 5, 1, 11, 4};
		assertFalse(testClass.arrayLike(arr, 5));
	}
	
	@Test
	public void test7()
	{
		int[] arr = {11, 11, 5, 5, 1, 11, 4};
		assertTrue(testClass.arrayLike(arr, 3));
	}
	
	@Test
	public void test8()
	{
		int[] arr = {};
		assertTrue(testClass.arrayLike(arr, 3));
	}
	
	@Test
	public void test9()
	{
		int[] arr = {1, 11};
		assertTrue(testClass.arrayLike(arr, 3));
	}
	
	@Test
	public void test10()
	{
		int[] arr = {1, 11};
		assertTrue(testClass.arrayLike(arr, 1));
	}
}
