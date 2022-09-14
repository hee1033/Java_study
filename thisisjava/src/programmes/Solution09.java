package programmes;

import java.util.Scanner;

public class Solution09 {
	public static void main(String[] args) {
		
		//정수 제곱근 판별
		Scanner sc = new Scanner(System.in);
		
		long n = Integer.parseInt(sc.nextLine());
		
		double result = Math.sqrt(n);
		
		if(result - (int) Math.sqrt(n) == 0) {
			result = (result+1)*(result+1);
		}else {
			result = -1;
		}
		System.out.println(result);
	}
}
