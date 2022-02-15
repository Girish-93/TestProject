package javaPackage;

public class ParameterizedConstructor {

	int id; // global variable
	String name; // global variable
	String address; // global variable

	// Default Constructor
	ParameterizedConstructor() {
		System.out.println("Hello Default Constructor");
	}

	// Parameterized Constructor
	ParameterizedConstructor(int a, String b, String c) {

		id = a;
		name = b;
		address = c;
	}

	// non static method
	public void displayInformation() {
		System.out.println(id + "  " + name + "  " + address);
	}

	public static void main(String[] args) {

		// Default Constructor Calling
		ParameterizedConstructor pc = new ParameterizedConstructor();

		// Parameterized Constructor Calling
		ParameterizedConstructor pc1 = new ParameterizedConstructor(1, "Ram", "Pune");
		ParameterizedConstructor pc2 = new ParameterizedConstructor(2, "Rohan", "Mumbai");

		pc1.displayInformation();
		pc2.displayInformation();
	}

}
