package javaProgrames;

import java.util.HashMap;

public class Char {

	public static void main(String[] args) {

		String s = "minimum";

		char[] arr = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (Character d : arr) {
			if (hm.containsKey(d)) {
				hm.put(d, (hm.get(d) + 1));
			} else {
				hm.put(d, 1);
			}
		} // Printing the map/result

		for (Character c : hm.keySet()) {
			if (hm.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}

	}

}
