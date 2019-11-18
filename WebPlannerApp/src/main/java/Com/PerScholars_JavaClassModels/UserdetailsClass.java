package Com.PerScholars_JavaClassModels;

public class UserdetailsClass {
	int id;
	int Userid;
	String Email;
	String Address;

	public UserdetailsClass() {
		
	}

	public UserdetailsClass(int id, int Userid, String Email, String Address) {
		
		this.id = id;
		this.Userid =  Userid;
		this.Email = Email;
		this.Address = Address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
