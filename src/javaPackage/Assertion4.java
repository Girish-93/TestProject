package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 {

	@Test
	public void testCase5() {

		int i = 30;
		int j = 30;

		try {
			Assert.assertTrue(i > j);
		} catch (AssertionError e) {
			e.printStackTrace();
		}

		System.out.println("Assertion Fail");

		if (i == j) {
			System.out.println("Test Case is pass");
		} else {
			System.out.println("Test Case is fail");
		}
	}

}
