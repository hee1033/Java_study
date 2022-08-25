package ch04_test;

public class eaxm04 {

	public static void main(String[] args) {
		
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			if(num1 + num2 ==5) {
				System.out.println("눈의 합이 5가 되는 경우");
				System.out.println("("+num1+","+num2+")");
				break;
			}else {
				System.out.println("("+num1+","+num2+")");
			}
		}
		System.out.println("---------------------------------------------------------");
		
//		int num3;
//		int num4;
//		
//		do {			
//			 num3 = (int)(Math.random()*6)+1;
//			 num4 = (int)(Math.random()*6)+1;
//			System.out.println("("+num3+","+num4+")");
//		} while(! (num3 + num4 == 5));
//		System.out.println("눈의 합이 5가 되는 경우");
//		System.out.println("("+num3+","+num4+")");
	}
}
