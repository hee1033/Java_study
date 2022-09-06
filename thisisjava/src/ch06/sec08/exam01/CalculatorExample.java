package ch06.sec08.exam01;
import java.util.Scanner;
public class CalculatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Calculator 생성
		Calculator myCalc = new Calculator();
		
		//리턴 값이 없는 powerOn() 메소드 호출
		myCalc.powerOn();
		
		//plus 메소드 호출 시 5와6을 매개값으로 제공하고
		//덧셈 결과를 리턴 받아 result1 변수에 대입
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+result1);
		
		//divide 메소드 호출 시 변수 x 와 y의 값을 매개값으로 제공하고
		//나눗셈 결과를 리턴 받아 result2 변수에 대입
		
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : "+result2);
		
		// 제곱의 결과를 리턴 받아 result3 변수에 대입
		int x1 =2;
		int y2 =2;
		
		long result3 = myCalc.power(x1, y2);
		System.out.println("result3 : "+result3);
		
		// 팩토리얼의 결과를 리턴 받아 result4 변수에 대입
		
		int x2 = 4;
		long result4 = myCalc.factorial(x2);
		System.out.println("result4 : "+result4);
		
		// 두수를 입력 받아 x % y 의 결과를 리턴 받아 result5 변수에 대입
		
		myCalc.remainder();
		
		
		//랜덤 뽑기
		int x3 = Integer.parseInt(sc.nextLine());
		int y3 = Integer.parseInt(sc.nextLine());
		
		int result5 = myCalc.randomNum(x3, y3);
		System.out.println("result5 : "+ result5);
		
		//리턴값이 없는 powerOff() 메소드 호출
		myCalc.powerOff();

	}

}
