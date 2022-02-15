package javaPackage;

public class Array2 {

	public static void main(String[] args) {

		// We can write an array in below fashion as well
		Object a[] = { 1, 2, 3, 4, 5, "Selenium", 5, 6.0 }; // Declaration and Initialization of an Object array

		int b[] = { 1, 2, 3, 4, 5 }; // Declaration and Initialization of an int array

		String s[] = { "Hi", "Hello" }; // Declaration and Initialization of String array

		System.out.println(a.length); // 8
		System.out.println(b.length); // 5
		System.out.println(s.length); // 2

		System.out.println(a[5]); // Selenium
		System.out.println(b[4]); // 5
		System.out.println(s[1]); // Hello

		a[5] = "Automation"; // Modifying Array value using index
		System.out.println(a[5]); // Automation
	}

}
