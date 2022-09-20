package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-8981-1234";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 동일합니다.");
		}else {
			System.out.println("동일하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+";
		data = "hee1033@gmailcom";
		
		boolean result1 = Pattern.matches(regExp, data);
		if(result1) {
			System.out.println("정규식과 동일합니다.");
		}else {
			System.out.println("동일하지 않습니다.");
		}
	}
}
