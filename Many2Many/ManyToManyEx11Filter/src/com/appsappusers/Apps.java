package com.appsappusers;

import java.util.Set;

public class Apps {
	private Integer appId;
	private String appName;
	private Set<AppUsers> appUsers;

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Set<AppUsers> getAppUsers() {
		return appUsers;
	}

	public void setAppUsers(Set<AppUsers> appUsers) {
		this.appUsers = appUsers;
	}

}
