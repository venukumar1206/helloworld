package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstPropgram 
{
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("I am in Before Class");
		
	}
	@BeforeMethod
	public void BeforeMethos()
	{
		System.out.println("In Before method ");
		System.out.println("------------------------------------");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("in Test 1");
		System.out.println("");
	}
	@Test
	public void Test2()
	{
		System.out.println("in Test 1");
		System.out.println("");
	}
	@Test
	public void Test3()
	{
		System.out.println("in Test 1");
		System.out.println("");
	}
	@Test
	public void Test4()
	{
		System.out.println("in Test 1");
		System.out.println("");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("In After method ");
		System.out.println("-----------------------------------");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
}
