package com.launchclub.user_details;

import javax.persistence.*;

@Entity
@Table(name = "")
public class User {

	@Id
	@Column(name = "")
	private String uname;
	
	@Column(name = "")
	private String email;
	
	@Column(name = "")
	private long mobile;
	
	
	@Override
	public String toString() {
		return "uname=" + uname + " email=" + email + " mobile=" + mobile;
	}
	public User() {
	}
	
	public User(String uname, String email, long mobile) {
		super();
		this.uname = uname;
		this.email = email;
		this.mobile = mobile;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}
