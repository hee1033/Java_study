package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 93;
		
		if (score>=90) {
			System.out.println("점수가 90점보다 큽니다");
			System.out.println("등급은 A입니다");
		}
		
		// 중괄호 없이 사용시 실행문 하나만 실행
		if(score<90)
			System.out.println("점수가 90점보다 작습니다");
			System.out.println("등급은 B입니다");

	}

}
