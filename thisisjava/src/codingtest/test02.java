package codingtest;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String [] b = a.split(",");

		int[] n = new int[b.length];
		
		int sum = 0;
		int cnt = 0;
		int min = 0;
		
		// 홀수의 합
		for (int i = 0; i < b.length; i++) {
			n[i] = Integer.parseInt(b[i]);
			if (n[i] % 2 == 1) {
				n[cnt] = n[i];
				sum += n[cnt];
				cnt++;
				min = n[0];
			}
		}

		//홀수의 최솟
		for(int i=1;i<cnt;i++) {
			if(min>n[i]) {
				min = n[i];
			}
		}
		
		if(min %2 ==1) {
			System.out.println("홀수의 합:" + sum);
			System.out.println("홀수의 최솟값 :" + min);
		}else {
			System.out.println("배열에 홀수가 없는 경우 :"+(-1));
		}
	}
}
