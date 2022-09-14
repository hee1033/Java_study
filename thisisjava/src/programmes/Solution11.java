package programmes;

import java.util.Scanner;

public class Solution11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long longNum = Integer.parseInt(sc.nextLine());
		
		String[] strNum = String.valueOf(longNum).split("");
		
		int[] num = new int[strNum.length];
		int idx = 0;
		for(int i=strNum.length-1;i>=0;i--) {
			num[idx] = Integer.parseInt(strNum[i]);
			idx++;
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]);
		}
		
	}
}
