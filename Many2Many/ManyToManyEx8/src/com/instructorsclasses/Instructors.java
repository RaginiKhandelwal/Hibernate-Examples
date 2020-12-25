package com.instructorsclasses;

import java.util.Set;

public class Instructors {
	private Integer instructorId;
	private String instName;
	private String subject;
	private Set<Classes> classes;

	public Integer getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstName() {
		return instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Set<Classes> getClasses() {
		return classes;
	}

	public void setClasses(Set<Classes> classes) {
		this.classes = classes;
	}

}
