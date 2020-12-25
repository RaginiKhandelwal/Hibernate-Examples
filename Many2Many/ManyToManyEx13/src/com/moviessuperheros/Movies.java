package com.moviessuperheros;

import java.util.Set;

public class Movies {
	private Integer movieId;
	private String movieName;
	private Set<SuperHeros> superheros;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Set<SuperHeros> getSuperheros() {
		return superheros;
	}

	public void setSuperheros(Set<SuperHeros> superheros) {
		this.superheros = superheros;
	}
}
