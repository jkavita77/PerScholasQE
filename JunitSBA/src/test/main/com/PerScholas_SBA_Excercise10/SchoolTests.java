package com.PerScholas_SBA_Excercise10;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category({Semester.class})
public class SchoolTests {
	@Test
	public void addCourseTest() {
		System.out.println("addCourseTest");
 }
	@Test
	public void registerStudentTest() {
		System.out.println("registerStudentTest");
 }
	@Test
	public void publishGradesTest() {
		System.out.println("publishGradesTest");
 }
	
	@Category({Weekly.class})
	@Test
	public void createWeeklyReportTest() {
		System.out.println("School Tests createWeeklyReportTest.");
	}
	@Category({Daily.class})
	@Test
	public void takeAttendanceTest() {
		System.out.println("School Tests takeAttendanceTest.");
	}
}
