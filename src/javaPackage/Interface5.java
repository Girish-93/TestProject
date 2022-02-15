package javaPackage;

public class Interface5 implements Interface4, Interface3 {

	@Override
	public void a() {
		System.out.println("a method");

	}

	@Override
	public void b() {
		System.out.println("b method");

	}

	public static void main(String[] args) {
		Interface5 if5 = new Interface5();
		if5.a();
		if5.b();
	}

}
