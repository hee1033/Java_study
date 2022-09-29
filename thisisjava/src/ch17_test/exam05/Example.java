package ch17_test.exam05;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 suppores lambda expressions"
		);
		
		list.stream()
			.filter(s ->s.toLowerCase().contains("java")) // .toLowerCase() -> 대문자를 소문자로 변환 .contains() 대/소문자 상관없이 여부 확인
			.forEach(s->System.out.println(s));
			
				
	}

}
