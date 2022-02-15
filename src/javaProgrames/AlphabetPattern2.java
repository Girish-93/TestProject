package javaProgrames;

public class AlphabetPattern2 {

	//A-Z : 65 to 70
	//a-z : 97 to 122
	public static void main(String[] args) {

		int alpha = 65;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha) + " ");
			}
			alpha++;
			System.out.println();
		}

	}

}
