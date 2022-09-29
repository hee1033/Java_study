package ch17_test.exam08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
				new Member("홍길동","개발자"),
				new Member("김자바","디자이너"),
				new Member("홍삼동","개발자")	
				);
		
		Map<String, List<Member>> groupingMap = list.stream()
				.collect(
						Collectors.groupingBy(
								m->m.getJob()
						)
				);
		
		System.out.println("[개발자]");
		List<Member> programer = groupingMap.get("개발자");
		programer.stream().forEach(m->System.out.println(m.getName()));
		System.out.println();
		
		System.out.println("[디자이너]");
		List<Member> disigner = groupingMap.get("디자이너");
		disigner.stream().forEach(m->System.out.println(m.getName()));
		
				
	}

}
