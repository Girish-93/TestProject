package javaPackage;

public class Array4 {

	public static void main(String[] args) {

		// Declaration and Initialization of multi dimensional array
		int a[][] = { { 1, 2, 3, 7 }, { 4, 5, 6, 0 }, { 7, 8, 9, 6 } };

		// Total rows
		int row = a.length; // length is a property of an array
		System.out.println("Total Rows : " + row);

		// Total Columns
		int column = a[0].length;
		System.out.println("Total Column : " + column);

		// Print all data from Multi Dimensional array
		// Outer Loop
		for (int i = 0; i < row; i++) {

			// Inner Loop
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
