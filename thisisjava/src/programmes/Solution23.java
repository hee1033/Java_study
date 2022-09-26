package programmes;

import java.util.Scanner;

public class Solution23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());

		String[] str = new String[] { "수", "박" };
		String result = "";

		for (int i = 1; i <= n; i++) {
			if(i%2 != 0) {
				result += str[0];
			}else {
				result += str[1];
			}
		}
		
		System.out.println(result);
	}

}
