package javaPackage;

public class MethodOverride4 extends MethodOverload3 {
	
	public void run() {
		System.out.println("Ram is running");
	}
	
	public static void main(String[] args) {
		MethodOverride4 mo4 = new MethodOverride4();
		mo4.run();
		
		MethodOverride3 mo3 = new MethodOverride3();
		mo3.run();
	}

}
