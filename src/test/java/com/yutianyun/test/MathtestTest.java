package com.yutianyun.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathtestTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetnum() {
		System.out.println("这里是setnum测试");
		Mathtest m1=new Mathtest();
		m1.setnum(1, 2, 3, 4, 5);
			System.out.println(m1.numbers[0]);
			System.out.println(m1.numbers[1]);
			System.out.println(m1.numbers[2]);
			System.out.println(m1.numbers[3]);
			System.out.println(m1.numbers[4]);	
	}
	@Test
	public void testCount1() {
		System.out.println("这里是count1测试");
		Mathtest m2=new Mathtest();
		m2.setnum(1, -2, 3, -4, 5);
		m2.count1();
	}
	@Test
	public void testCount2() {
		System.out.println("这里是count2测试");
		Mathtest m3=new Mathtest();
		m3.setnum(1, -2, 3, 4, 5);
		m3.count2();
	}
	@Test
	public void test2Count2() 
	{
		System.out.println("这里是装模块count2测试");
		Mathtest2 m3=new Mathtest2();
		m3.setnum(1, -2, 3, 4, 5);
		m3.count2();
    }
	
	@Test
	public void covertest() 
	{
		System.out.println("这里是覆盖装测试");
		Mathtest m4=new Mathtest();
		m4.setnum(1, 2, 3, 4, 5);
		m4.count2();
		m4.setnum(-1,-2,3,4,5);
		m4.count1();
		m4.setnum(-1,2,3,4,5);
		m4.count1();
    }
}   
