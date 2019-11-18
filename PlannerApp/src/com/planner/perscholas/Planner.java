package com.planner.perscholas;

import java.sql.Date;

public class Planner {
	
	int plannerID;
	int userID;
	String ToDo = null;
	Date date = null;
	String Days = null;
	String remindMe = null;
	Date birthDate = null;
	
	
	public int getPlannerID() {
		return plannerID;
	}

	public void setPlannerID(int plannerID) {
		this.plannerID = plannerID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getToDo() {
		return ToDo;
	}

	public void setToDo(String toDo) {
		ToDo = toDo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDays() {
		return Days;
	}

	public void setDays(String days) {
		Days = days;
	}

	public String getRemindMe() {
		return remindMe;
	}

	public void setRemindMe(String remindMe) {
		this.remindMe = remindMe;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	

	
}
