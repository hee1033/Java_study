package ch07.test;

public class Gugu2 extends Gugu1 {
	//GUgu1 의 출력값을 가져오면서 2단 구구단을 완성하시오
	@Override
	public void dan() {
		int dan = 2;
		int i=0; 
			for(int j=1;j<10;j++) {
				i=j;
				System.out.println(dan + "x" + i + " = " + dan*i);
			}
			
		
	}




}
