package programmes;

import java.util.Arrays;

public class Solution21 {
	public static void main(String[] args) {
		
		int[] arr = new int [] {5,1,9,10};
		
		int divisor = 5;
		int idx = 0;
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor == 0) {
			}else {
				cnt++;
			}
		}
		
		int[] result = new int[arr.length-cnt];
		if(result.length == 0) {
			result = new int[1];
			result[0] = -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor == 0) {
				result[idx] = arr[i];
				idx++;
			}
		}

		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		
		
	}
}
