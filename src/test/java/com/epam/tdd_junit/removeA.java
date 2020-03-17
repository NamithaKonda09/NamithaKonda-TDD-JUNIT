package com.epam.tdd_junit;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class removeA {
	/*
	 * TODO list:
	 * 1."ABCD"="BCD"
	 * 2."AACD"="CD"
	 * 3."BBAA"="BBAA"
	 * 4."AABAA"="BAA"
	 * 5."A"=""
	 * 6.""=""
	 * 7."AA"=""
	 * 
	 */
	remove r;
	
	@BeforeEach
	void setup()
	{
		r=new remove();
	}
	@Test
	void test1()
	{
		
		assertEquals("BCD",r.func("ABCD"));
	}
	@Test
	void test2()
	{
		assertEquals("CD",r.func("AACD"));
	}
	@Test
	void test3()
	{
	
		assertEquals("BBAA",r.func("BBAA"));
	}
	@Test
	void test4()
	{
	
		assertEquals("BAA",r.func("AABAA"));
	}
	@Test
	void test5()
	{
	
		assertEquals("",r.func("A"));
	}
	@Test
	void test6()
	{
	
		assertEquals("",r.func(""));
	}
	@Test
	void test7()
	{
	
		assertEquals("",r.func("AA"));
	}
	
	
	
	

}
