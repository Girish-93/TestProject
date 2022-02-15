package javaProgrames;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates2 {
	
	public static void duplicateInAString(String str) {
		
		String text = str.toLowerCase();
		Set<Char> charSet = new LinkedHashSet<Char>();
		
		for(int i=0;i<text.length();i++) {
			for(int j=i+1;j<text.length();j++) {
				if(text.charAt(i)==text.charAt(j)) {
					charSet.addAll(charSet);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		duplicateInAString("NaamShabhana");
	}

}
