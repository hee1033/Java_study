package ch04_test;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		
		while(run) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 >");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				System.out.print("예금액 >");
				int inputMoney = Integer.parseInt(sc.nextLine());
				money += inputMoney;
				System.out.println("현재 금액 : "+money);
				
			} else if(strNum.equals("2")) {
				System.out.print("출금액 >");
				int outputMoney = Integer.parseInt(sc.nextLine());
				money -= outputMoney;
				System.out.println("현재 금액 : "+money);
			} else if(strNum.equals("3")) {
				System.out.println("잔고금액 :"+money);
			} else if(strNum.equals("4")){
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
