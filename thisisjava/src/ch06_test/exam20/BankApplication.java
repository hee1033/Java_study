package ch06_test.exam20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		
		while(run) {
			
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금 |5. 종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 >");
			String select = sc.nextLine();
			int num = Integer.parseInt(select);
			
			switch(num) {
				case 1:
					System.out.println("=======");
					System.out.println("계좌생성");
					System.out.println("=======");
					
					Account.create();
					
					
					break;
				case 2:
					System.out.println("=======");
					System.out.println("계좌목록");
					System.out.println("=======");
					
					Account.list();
					
					break;
				case 3:
					System.out.println("=======");
					System.out.println("  예금  ");
					System.out.println("=======");
					
					Account.inputMoney();
					
					break;
				case 4:
					System.out.println("=======");
					System.out.println("  출금  ");
					System.out.println("=======");
					
					Account.outputMoney();
					
					break;
				case 5:
					System.out.println("프로그램 종료");
					
					run = false;
					
					break;
					
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
