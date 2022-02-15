package javaProgrames;

import java.util.Arrays;

public class PrintDuplicates1 {

	private static void printDupes(String str) {
		str =str.toLowerCase();
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]==' '||ch[i]=='0'){
				continue;
			}
			int count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]){
					ch[j]='0';
					count++;
				}
			}
			//
			System.out.println(Arrays.toString(ch));
			if(count>1) {
				System.out.println(ch[i]);
			}
		}
	}

	public static void main(String[] args) {

		String str = "NaamShabana";
		printDupes(str);

	}

}
