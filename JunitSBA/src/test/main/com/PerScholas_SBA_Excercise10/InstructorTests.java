package com.PerScholas_SBA_Excercise10;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category({Semester.class})
public class InstructorTests {
	@Test
	public void submitFinalGradesTest() {
		System.out.println("submitFinalGradesTest");
 }
	@Test
	public void adviseStudentTest() {
		System.out.println("adviseStudentTest");
 }
	@Category({Daily.class})
	@Test
	public void gradeAssignmentTest() {
		System.out.println("InstructorTests gradeAssignmentTest.");
	}
	@Category({Weekly.class})
	@Test
	public void gradeExamTest() {
		System.out.println("InstructorTests gradeExamTest.");
	}
}
