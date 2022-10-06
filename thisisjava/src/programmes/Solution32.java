package programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String result ="";
	    char str = ' ';
		int idx = 0;
		
        for(int i=0;i<s.length();i++) {
			str = s.charAt(i);
            idx++;
            if(s.charAt(i) == ' '){
                idx = 0;
            }
            if(idx%2==1) {
			    result += String.valueOf(s.charAt(i)).toUpperCase();
			}else{
                result += String.valueOf(s.charAt(i)).toLowerCase();
            }   
		}
		System.out.println(result);
		

	}

}
