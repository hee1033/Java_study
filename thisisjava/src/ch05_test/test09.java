package ch05_test;

import java.util.Scanner;

public class test09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean select = true;
		int[] scores = null;
		int maxScores = 0;
		int sum = 0;

		while (select) {

			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택 ->");

			String str = sc.nextLine();

			if (str.equals("1")) {
				System.out.print("학생수->");
				int studentNum = sc.nextInt();
				scores = new int[studentNum];
				sc.nextLine();

			} else if (str.equals("2")) {

				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]->");
					scores[i] = sc.nextInt();

					sc.nextLine();
				}
			} else if (str.equals("3")) {

				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]->" + scores[i]);

				}
			} else if (str.equals("4")) {

				for (int i = 0; i < scores.length; i++) {
					if (maxScores < scores[i]) {
						maxScores = scores[i];
					}
				}
				System.out.println("최고 점수 : " + maxScores);
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				double studentAvg = (double) sum / scores.length;
				System.out.println("평균 점수 : " + studentAvg);

			} else if (str.equals("5")) {
				select = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
