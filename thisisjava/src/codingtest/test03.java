package codingtest;

import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String inputNum = sc.nextLine();
		String[] arr = inputNum.split(",");
		
		int m;
		int k = 1;
		
		for(int i=0;i<arr.length;i++) {
			  m = Integer.parseInt(arr[i]);
			  k *= m;
		}
		
		String strNum = String.valueOf(k);

		String[] strCnt = strNum.split("");
		int[] cntNum = new int[10];

		for (int i = 0; i < strNum.length(); i++) {
			for (int j = 0; j < 10; j++) {
				if (strCnt[i].equals(String.valueOf(j))) {
					cntNum[j]++;
				}
			}
		}
		
		for(int n : cntNum) {
			System.out.println(n);
		}
	}
}
