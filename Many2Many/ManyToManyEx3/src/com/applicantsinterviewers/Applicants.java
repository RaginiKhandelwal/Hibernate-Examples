package com.applicantsinterviewers;

import java.util.Set;

public class Applicants {
	private Integer applicantId;

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Interviewers> getInterviewers() {
		return interviewers;
	}

	public void setInterviewers(Set<Interviewers> interviewers) {
		this.interviewers = interviewers;
	}

	private String name;

	private Set<Interviewers> interviewers;

}
