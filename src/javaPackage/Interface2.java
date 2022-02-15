package javaPackage;

public class Interface2 implements Interface1 {

	@Override
	public void a() {
		System.out.println("a method");
	}

	public static void main(String[] args) {
		Interface2 if2 = new Interface2();
		if2.a();
	}

}
