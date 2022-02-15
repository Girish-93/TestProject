package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	// @Test
	public void a() {
		System.out.println("a test method");
	}

	// As Experience professional,will use this
	@Test(enabled = false) // Always recommended in Industry
	public void b() {
		System.out.println("b test method");
	}

	// Test case will execute 2 times
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c test method");
	}

	// Test case will execute 0 times,means test case will skip
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("d test method");
	}

	// Correct way but not recommended
	@Test
	public void e() {
		System.out.println("e test method");
		throw new SkipException("Skipping e method");
		// System.out.println("Method Skipped");
	}

}
