package Com.PerScholars_JavaClassModels;

public class UsersClass {
	int Userid;
	String Username;
	String Password;
	String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	int  Role;


	public UsersClass() {
	}

	public UsersClass(int Userid, String Username, String Password, int Role) {
		this.Userid = Userid;
		this.Username = Username;
		this.Password = Password;
		this.Role = Role;
	}

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getRole() {
		return Role;
	}

	public void setRole(int role) {
		role = role;
	}

}