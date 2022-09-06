package ch06.sec08.exam01;

import java.util.Scanner;

public class Calculator {

	// 리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	// 호출 시 두 정수 값을 전달받고,
	// 호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	/*
	 * 호출 시 두 정수값을 전달받고, 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	 */
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}

	// 호출 시 두 수를 제공 받아서 제곱의 형태 리턴값으로 하는 메소드 선언

	long power(int x, int y) {
		int result = 1;
		for (int i = 0; i < y; i++) {
			result *= x;
		}

		return result;
	}

	// 한 수를 제공 받고 팩토리얼의 값을 리턴하는 메소드 선언

	long factorial(int x) {
		int result = 1;
		for (int i = 1; i < x + 1; i++) {
			result *= i;
		}
		return result;
	}

	// 두 수를 키보드에서 입력 받고 첫번째 % 두번쨰로 계산된 실수 값을 출력 하는 메소드 선언

	void remainder() {
		Scanner sc = new Scanner(System.in);
		
		double x = Double.parseDouble(sc.nextLine());
		double y = Double.parseDouble(sc.nextLine());

		double result = x % y;
		System.out.println(result);
	}
	// 시작값과 뽑을 경우의 수를 입력받고 임의 수를 뽑아서 리턴하는 메소드 선언
	int randomNum(int x, int y) {
		
		x =(int)Math.random()*y;
		
		int result = x;
		return result;
		
	}
}
