package javaProgrames;

public class StringSwap {

	public static void main(String[] args) {

		String a = "Hello";
		String b = " World";

		System.out.println("Before swaping");
		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);

		// 1.append a and b
		a = a + b;// HelloWorld

		// 2.Store initial string a in string b
		b = a.substring(0, a.length() - b.length());

		// 3.Store initial string b in string a
		a = a.substring(b.length());

		System.out.println("the value of a & b after swapping");

		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);

	}

}
