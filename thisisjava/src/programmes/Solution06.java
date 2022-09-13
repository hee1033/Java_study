package programmes;

import java.util.Scanner;
public class Solution06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] num = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
				
		for(int i=0; i<10;i++) {
			str = str.replace(num[i],Integer.toString(i));
		}
		
		System.out.println(str);
		
		
		
	}

}
