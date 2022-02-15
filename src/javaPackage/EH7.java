package javaPackage;

public class EH7 {

	public static void main(String[] args) {
		
		int a[] = new int[7];

		try {
			a[7] = 10 / 0; // ArithmeticException
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Exception Handled");

	}

}
