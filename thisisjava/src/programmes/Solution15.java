package programmes;

import java.util.Scanner;

public class Solution15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.nextLine());
		
		boolean answer = true;

		String[] strNum = String.valueOf(x).split("");

		int sum = 0;

		for (int i = 0; i < strNum.length; i++) {
			sum += Integer.parseInt(strNum[i]);
		}
		if (x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
	}

}
