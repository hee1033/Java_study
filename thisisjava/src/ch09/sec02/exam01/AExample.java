package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		b.methodB();

	}

}
