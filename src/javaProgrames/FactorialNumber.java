package javaProgrames;

public class FactorialNumber {

	// fact of 3 = 3*2*1 = 6
	// fact of 4 = 4*3*2*1 = 24

	// 1.without recursive -- use for loop
	public static int factorial(int num) {
		int fact = 1;
		if (num == 0)
			return 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;// 1*2*3*4
		}

		return fact;
	}

	// 2.with Recursive function : a function is calling itself
	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return (num * (num - 1));
	}

	public static void main(String[] args) {

		System.out.println(factorial(4));
		System.out.println(factorial(1));
		System.out.println(fact(3));
		System.out.println(fact(0));
		System.out.println(fact(10));
	}

}
