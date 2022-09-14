package programmes;

import java.util.Scanner;

public class Solution07 {

	public static void main(String[] args) {

		//나머지가 1이되는 수 찾기
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());

		int[] arr = new int[n];
		
		int idx = 0;
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 1) {
				arr[idx] = i;
				idx++;
			} else {
				continue;
			}
		}
		int min = arr[0];
		
		System.out.println(min);
		
	}

}
