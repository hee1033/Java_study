package ch06_test.exam20;
import java.util.Scanner;

public class Account {
	static Scanner sc = new Scanner(System.in);
	
	static String num;
	static String name;
	static int startMoney;
	static int money;
	
	static String[][] account = new String[100][3];
	static int idx = 0;
	
	
	static void create() {
		
		System.out.print("계좌번호 : ");
		num = sc.nextLine();
		System.out.print("계좌주 : ");
		name = sc.nextLine();
		System.out.print("초기입금액 : ");
		startMoney = Integer.parseInt(sc.nextLine());
		System.out.println("결과 : 계좌가 생성되었습니다.");
		
		account[idx][0]=num;
		account[idx][1]=name;
		account[idx][2]=String.valueOf(startMoney);
		idx++;
	}
	
	static void list() {
		for(int i=0;i<idx;i++) {
			System.out.println(account[i][0]+"\t"+account[i][1]+"\t"+account[i][2]);
		}
	}
	
	
	static void inputMoney() {
		System.out.print("계좌번호 : ");
		num = sc.nextLine();
		for(int i=0;i<idx;i++) {
			if(account[i][0].equals(num)) {
				System.out.print("예금액 : " );
				money = Integer.parseInt(sc.nextLine());
				account[i][2]= String.valueOf(money+Integer.parseInt(account[i][2]));
			}else {
				System.out.println("계좌를 잘못입력하셨습니다.");
				break;
			}
		}
	}
	static void outputMoney() {
		System.out.print("계좌번호 : ");
		num = sc.nextLine();
		for(int i=0;i<idx;i++) {
			if(account[i][0].equals(num)) {
				System.out.print("출금액 : " );
				money = Integer.parseInt(sc.nextLine());
				account[i][2]= String.valueOf(Integer.parseInt(account[i][2])-money);
			}else {
				System.out.println("계좌를 잘못입력하셨습니다.");
				break;
			}
		}
	}
	
	
	
}
