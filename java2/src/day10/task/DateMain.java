package day10.task;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		Date date = new Date();
//		LocalDateTime dt = new LocalDateTime();
		
		
		LocalDateTime nowTime = LocalDateTime.now();
		System.out.println(nowTime.toLocalDate());
		System.out.println(nowTime.toLocalTime());
		
		System.out.println(nowTime.getDayOfMonth());
		System.out.println(nowTime.getDayOfWeek());
		int result = 0;
		for (int i = 0; i < 1000; i++) {
			result += i;
		}
		
		LocalDateTime afterTime = LocalDateTime.now();
		System.out.println(afterTime.getSecond());
		
		
	}

}







