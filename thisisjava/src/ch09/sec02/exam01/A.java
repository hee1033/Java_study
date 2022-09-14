package ch09.sec02.exam01;

public class A {	
	//클래스 생성시 필요한것
	//Field
	int field;
	B field2;
	//Constructor
	A() {
		B b = new B();
		b.methodB();
	}
	//Method
	void methodA() {
		B b = new B();
		b.methodB();
	}
	//Nested Class
	class B{
		public void methodB() {
			System.out.println("methodB() 실행");
		}
	}
		
	

}
