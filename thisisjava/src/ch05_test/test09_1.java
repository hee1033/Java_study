package ch05_test;

import java.util.Scanner;

public class test09_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean select = true;
		int[] scores = null;
		boolean countStudent = false;
		boolean inputScores = false;
		
		
		while(select) {
			
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 ->");
			
			String str = sc.nextLine();
		
			if(str.equals("1")) {																			// 1번 선택
				System.out.print("학생수->");
				int studentNum = sc.nextInt();
				scores = new int[studentNum];
				countStudent = true;
				sc.nextLine();
				
		} else if(str.equals("2")) {																		// 2번 선택
				if(countStudent) {
					for(int i=0;i<scores.length;i++) {
						System.out.print("scores["+i+"]->");
						scores[i] = sc.nextInt();
						inputScores  = true;
						sc.nextLine();
					}
				}else {
					System.out.println("등록된 학생수가 없습니다.");
				}
			} else if(str.equals("3")) {																	// 3번 선택
				if(inputScores) {
					
					for(int i=0;i<scores.length;i++) {
						System.out.println("scores["+i+"]->"+scores[i]);
					}
				}else {
					System.out.println("입력된 점수가 없습니다.");
				}
			} else if(str.equals("4")) {																	// 4번 선택
				if(inputScores) {
					int maxScores = 0;
					int sum =0;
					for(int i=0;i<scores.length;i++) {
						if(maxScores<scores[i]) {
							maxScores = scores[i];
						}
					}
					System.out.println("최고 점수 : "+maxScores);
					for(int i=0;i<scores.length;i++) {
						sum += scores[i];
					}
					double studentAvg = (double)sum/scores.length;
					System.out.println("평균 점수 : "+studentAvg);
				}else {
					System.out.println("입력된 점수가 없습니다.");
				}
			} else if(str.equals("5")) {
				select = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
