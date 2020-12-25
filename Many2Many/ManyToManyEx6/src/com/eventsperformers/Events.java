package com.eventsperformers;

import java.util.Set;

public class Events {
	private int eventId;
	private String eventName;
	private String location;
	private Set<Performers> performers;

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Performers> getPerformers() {
		return performers;
	}

	public void setPerformers(Set<Performers> performers) {
		this.performers = performers;
	}

}
