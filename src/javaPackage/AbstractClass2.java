package javaPackage;

public class AbstractClass2 extends AbstractClass1 {

	public static void main(String[] args) {
		AbstractClass2 ac2 = new AbstractClass2();
		ac2.eat();
		ac2.a();

	}

	@Override
	void eat() {
		System.out.println("Eating");

	}

}
