package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		//배열 변수 선언과 배열 생성
		int[] scores = {80,90,95};
		
		int sum =0;
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = "+sum);
		
		double avg = (double) sum/scores.length;
		System.out.println("점수 평균 :"+ avg);
	}

}
