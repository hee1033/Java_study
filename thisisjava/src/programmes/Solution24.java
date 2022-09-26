package programmes;

import java.util.Arrays;

public class Solution24 {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[] {1,2,3,4,6,7,8,0};
		
		int sum = 0;
		int result = 0;
		
		for(int i=0;i<numbers.length;i++) {
			sum += numbers[i];
		}
		
		result = 45-sum;
	}

}
