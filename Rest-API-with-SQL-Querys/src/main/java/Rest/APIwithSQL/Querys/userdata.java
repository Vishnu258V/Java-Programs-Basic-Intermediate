package Rest.APIwithSQL.Querys;

public class userdata {


	private String username;
	private String email;
	private String password;
	private long phonenumber;
	
	public userdata(String username, String email, String password, long phonenumber) {

		this.username = username;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
	}

	public userdata() {

	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "userdata [username=" + username + ", email=" + email + ", password=" + password + ", phonenumber="
				+ phonenumber + "]";
	}
	
	
	
	
	
	
}
