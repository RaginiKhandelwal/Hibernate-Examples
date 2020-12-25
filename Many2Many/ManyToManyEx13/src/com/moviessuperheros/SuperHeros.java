package com.moviessuperheros;

import java.util.Set;

public class SuperHeros {
	private Integer heroId;
	private String heroName;
	private Set<Movies> superheros;

	public Integer getHeroId() {
		return heroId;
	}

	public void setHeroId(Integer heroId) {
		this.heroId = heroId;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public Set<Movies> getSuperheros() {
		return superheros;
	}

	public void setSuperheros(Set<Movies> superheros) {
		this.superheros = superheros;
	}
}
