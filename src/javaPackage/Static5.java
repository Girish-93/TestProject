package javaPackage;

public class Static5 {

	static int z = 5; // static variable
	int y = 1; // global variable

	// static method
	public static void a() {
		z = 10; // local variable
		System.out.println(z);
	}

	// non static method
	public void b() {
		z = 15; // local variable
		a();
	}

	public static void main(String[] args) {
		a();

		Static5 s5 = new Static5();
		s5.b();
	}
}
