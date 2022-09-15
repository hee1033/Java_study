package programmes;

import java.util.Arrays;
import java.util.Scanner;

public class Solution14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = sc.nextLine().split("");
		String strNum = "";
		
		Arrays.sort(arr);
		for(int i=arr.length-1;i>=0;i--) {
			strNum +=arr[i];
		}
		
		long result = Long.parseLong(strNum);
		
	}

}
