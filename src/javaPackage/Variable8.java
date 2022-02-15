package javaPackage;

public class Variable8 {

	int b = 10; // Global Variable
	static int c = 5; // static variable

	public static void main(String[] args) {

		int a = 6; // local variable

		Variable8 v8 = new Variable8();

		System.out.println(v8.b); // 10 // Calling a variable using Object reference
		System.out.println(c); // 5
		a(); // Calling a method
	}

	public static void a() {
		int f = 15; // local variable
		System.out.println(f); // 15
		System.out.println("Hello Selenium");

	}

}
