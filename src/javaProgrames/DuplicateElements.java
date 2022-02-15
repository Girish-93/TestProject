package javaProgrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class DuplicateElements {

	public static void main(String[] args) {

		// 1.Compare each element :O(n*n) Time Complexity

		String names[] = { "Java", "Javascript", "Python", "Ruby", "C", "Java", "C" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Element is:: " + names[i]);
				}
			}
		}

		System.out.println("**********");

		// 2.using Hashset: Java Collection: it stores unique values : O(n)
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Element is:: " + name);
			}
		}

	}

}
