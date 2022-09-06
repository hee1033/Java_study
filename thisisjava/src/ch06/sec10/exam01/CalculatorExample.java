package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		//인스턴스 
		Calculator myCalcu = new Calculator();
		double result1 = 10 * 10 *myCalcu.pi;
		int result2 = myCalcu.plus(10, 5);
		int result3 = myCalcu.minus(10, 5);
		
		//정적
		double result4 = 10 * 10 * Calculator.pi;
		int result5 = Calculator.plus(10, 5);
		int result6 = Calculator.minus(10, 5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
		System.out.println("result4 : "+result4);
		System.out.println("result5 : "+result5);
		System.out.println("result6 : "+result6);

	}

}
