package javaPackage;

public class BreakStatement2 {

	public static void main(String[] args) {

		// Outer Loop
		for (int i = 1; i < 3; i++) {

			// inner loop
			for (int j = 1; j < 3; j++) {

				// if statement
				if (i == 2 && j == 2) {
					break;
				}

				System.out.println(i + "    " + j);
			}

			System.out.println("Control came out from inner loop");
		}

		System.out.println("Control came out from outer loop");

	}
}
