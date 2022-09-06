package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; -> 클래스 안이 아닌 밖에서 사용했기때문에 에러
		
		a.method1();
		a.method2();
//		a.method3(); -> private으로 선언이 되어 사용불가
	}
}
