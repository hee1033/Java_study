package codingtest;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c =' ' ;
		int sum = 0;
		char pw = ' ';

		
		String x = sc.nextLine();
		
		for(int i=0;i<x.length();i++) {
			c = x.charAt(i); // 매개값으로 주어진 인덱스의 문자를 리턴
			sum = (c+4);
			
			if(sum>122) {
				sum = (sum-122)+96;
				pw = (char)sum;
				System.out.print(pw);
			}else {
				pw = (char)sum;
				System.out.print(pw);
			}	
		}
	}
}
