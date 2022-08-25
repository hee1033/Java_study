package ch04_test;

public class exam06 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println("");	
		}
		
		System.out.println("-----------------------");
		System.out.println("역방향으로 별찍기");
		
		for(int i=1;i<=5;i++) {
			System.out.println("");
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print("*");
				}
			}
			
		}
		
		
		System.out.println("-----------------------");
		System.out.println("대칭으로 별찍기");
		System.out.println("");
		
		for(int i=5; i>=1;i--) {
			for(int j=1;j<=5;j++) {
				if(j==i) {
					for(int k=1;k<=5;k++) {
						if(k>=j) {
							System.out.print("*");
						}
					}
				}
				System.out.print(" ");
			}
			System.out.println("");	
		}
		
		
	
		
		

		
		
		
		
		
	}
}
