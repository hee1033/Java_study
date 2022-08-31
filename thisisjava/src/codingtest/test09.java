package codingtest;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] str1 = str.split("");

		int input = ' ';
		int i = 0;
		int cnt = 0;
		int sum = 0;
		boolean run = true;

		while (cnt != str1.length) {
			input = str.charAt(cnt);
			if(run) {// 급경사 올라가기 전
				if (input == 40) {
					i++;
					sum += i;
				} else if (input == 41) {
					sum += i;
					i--;
				} else if (input == 35) {
					run = false;
				}
			}else { //급경사 올라가는 중
				if (input == 40) {
					i++;
					sum += i*2;
				} else if (input == 41) {
					sum += i*2;
					i--;
				} else if (input == 35) {
					run = true;
				}
			}
			cnt++;
			System.out.println(cnt + "번쨰 sum :" + sum);
		}

	}
}
