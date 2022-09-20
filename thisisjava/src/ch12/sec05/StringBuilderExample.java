package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0,"ABC")
				.delete(3,5)
				.toString();
		System.out.println(data);

	}

}
