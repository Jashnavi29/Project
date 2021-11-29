package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	@Test
	private void testA1() {
	    System.out.println("Test A111");
        System.out.println("test24545");
	    System.out.println("test a333");
	    System.out.println("test a1221");

	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}
	@Test
	private void testA2() {
	    System.out.println("Test A222");
	    System.out.println("test 4444");

	    System.out.println("test a222");
	    System.out.println("test1243r43t");

	}

	@AfterClass
	private void AfterClass() {
		System.out.println("After Class");
	}
}
