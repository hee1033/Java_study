package programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution31 {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1}; //{1,1,3,3,0,1,1}; {4,4,4,3,3}
		
		List<Integer> list = new ArrayList<>();
		int idx = 0;
		list.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[idx]!=arr[i]) {
				list.add(arr[i]);
				idx++;
			}else {
				idx++;
			}
		}
		
		int[] result = new int[list.size()];
		idx = 0;
		for(int i : list) {
			result[idx] = i;
			idx++;
		}
		System.out.println(Arrays.toString(result));
		
	}
}
