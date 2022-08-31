package codingtest;
import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String startNum = sc.nextLine(); // 시작 값
		String lastNum = sc.nextLine(); // 끝 값
		String num = sc.nextLine(); // 배수
		
		int start = Integer.parseInt(startNum);
		int last = Integer.parseInt(lastNum);
		int num1 = Integer.parseInt(num);
		
		int sum = 0;
		
		for(int i = start;i<=last;i++) {
			if(i % num1 == 0) {
				sum += i;
			}
		}
		System.out.println("배수의 합 : "+sum);
	}
}
