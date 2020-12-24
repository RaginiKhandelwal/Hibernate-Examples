package com.applicantsinterviewers;

import java.util.Set;

public class Interviewers {
	private Integer interviewerId;
	private String interviewerName;
	private String department;
	private Set<Applicants> applicants;

	public Integer getInterviewerId() {
		return interviewerId;
	}

	public void setInterviewerId(Integer interviewerId) {
		this.interviewerId = interviewerId;
	}

	public String getInterviewerName() {
		return interviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Set<Applicants> getApplicants() {
		return applicants;
	}

	public void setApplicants(Set<Applicants> applicants) {
		this.applicants = applicants;
	}

}
