package javaPackage;

public class MethodOverride7 {

	public static void main(String[] args) {

		// Assigning parent class reference to child class object - Dynamic Method
		// Dispatch
		MethodOverride5 mo5 = new MethodOverride6();
		mo5.cook();
		mo5.eat();
		// mo5.angry();

	}

}
