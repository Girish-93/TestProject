package javaPackage;

public class EH1 {

	public static void main(String[] args) {

		try {
			int a = 20 / 0; // ArithmeticException
		} catch (ArithmeticException a) {
			a.printStackTrace();
			System.out.println(a);
		} catch (NullPointerException n) {
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			int a = 10 / 0; // ArithmeticException
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally will execute always");
		}

	}

}
