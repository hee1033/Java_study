package ch09.sec04.exam03;

public class A {
	public void method1(int arg) {
		//로컬 변수
		int var = 1;
		
		//로컬 클래스
		class B{
			void method2() {
				System.out.println("arg : "+arg);
				System.out.println("var : "+var);
			}
			
		}
//		arg = 2;
//		var = 2;
		
		System.out.println("arg : "+arg);
		System.out.println("var : "+var);
	}
	public static void main(String[] args) {
		A a = new A();
		
		a.method1(3);
	}
}
