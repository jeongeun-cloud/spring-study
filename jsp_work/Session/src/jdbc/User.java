package jdbc;

import java.sql.Timestamp;

public class User implements java.io.Serializable {
	String id, pwd, name, email; 
	Timestamp inDate, upDate;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getInDate() {
		return inDate;
	}

	public void setInDate(Timestamp inDate) {
		this.inDate = inDate;
	}

	public Timestamp getUpDate() {
		return upDate;
	}

	public void setUpDate(Timestamp upDate) {
		this.upDate = upDate;
	}
	
	public User(String id) {
		this.id = id;
	}


	public User(String id, String pwd, String name, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}
	
	public User(String id, String pwd, String name, String email, Timestamp inDate, Timestamp upDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.inDate = inDate;
		this.upDate = upDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", inDate=" + inDate
				+ ", upDate=" + upDate + "]";
	}

}