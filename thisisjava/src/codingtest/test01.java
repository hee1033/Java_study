package codingtest;
import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		if(N>=0) {
			for(int i=0;i<N;i++) {
				System.out.println("Hello MyCompany!");
			}
		}else {
			System.out.println("자연수를 입력하세요");
		}
	}
}
