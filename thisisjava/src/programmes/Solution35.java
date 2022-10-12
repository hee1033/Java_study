package programmes;

import java.util.ArrayList;
import java.util.List;

public class Solution35 {

	public static void main(String[] args) {

		long n = 5;
		List<Integer> list1 = new ArrayList<>();
		
		int result;
		for(int i = 0;i<=n;i++) {
			if(num(i) != 0) {
				list1.add(num(i));
			}
		}
	
			
		System.out.println(list1.size());

	}
	public static int num(int number) {
		if(number<2) {
			return 0;
		}
		if(number == 2) {
		}
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				return 0;
			}
		}
		return number;
	}

}
