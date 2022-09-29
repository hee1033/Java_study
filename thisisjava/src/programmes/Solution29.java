package programmes;

import java.util.Scanner;

public class Solution29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n; // 가로
		int m; // 세로
		
		
		String[] str = sc.nextLine().split(" ");
		
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
