package javaPackage;

public class Array3 {

	public static void passingArrayToMethod(int a[]) {

		int b = a[0];

		for (int i = 0; i < a.length; i++) {
			if (b >= a[i]) {
				System.out.println(b);
			} else {
				System.out.println("abcd");
			}
		}
	}

	public static void main(String[] args) {

		int c[] = { 22, 2, 44, 5 }; // Declaration and Initialization of an array
		passingArrayToMethod(c);

	}

}
