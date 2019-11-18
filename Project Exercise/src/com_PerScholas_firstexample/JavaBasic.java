package com_PerScholas_firstexample;


	import java.util.Calendar;
	import java.util.Date;

	public class JavaBasic {
		public static void main(String[] args) {
			// Create Calendar instance
			Calendar cal = Calendar.getInstance();
			System.out.println("Date & time: " + cal.getTime());
			System.out.println("Year: " + cal.get(Calendar.YEAR));
			System.out.println("Week of the year: " + cal.get(Calendar.WEEK_OF_YEAR));
			System.out.println("Day of the year: " + cal.get(Calendar.DAY_OF_YEAR));
			// Convert Calendar object to Date object
			Date date = cal.getTime();
			System.out.println("java.util.Date: " + date);
}
}