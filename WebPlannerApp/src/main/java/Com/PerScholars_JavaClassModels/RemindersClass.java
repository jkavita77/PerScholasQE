package Com.PerScholars_JavaClassModels;

public class RemindersClass {
	int reminderId;
	int userId;
	String reminderType;
	String frequency;
	String isActive;
	String remarks;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public RemindersClass() {
	}

	public RemindersClass(int reminderId, int userId, String reminderType, String frequency, String isActive) {
	
		this.reminderId = reminderId;
		this.userId = userId;
		this.reminderType = reminderType;
		this.frequency = frequency;
		this.isActive = isActive;
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public int getReminderId() {
		return reminderId;
	}

	public void setReminderId(int userid) {
		reminderId = userid;
	}

	public String getReminderType() {
		return reminderType;
	}

	public void setReminderType(String reminderType) {
		this.reminderType = reminderType;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

}
