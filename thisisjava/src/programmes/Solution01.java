package programmes;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = {3,4,1,2};
		int[] result;
		
		if(arr.length -1 == 0) {
			result = new int[1];
		}else {
			result = new int[arr.length-1];
		}
		
		int idx =0;
		
		
		int min = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				idx = i;
			}
		}
		
		for(int i= 0;i<result.length;i++) {
			
			if(result.length-1 == 0){
				result[0] = -1;
			}else{
				if(i<idx) {		
					result[i] = arr[i];
				}else {
					result[i] = arr[i+1];
				}
			}
			System.out.println(result[i]);
		}
		
		
	}
}
