package codingtest.exam00;

import java.util.Scanner;

public class exam00 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int coin = sc.nextInt();
		sc.nextLine();

		int[] testCase = new int[coin];
		int idx1 = 0;
		int idx2 = 0;
		int cnt = 0;
		boolean run = true;

		coin = 0;
		while (coin < testCase.length) {

			int scale = sc.nextInt();
			sc.nextLine();

			String[][] zangki = new String[scale][scale];
			for (int i = 0; i < zangki.length; i++) {
				zangki[i] = sc.nextLine().split(" ");
			}
			for (int i = 0; i < zangki.length; i++) {
				for (int j = 0; j < zangki.length; j++) {
					if (zangki[i][j].equals("X")) {
						idx1 = i;
						idx2 = j;
					}
				}
			}

			for (int i = 0; i <=idx2; i++) {
				if(idx2-i>=0) {		
					if (zangki[idx1][idx2-i].equals("H")) {
						cnt++;
						System.out.println("카운트1 : "+cnt);
					}
				}
				if(idx1-i>=0) {
					if (zangki[idx1-i][idx2].equals("H")) {
						cnt++;
						System.out.println("카운트1 : "+cnt);
					}
				}
				
			}
			for(int i=0;i<zangki.length;i++) {
				
				if(idx2+i<zangki.length){
						if(zangki[idx1][idx2+i].equals("H")) {
							cnt++;
							System.out.println("카운트2 : "+cnt);
						}
					}
				if(idx1+i<zangki.length) {
					if(zangki[idx1+i][idx2].equals("H")) {
						cnt++;
						System.out.println("카운트2 : "+cnt);
					}
				}
			}
			System.out.println("X의 위치 : "+idx1+","+idx2);
			coin++;
		}

	}
}
