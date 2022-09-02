package programmes;

import java.util.Scanner;

public class Solution03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String result = null;
		int idx = 0;
		
		 for(int i=0;i<participant.length;i++){
	            for(int j=0;j<completion.length;j++){
	                if(participant[i].length() == completion[j].length()){
	                    if(participant[i].equals(completion[j])){
	                    	continue;
	                    }else{
	                        idx = i;
	                    }
	                }
	            }
	           
	        }
		 if(result == null) {	            	
         	System.out.println(participant[idx]);
         }
	}
}
