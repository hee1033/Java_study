package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//방법1
		OptionalDouble optional = list.stream()
				.filter(e->e%2==0)
				.mapToDouble(Integer :: intValue)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균 : "+optional.getAsDouble());
		}else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		//방법2
		double avg = list.stream()
				.mapToDouble(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : "+avg);
		
		
		//방법3
		list.stream()
			.mapToDouble(Integer :: intValue)
			.average()
			.ifPresent(a->System.out.println("방법3_평균 : "+a));
		
	}

}
