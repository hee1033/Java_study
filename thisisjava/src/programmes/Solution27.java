package programmes;

import java.util.Arrays;

public class Solution27 {

	public static void main(String[] args) {
		
		int[][]arr1 = new int[][] {{1},{2}};
		int[][]arr2 = new int[][] {{3},{4}};
		
		int[][] result = new int[arr1.length][arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				result[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				if(result[i][j]==0) {
					continue;
				}else {
					System.out.println("result["+i+"]["+j+"] : "+result[i][j]);
				}
			}
		}
		
	}
}
