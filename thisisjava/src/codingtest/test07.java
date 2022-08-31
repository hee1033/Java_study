package codingtest;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int apple = Integer.parseInt(sc.nextLine());
		
		String appleNum = sc.nextLine(); // 사과 갯수
		String[] point = appleNum.split(" "); // 사과 입력값을 배열에 저장
		
		String x = sc.nextLine(); // 첫번째 장애물 입력받음
		String[] x1 = x.split("");// 첫번째 장애물을 배열에 저장
		
		String y = sc.nextLine(); // 두번째 장애물 입력 받음
		String[] y1 = y.split(""); // 두번째 장애물을 배열에 저장
		
		String[][] totalX = new String[apple][2];
		
		int sum = 0;
		int pointNum;
		
		for(int i=0; i<totalX.length;i++) {
			for(int j=0;j<totalX[i].length;j++) {
				totalX[i][0]=x1[i];
				totalX[i][1]=y1[i];
			}
		}
		
		for(int i=0; i<point.length;i++) {
			pointNum = Integer.parseInt(point[i]);
			if(x1[i].equals("O") && y1[i].equals("O")) {
				sum += pointNum;
			}else {
				continue;
			}
		}
		System.out.println("총 점수 : "+ sum);
	}	
}
