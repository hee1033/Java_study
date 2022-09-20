package programmes;

import java.util.Scanner;

public class Solution19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		int cnt = 0;
		
		boolean know = false;
		
		if(num == 1) {
			cnt = 0;
		}else {
			know = true;
		}
		
		while(know) {
			if(num%2 == 0 && num != 1 && cnt<500) {
				num = num/2;
			}else if(num%2 == 1 && num !=1 && cnt<500) {
				num = (num *3)+1;
			}else if(cnt>500) {
				cnt = -1;
				break;
			}else if(num == 1){
				break;
			}
			cnt++;
		}
		System.out.println(cnt);
		
	}

}
