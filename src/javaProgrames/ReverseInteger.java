package javaProgrames;

public class ReverseInteger {

	public static void main(String[] args) {

		//1.Using algorithm
		int num = 12345;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse num is::" + rev);
		
		//2.Using StringBuffer method
		long num1=3268794;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
