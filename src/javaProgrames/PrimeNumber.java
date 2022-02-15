package javaProgrames;

public class PrimeNumber {

	// 13/13 -Number divisible by itself is called prime number
	// 2 is the lowest prime number
	// 3
	public static boolean isPrimeNumber(int num) {

		// Edge or Corner cases
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		System.out.println("Prime numbers upto " + num);
		System.out.println();

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "  ");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(isPrimeNumber(2));
		getPrimeNumbers(7);
		getPrimeNumbers(13);
		getPrimeNumbers(20);
	}

}
