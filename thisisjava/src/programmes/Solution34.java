package programmes;

import java.util.ArrayList;
import java.util.List;

public class Solution34 {

	public static void main(String[] args) {
		
		int n = 45;
		
		List<Integer> list = new ArrayList<>();
		
		boolean know = true;
		
		while (n >= 3) {
			if (n % 3 == 0) {
				list.add(0);
			} else if (n % 3 == 1) {
				list.add(1);
			} else if (n % 3 == 2) {
				list.add(2);
			}
			n = n / 3;
		}
		list.add(n);
		
		int[] num = new int[list.size()];
		int idx = 0;
		for(int i : list) {
			num[idx] = i;
			idx++;
		}
		int sum = 0;
		int x = 1;
		for(int i=0;i<num.length;i++) {
			sum += Math.pow(3, num.length-x) * num[i];
			x++;
		}
		System.out.println(sum);
	}

}
