package programmes;

import java.util.Scanner;

public class Solution08 {

	public static void main(String[] args) {
		
		//짝수와 홀수
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		String result = " ";
		
		if(num%2==0) {
			result = "Even";
		}else {
			result = "Odd";
		}
		
		System.out.println(result);
	}

}
