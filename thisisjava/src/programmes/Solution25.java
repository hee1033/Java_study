package programmes;

import java.util.Scanner;

public class Solution25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[]	{-3,-1,0,2};
		
		int sum =0;
		
		for(int i=0;i<a.length;i++) {
			sum += (a[i]*b[i]);
		}
		System.out.println(sum);
	}

}
