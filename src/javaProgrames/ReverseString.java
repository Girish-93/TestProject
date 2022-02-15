package javaProgrames;

public class ReverseString {

	public static void main(String[] args) {

		// 1.Using for loop
		 
		  String s = "Sushma";

		
		  int len = s.length();// 8 
		  String rev = "";
		  
		  for (int i = len - 1; i >= 0; i--) {
			  rev = rev + s.charAt(i);
			  }
		  System.out.println(rev);
		  
	}
		 

		// 2.using Stringbuffer class
		//StringBuffer sf = new StringBuffer(s);
		//System.out.println(sf.reverse());
	}

