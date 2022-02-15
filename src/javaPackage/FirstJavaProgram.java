package javaPackage;

public class FirstJavaProgram {

	// main method or main function - Double slash used for comments
	public static void main(String[] args) {

		System.out.println("Hello Automation Engineers,You are most welcome");// Printing string arguments
		System.out.println("Girish");
		System.out.println("Sandi");
		System.out.println(1234);
		aMethod();
		bMethod();
	}

	// User defined static method
	public static void aMethod() {
		System.out.println("A method");
	}

	public static void bMethod() {
		System.out.println("B method");
	}
}
