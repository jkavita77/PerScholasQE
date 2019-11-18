package Com.PerScholars_JavaClassModels;

import java.sql.Timestamp;

public class NotesClass {
	
	int id;
	int userId;
	String title;
	String content;
	Timestamp timestamp;
	String notecol;
	
	public NotesClass() {
	}
	
	public NotesClass(int id, int userId, String title, String content, String notecol) {
		
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.notecol = notecol;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int usedId) {
		this.userId = usedId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public String getNotecol() {
		return notecol;
	}
	public void setNotecol(String notecol) {
		this.notecol = notecol;
	}

}
