package programmes;

import java.util.Arrays;
import java.util.Scanner;

public class Solution16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String chStr ="";
		
		int n = Integer.parseInt(sc.nextLine());
		char result = 0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch+n>'z') {
				result = (char)(ch+n-26);
			}else if(ch+n>'Z' && ch<'a') {
				result = (char)(ch+n-26);
			}else if(ch == ' ') {
				result = (char)' ';
			}else {
				result = (char)(ch+n);
			}
			chStr += String.valueOf(result);
		}
		System.out.println(chStr);
	}

}
