package programmes;

import java.util.Arrays;
import java.util.Scanner;

public class Solution18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long num = Long.parseLong(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		
		int[] arr = new int[n];
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += num;
			arr[i]=sum;
		}
		System.out.println(Arrays.toString(arr));

	}

}
