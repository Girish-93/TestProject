package javaProgrames;

public class CheckIsNumeric {

	public static boolean isEmpty(CharSequence cs) {

		return cs == null || cs.length() == 0;

	}

	public static boolean isNumeric(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}

		int len = cs.length();
		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(isNumeric(null));
		System.out.println(isNumeric(""));
		System.out.println(isNumeric(" "));
		System.out.println(isNumeric("123"));
		System.out.println(isNumeric("@#$1245"));
		System.out.println(isNumeric("23.34"));
		System.out.println(isNumeric("+1234"));
		System.out.println(isNumeric("-345"));
		System.out.println(isNumeric("00"));

	}

}
