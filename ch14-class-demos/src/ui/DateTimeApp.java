package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {
		System.out.println("Date Time App!");
		
		//p443
		LocalDateTime currentTimestamp= LocalDateTime.now();
		LocalDate currentDate= LocalDate.now();
		System.out.println("Current datetime: "+currentTimestamp);
		System.out.println("Current date: "+currentDate);
		
		LocalDate halloween= LocalDate.of(2021,10, 31);
		LocalDate christmas= LocalDate.of(2021, Month.DECEMBER, 25);
		
		System.out.println("Halloween: "+halloween);
		System.out.println("Christmas: "+christmas);
		
		
		LocalDate july4th= LocalDate.parse("2021-07-04");
		System.out.println("July 4th: "+july4th);
		LocalDateTime laborDay= LocalDateTime.parse("2021-09-06T00:00");
		System.out.println("Labor Day: "+laborDay);
		
		//p445
		System.out.println("Labor Day 2021");
		System.out.println("get Year(): "+currentTimestamp.getYear());
		System.out.println("get Month(): "+currentTimestamp.getMonth());
		System.out.println("get MonthValue(): "+currentTimestamp.getMonthValue());
		System.out.println("get DayOfMonth(): "+currentTimestamp.getDayOfMonth());
		System.out.println("get DayOfYear(): "+currentTimestamp.getDayOfYear());
		System.out.println("get DayofWeek(): "+currentTimestamp.getDayOfWeek());
		System.out.println("get Minute(): "+currentTimestamp.getMinute());
		System.out.println("get Second(): "+currentTimestamp.getSecond());
		System.out.println("get Nano(): "+currentTimestamp.getNano());
		
		
		//447
		if (currentTimestamp.isBefore(laborDay)) {
			System.out.println("Today is before Labor Day");
		}
		if (christmas.isAfter(halloween)) {
			System.out.println("duh...christmas is after halloween");
		}
		
		System.out.println(halloween.compareTo(christmas));
		System.out.println(christmas.compareTo(july4th));
		
		//p449 new date one month from today
		LocalDateTime monthLaterThanToday=currentTimestamp.withMonth(7);
		System.out.println(monthLaterThanToday);
		
		
		//p451 10 weeks from today
		LocalDateTime tenWeeks=currentTimestamp.plus(10, ChronoUnit.WEEKS);
		System.out.println(tenWeeks);
		
		LocalDateTime twoWeeks=currentTimestamp.plusWeeks(2);
		System.out.println(twoWeeks);
		
		
		long daysUntilHalloween=currentDate.until(halloween, ChronoUnit.DAYS);
		System.out.println("Days until Halloween: "+daysUntilHalloween);
		long daysBetween=ChronoUnit.DAYS.between(july4th, laborDay);
		System.out.println("Days between: "+daysBetween);
		
		//p453
		DateTimeFormatter formatter= DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM);
		System.out.println(formatter.format(currentTimestamp));
		
		
		
		
		System.out.println("Peace");

	}

}
