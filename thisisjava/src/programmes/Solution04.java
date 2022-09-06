package programmes;

import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 987;
		int result = 0;
		
		String str = String.valueOf(n);
		String[] sum = str.split("");
		
		for(int i=0;i<sum.length;i++) {
			result += Integer.parseInt(sum[i]);
		}
		
		System.out.println(result);
	}

}
