package ch12_test.exam15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTImeCompareExample {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		
		LocalDateTime startDateTime = LocalDateTime.of(2022,9,20, 0, 0);
		
		LocalDateTime endDateTime = LocalDateTime.of(2022, 12,31,0,0);
		
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		System.out.println(remainDay);

	}

}
