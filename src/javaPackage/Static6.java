package javaPackage;

public class Static6 {

	int x = 10; // global variable
	static int y = 5; // static variable

	// non static method
	public void a() {
		int z = 10; // local variable
		System.out.println(z);
	}

	static int b = 6; // static variable

	// static method
	public static void b() {
		int a = 5; // local variable
		System.out.println(a);
	}

	public static void main(String[] args) {

		Static6 s6 = new Static6();
		s6.a();
		System.out.println(s6.b); // Not appropriate
		System.out.println(Static6.b); // It seems to be appropriate but not correct in case of same class
		System.out.println(b); // completely correct
		b();
	}

}
