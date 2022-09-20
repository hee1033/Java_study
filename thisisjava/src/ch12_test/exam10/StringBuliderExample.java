package ch12_test.exam10;

public class StringBuliderExample {

	public static void main(String[] args) {
		StringBuilder data = new StringBuilder();
		
		for(int i=1;i<=100;i++) {
			data.append(i);
		}
		System.out.println(data);
	}
}
