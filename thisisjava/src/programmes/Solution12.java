package programmes;

import java.util.Scanner;

public class Solution12 {

	public static void main(String[] args) {
		
		//평균 구하기
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		int[] arr = new int[] {1,2,3,4};
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		double avg = sum/arr.length;
		System.out.println(avg);

	}

}
