package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		
		int sum= 0;
		
		long time1 = System.nanoTime();
		for(int i=0;i<100000;i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("총합 : "+sum);
		System.out.println("계산에 걸린 시간 : "+(time2-time1));
	}

}
