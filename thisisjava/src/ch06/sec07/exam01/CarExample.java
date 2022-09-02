package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car("그랜저","검정",50);
		
		// 매개변수 타입이 일치하지 않을 때 오류 발생
		/*Car myCar1 = new Car(30,40,50);
		Car myCar2 = new Car('a','b',40);*/
		
		// 매개값의 수가 일치하지 않을 때 오류 발생
		// Car myCar3 = new Car("그랜저","검정",50,"010-xxxx-xxxx");

	}

}
