package programmes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int m = Integer.parseInt(sc.nextLine());

		int[] result = new int[2];
		
		List<Integer> arr1 = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				arr1.add(i);
			}
		}
		
		List<Integer> arr2 = new ArrayList<>();
		for(int i=1;i<=m;i++) {
			if(m%i==0) {
				arr2.add(i);
			}
		}
		
		//최대공약수
		for(int i : arr1) {
			boolean isEquals = false;
			for(int j : arr2) {
				if(i == j) {result[0] = i;}
			}
		}
		
		//최소공배수
		result[1] = (n*m)/result[0];
		
		
		
	}
}
