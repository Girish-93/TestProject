package javaProgrames;

public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3

		int cube = 0;
		int r;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}

		if (t == cube) {
			System.out.println("this is armstrong number");
		} else {
			System.out.println("Not an armstrong number");
		}
	}

	public static void main(String[] args) {

		isArmstrongNumber(153);
		isArmstrongNumber(407);
		isArmstrongNumber(0);
	}

}
