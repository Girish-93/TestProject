package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {

		int a = 300; // local variable
		int b = 300; // local variable

		if (a != b) {
			System.out.println("a is not equal to b");
		} else {
			System.out.println("a and b are equal");
		}

		String p = "HeLlo SElenium";
		String q = "Hello Selenium";

		// 1st way of String Comparison is not correct
		// We always use == for number comparison
		if (p == q) {
			System.out.println("p and q are equal for first way");
		} else {
			System.out.println("p and q are not equal for first way");
		}

		// 2nd way of String Comparison is not appropriate
		if (p.equals(q)) {
			System.out.println("p and q are equal for 2nd way");
		} else {
			System.out.println("p and q are not equal for 2nd way");
		}

		// 3rd way of String Comparison is correct
		if (p.equalsIgnoreCase(q)) {
			System.out.println("p and q are equal for 3rd way");
		} else {
			System.out.println("p and q are not equal for 3rd way");
		}

	}

}
