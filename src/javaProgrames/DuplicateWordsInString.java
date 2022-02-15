package javaProgrames;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	// Hey java is java my best language is java
	// java:3
	// is:2

	public static void findDuplicateWords(String inputString) {
		// Split:
		String words[] = inputString.split(" ");

		// Create one HashMap
		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		// to check each word in given array
		for (String word : words) {

			// if word is present:
			if (wordCount.containsKey(word)) {
				wordCount.put(word.toLowerCase(), wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		// Extracting all the keys of map - wordCount:
		Set<String> wordsInString = wordCount.keySet();

		// loop through all the words in wordCount:
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}

	}

	public static void main(String[] args) {
		findDuplicateWords("Hey java is java my best language is java");
		findDuplicateWords("python is very good and it is python");

	}

}
