package com.contestsparticipants;

import java.util.Set;

public class Participants {
	private Integer partId;
	private String partName;
	private Set<Contests> contests;

	public Integer getPartId() {
		return partId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public Set<Contests> getContests() {
		return contests;
	}

	public void setContests(Set<Contests> contests) {
		this.contests = contests;
	}

}
