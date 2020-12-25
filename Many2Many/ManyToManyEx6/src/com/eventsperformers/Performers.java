package com.eventsperformers;

import java.util.Set;

public class Performers {
	private Integer perfId;
	private String name;
	private double fees;
	private Set<Events> events;

	public Integer getPerfId() {
		return perfId;
	}

	public void setPerfId(Integer perfId) {
		this.perfId = perfId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set<Events> getEvents() {
		return events;
	}

	public void setEvents(Set<Events> events) {
		this.events = events;
	}

}
