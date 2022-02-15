package javaPackage;

public class Static3 {
	
	int roll; // non static global variable
	String name; // non static global variable
	static String college = "Balaji"; // static variable

	Static3(int r, String n) {
		roll = r;
		name = n;
	}

	public void getResult() {
		System.out.println(roll + "  " + name + "  " + college);
	}


}
