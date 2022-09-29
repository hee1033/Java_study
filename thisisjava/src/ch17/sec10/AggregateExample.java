package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,4,5};
		
		//카운팅
		long count = Arrays.stream(intArr)
				.filter(a -> a%2==0)
				.count();
		System.out.println("2의 배수 개수 :"+count);
		
		//총합
		long sum = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.sum();
		System.out.println("2의 배수 합 : "+sum);
		
		//평균
		double avg = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수 평균 : "+avg);
		
		//최대값
		int max = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.max()
				.getAsInt();
		System.out.println("최대값 : "+ max);
		
		//최소값
		int min = Arrays.stream(intArr)
				.filter(a->a%2==0)
				.min()
				.getAsInt();
		System.out.println("최소값 : "+ min);
		
		//첫 번째 요소
		int first = Arrays.stream(intArr)
				.filter(a->a%3==0)
				.findFirst()
				.getAsInt();
		System.out.println("첫번쨰 3의배수 :"+first);

	}

}
