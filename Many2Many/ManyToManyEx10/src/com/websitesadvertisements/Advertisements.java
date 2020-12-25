package com.websitesadvertisements;

import java.time.Duration;
import java.util.Set;

public class Advertisements {
	private Integer adId;
	private String brand;
	private Duration minutes;
	private Set<Websites> websites;

	public Integer getAdId() {
		return adId;
	}

	public void setAdId(Integer adId) {
		this.adId = adId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Duration getMinutes() {
		return minutes;
	}

	public void setMinutes(Duration minutes) {
		this.minutes = minutes;
	}

	public Set<Websites> getWebsites() {
		return websites;
	}

	public void setWebsites(Set<Websites> websites) {
		this.websites = websites;
	}

}
