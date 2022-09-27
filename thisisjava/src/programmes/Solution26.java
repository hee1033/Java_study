package programmes;

import java.util.Scanner;

public class Solution26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int left = Integer.parseInt(sc.nextLine());
		int right = Integer.parseInt(sc.nextLine());
		
		int n = left;
		int cnt = 0;
		int sum = 0;
		
		for(int i=n;i<=right;i++) {
			cnt = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt%2==0) {
				sum+=i;
			}else {
				sum-=i;
			}
		}
		System.out.println(sum);
	}

}
