package javaPackage;

public class Static2 {
	

	int roll; // non static global variable
	String name; // non static global variable
	String college; // non static global variable

	public static void main(String[] args) {

		Static2 s2 = new Static2();

		System.out.println(s2.roll); // 0
		System.out.println(s2.name); // null
		System.out.println(s2.college); // null
	}

}
