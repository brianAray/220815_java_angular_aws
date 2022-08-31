package com.revature.wednesday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TimePackageExample {
	
	/*
	 * Java 8 introduced a new API for Date and Time
	 * 
	 * This improved the shortcomings of the java.util.Date and java.util.Calendar
	 * 
	 * Issues:
	 * - Thread Safety - The date and calendar classes were not thread safe, lack of immutability
	 * leads to hard to debug concurrency issues.
	 * 
	 * API design and ease of understanding
	 * The date and calendar api was poorly designed with inadequate methods to perform day to day
	 * functions and operations.
	 * The new Date/Time is ISO-centric and follows consistent domain models for date, time, duration, 
	 * and periods
	 * 
	 * 
	 */
	
	// Local Date
	// Local Date represents the date in ISO format (yyyy-mm-dd) without time
	
	public void instantiateLocalDate() {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate);
		
		// You can instatiate with a specific time
		
		LocalDate date2 = LocalDate.of(2929, 12, 16);
		
		LocalDate date3 = LocalDate.parse("2929-11-12");
		
		System.out.println(date2);
		System.out.println(date3);
	}

	
	// Additional LocalDate utilities
	
	public void localDateUtility() {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		
		/*
		 * This example above obtains the current date and subtracts one month using an enum as the time unit
		 */
		
		DayOfWeek sunday = LocalDate.parse("2022-8-27").getDayOfWeek();
		
		int twelve = LocalDate.parse("2022-12-12").getDayOfMonth();
		
		
		
		// A useful tool for most Time util packages, is comparing dates with each other
		
		boolean notBefore = LocalDate.parse("2000-06-12").isBefore(LocalDate.parse("1999-09-22"));
		
		boolean isAfter = LocalDate.parse("2000-06-12").isAfter(LocalDate.parse("1999-09-22"));
	}
	
	
	
	/*
	 * LocalTime represents time without a date
	 * 
	 * Similar to local date, we can create instances using the system clock, parsing or explicit
	 * 
	 */
	
	public void instantiateLocalTime() {
		LocalTime now = LocalTime.now();
		
		LocalTime sixThirty = LocalTime.parse("06:30");
		
		// There is also the factory method
		
		LocalTime sixThirtyFactory = LocalTime.of(6, 30);
	}
	
	
	/*
	 * Local Time Utility methods
	 */
	
	public void localTimeUtilitiy() {
		LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
		
		int six = LocalTime.parse("06:30").getHour();
		
		boolean isBefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
		
		// Below code reprsents 23:59:59
		
		LocalTime maxTime = LocalTime.MAX;
	}
	
	/*
	 * LocalDateTime
	 * This is used to represent a combination of date and time
	 * 
	 * 
	 */
	
	public void instantiateLocalDateTime() {
		LocalDateTime.now();
		
		LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30 );
		
		LocalDateTime.parse("2015-02-20T06:30:00");
	}
	
	// Utility Methods of LocalDate Time
	
	public void localDateTimeUtilityMethods() {
		LocalDateTime localDateTime = LocalDateTime.now();
		
		localDateTime.plusDays(21);
		
		localDateTime.minusHours(1);
		
		localDateTime.getMonth();
	}
	
	
	
	public static void main(String[] args) {
		TimePackageExample tpe = new TimePackageExample();
		tpe.instantiateLocalDate();
	}
	
}














