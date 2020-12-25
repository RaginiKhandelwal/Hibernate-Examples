package com.instructorsclasses;

import java.util.Set;

public class Classes {
	private Integer clsId;
	private String clsName;
	private Set<Instructors> instructors;

	public Integer getClsId() {
		return clsId;
	}

	public void setClsId(Integer clsId) {
		this.clsId = clsId;
	}

	public String getClsName() {
		return clsName;
	}

	public void setClsName(String clsName) {
		this.clsName = clsName;
	}

	public Set<Instructors> getInstructors() {
		return instructors;
	}

	public void setInstructors(Set<Instructors> instructors) {
		this.instructors = instructors;
	}

}
