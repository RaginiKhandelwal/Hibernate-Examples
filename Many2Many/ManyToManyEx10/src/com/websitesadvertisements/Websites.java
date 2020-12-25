package com.websitesadvertisements;

import java.util.Set;

public class Websites {
	private Integer websiteId;
	private String url;
	private Set<Advertisements> advertisements;

	public Integer getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(Integer websiteId) {
		this.websiteId = websiteId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set<Advertisements> getAdvertisements() {
		return advertisements;
	}

	public void setAdvertisements(Set<Advertisements> advertisements) {
		this.advertisements = advertisements;
	}

}
