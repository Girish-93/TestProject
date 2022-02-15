package javaProgrames;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "!@# String  Selenium ^&*(";
		
		String s1 = "@$#$%&& Java %$&##@@ Selenium";

		// Regular Expression : [^a-zA-Z0-9]

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
