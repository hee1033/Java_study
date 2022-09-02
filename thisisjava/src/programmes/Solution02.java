package programmes;

import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] lotto = sc.nextLine().split(" ");
		String[] win_num = sc.nextLine().split(" ");
		
		int[] lottos = new int[lotto.length];
		for(int i=0;i<lotto.length;i++) {
			lottos[i] = Integer.parseInt(lotto[i]);
		}
		
		int[] win_nums = new int[win_num.length];
		for(int i=0;i<win_num.length;i++) {
			win_nums[i] = Integer.parseInt(win_num[i]);
		}
		
		int[] result = new int[2];

		int max = 0;
		int min = 0;
		int cnt = 0;


		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				cnt++;
			}
			for (int j = 0; j < lottos.length; j++) {
				if (lottos[i] == win_nums[j]) {
					max++;
				}
			}
		}
		System.out.println("카운트 : "+cnt);
		System.out.println("당첨 수 : "+max);

		
		
		int good = max + cnt;
		int cry = 6-max;

		if (good == 6) {
			result[0] = 1;
		} else if (good == 5) {
			result[0] = 2;
		} else if (good == 4) {
			result[0] = 3;
		} else if (good == 3) {
			result[0] = 4;
		} else if (good == 2) {
			result[0] = 5;
		} else {
			result[0] = 6;
		}

		if (cry == 6) {
			result[1] = 6;
		} else if (cry == 5) {
			result[1] = 6;
		} else if (cry == 4) {
			result[1] = 5;
		} else if (cry == 3) {
			result[1] = 4;
		} else if (cry == 2) {
			result[1] = 3;
		} else if(cry ==1){
			result[1] = 2;
		}else {
			result[1] = 1;
		}
		
		System.out.println("good : "+good);
		System.out.println("result[0] : "+result[0]);
		System.out.println("cry : "+cry);
		System.out.println("result[1] : "+result[1]);
	}

}
