package programmes;

import java.util.Arrays;

public class Solution05 {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = new int[] {1,2,4};
		int[] reserve = new int[] {2,5};

		Arrays.sort(lost);
		Arrays.sort(reserve);

		int[] cnt = new int[n];
		int student = 0;
		int idx1 = 0;
		int idx2 = 0;
		
		for (int i = 0; i < n; i++) {
			cnt[i] = 1;
		}
		for(int i=0;i<reserve.length;i++) {
			idx1 = reserve[i];
			cnt[idx1-1] +=1;
		}
		for(int i=0;i<lost.length;i++) {
			idx2 = lost[i];
			cnt[idx2 - 1] -= 1;
		}
		if(cnt[0]==2 && cnt[1]==0) {
			cnt[0]-=1;
			cnt[1]+=1;
		}
		for(int i=1;i+1<n;i++) {
			if(cnt[i]==2 && cnt[i-1] == 0) {
				cnt[i]-=1;
				cnt[i-1]+=1;
			}else if(cnt[i]==2 && cnt[i+1]==0) {
				cnt[i]-=1;
				cnt[i+1]+=1;
			}
		}
		if(cnt[n-1]==2 && cnt[n-2]==0) {
			cnt[n-1]-=1;
			cnt[n-2]+=1;
		}
		
		for(int i=0;i<n;i++) {
			if(cnt[i]==0) {
				student +=0;
			}else if(cnt[i]==2) {
				student +=1;
			}else {
				student +=1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("cnt["+(i+1)+"] : "+cnt[i]);
		}
		System.out.println(student);
	}

}
