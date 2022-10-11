package programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution33 {

	public static void main(String[] args) {

		String[] strings = new String[] {"abce", "abcd", "cdx" }; //"abce", "abcd", "cdx"   "sun", "bed", "car"
		
		int n = 2;
		int idx = 0;
		
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		int[] num = new int[strings.length];
		
		for(int i=0; i<num.length;i++) {
			num[i] = strings[i].charAt(n);
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length;i++) {
			for(int j = 0; j<num.length;j++) {
				if(num[i] == strings[j].charAt(n)) {
					list1.add(strings[j]);
				}
				
			}
		}
		
		System.out.println(list1);
		String[] result = new String[list1.size()];
		
		for(String i : list1) {
			result[idx] = i;
			idx++;
		}
		
		for(int i=0;i<result.length;i++) {
			if(!list2.contains(result[i])) {
				list2.add(result[i]);
			}
		}
		String[] answer = new String[list2.size()];
		idx = 0;
		for(String i : list2) {
			answer[idx] = i;
			idx++;
		}
		
		System.out.println(Arrays.toString(answer));  
			
	}
}
