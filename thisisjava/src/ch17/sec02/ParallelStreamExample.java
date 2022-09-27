package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		//List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("일길동");
		list.add("이길동");
		list.add("삼길동");
		list.add("사길동");
		list.add("오길동");
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name ->{
			System.out.println(name+" : "+Thread.currentThread().getName());
		});

	}

}
