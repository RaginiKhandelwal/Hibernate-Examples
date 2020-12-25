package com.dishesingredients;

import java.util.Set;

public class Ingredients {
	private Integer ingId;
	private String ingName;
	private Set<Dishes> dishes;

	public Integer getIngId() {
		return ingId;
	}

	public void setIngId(Integer ingId) {
		this.ingId = ingId;
	}

	public String getIngName() {
		return ingName;
	}

	public void setIngName(String ingName) {
		this.ingName = ingName;
	}

	public Set<Dishes> getDishes() {
		return dishes;
	}

	public void setDishes(Set<Dishes> dishes) {
		this.dishes = dishes;
	}

}
