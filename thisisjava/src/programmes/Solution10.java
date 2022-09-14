package programmes;

import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {
		
		//약수의 합
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
