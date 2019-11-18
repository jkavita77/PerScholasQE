package com.PerScholas_SBA_Excercise10;

import org.junit.Test;
import org.junit.experimental.categories.Category;



@Category({Semester.class})
public class StudentTests {
	@Test
	public void joinClubTest() {
		System.out.println("joinClubTest");
 }
	@Category({Daily.class})
	@Test
	public void submitAssignmentTest() {
		System.out.println("StudentTests submitAssignmentTest.");
	}
	@Category({Weekly.class})
	@Test
	public void submitExamTest() {
		System.out.println("StudentTests submitExamTest.");
	}
}

