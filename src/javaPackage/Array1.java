package javaPackage;

public class Array1 {

	public static void main(String[] args) {

		// Declaration of an array and Instantiation
		int a[] = new int[5];

		// Printing default value of an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Initialization of an array
		a[3] = 10;
		a[1] = 89;
		a[0] = 65;
		a[2] = 3;
		a[4] = 1;

		// a[5] = 6; // Error:- Java.lang.ArrayIndexBoundOfException

		System.out.println(a[2]);

		// Print the length of an array
		System.out.println("Total array length :- " + a.length); // length is the property of an array

		// print all array element
		for (int i = 0; i < a.length; i++) {
			System.out.println("Array value for index : " + i + " is " + a[i]);
		}

	}

}
