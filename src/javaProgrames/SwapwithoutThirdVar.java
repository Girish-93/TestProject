package javaProgrames;

public class SwapwithoutThirdVar {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
//
//		// 1.With using third var : t
//		int t;
//		t = x;//5
//		x = y;//10
//		y = t;//5

		// System.out.println(x);// 10
		// System.out.println(y);// 5

		// 2.without using third var: using + operator
		x = x + y;// 15
		y = x - y;// 5
		x = x - y;// 10

		// 3.without using third var: using * operator

		x = x * y;// 50
		y = x / y;// 5
		x = x / y;// 10

		// 4.without using third var: using Xor operator

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.println(x);// 10
		System.out.println(y);// 5

	}

}
