package programmes;

import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		// 문자열 P 와 Y의 개수
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("");
		
		int cntP = 0;
		int cntY = 0;
		char strNum;
		
		String result = null;
		
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("p") || str[i].equals("P")) {
				cntP++;
			}else if(str[i].equals("y")||str[i].equals("Y")) {
				cntY++;
			}
		}
		
		if(cntP - cntY ==0) {
			result = "true";
		}else {
			result = "false";
		}

	}

}
