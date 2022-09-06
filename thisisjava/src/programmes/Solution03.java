package programmes;

import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		String answer =null;
		int idx=0;
		boolean run = true;
		
		
		for(int i=idx;i<participant.length;i++) {
			for(int j=1;j<participant.length;j++) {
				if(participant[idx].equals(participant[idx+j])) {
					System.out.println(participant[idx]);
					run = false;
					break;
				}
			}
		}
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		if(run) {
			for(int i=0; i<completion.length;i++) {
				if(!participant[i].equals(completion[i])){
					answer = participant[i];
					break;
				}
			}
			answer = participant[participant.length-1];
		}
		System.out.println(answer);
	}
}
