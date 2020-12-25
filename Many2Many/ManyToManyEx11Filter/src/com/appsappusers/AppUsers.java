package com.appsappusers;

import java.util.Set;

public class AppUsers {
	private Integer userId;
	private String userName;
	private Set<Apps> apps;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Set<Apps> getApps() {
		return apps;
	}

	public void setApps(Set<Apps> apps) {
		this.apps = apps;
	}

}
