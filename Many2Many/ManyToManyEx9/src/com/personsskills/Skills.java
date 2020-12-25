package com.personsskills;

import java.util.Set;

public class Skills {
	private Integer skillId;
	private String skillName;
	private Set<Persons> persons;

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Set<Persons> getPersons() {
		return persons;
	}

	public void setPersons(Set<Persons> persons) {
		this.persons = persons;
	}
}
