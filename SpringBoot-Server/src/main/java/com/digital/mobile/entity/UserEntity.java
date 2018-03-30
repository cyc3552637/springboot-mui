package com.digital.mobile.entity;

public class UserEntity {
	public String userid;
	public String user;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "userTest [userid=" + userid + ", user=" + user + "]";
	}
	
	
}
