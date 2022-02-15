package javaProgrames;

public class PalindromeNumber {

	// 151
	public static void isPalindrome(int num) {
		int sum = 0;
		int r = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;// get the remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not Palindrome number");
		}
	}

	public static void main(String[] args) {
		isPalindrome(151);
		isPalindrome(0);
		isPalindrome(123);

	}

}
