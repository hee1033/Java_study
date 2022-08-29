package ch05_test;

public class test08 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int totalSum = 0;
		int totalArray =0;
		
		for(int i=0;i<array.length;i++) {
			totalArray += array[i].length;
			for(int k=0;k<array[i].length;k++) {
				totalSum += array[i][k];
			}
		}
		double arrayAvg = (double) totalSum/totalArray;
		
		System.out.println("배열 항목의 전체 합 : "+totalSum);
		System.out.println("배열 항목의 평균 : "+arrayAvg);
	}
}
