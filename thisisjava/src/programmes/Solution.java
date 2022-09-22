package programmes;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.nextLine());
		int y= Integer.parseInt(sc.nextLine());
		
		long sum = 0;
		if(x<=y) {			
			for(int i=x;i<=y;i++) {
				sum += i;
			}
		}else {
			for(int i=y;i<=x;i++) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}

}
