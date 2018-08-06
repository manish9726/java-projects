package lti.holas.bean;

public class LoginBean {

	private String email_id;
	private String password;

	public String getUserid() {
		return email_id;
	}

	public void setUserid(String emailid) {
		this.email_id = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

