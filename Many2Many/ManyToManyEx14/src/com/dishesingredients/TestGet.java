package com.dishesingredients;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestGet {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();

	public static void main(String[] args) {
		TestGet test = new TestGet();
		// test.selectAll();
		// test.selectDishes();
		test.selectIngredients();

		session.close();
		factory.close();
	}

	private void selectIngredients() {
		List<Ingredients> list = session.createQuery("from Ingredients").list();
		for (Ingredients ing : list) {
			System.out.println(ing.getIngId());
			System.out.println(ing.getIngName());
		}
		System.out.println("==================================================");
		Ingredients i = session.get(Ingredients.class, 1);
		System.out.println(i.getIngId());
		System.out.println(i.getIngName());
	}

	private void selectDishes() {
		List<Dishes> list = session.createQuery("from Dishes").list();
		for (Dishes ing : list) {
			System.out.println(ing.getDishId());
			System.out.println(ing.getDishName());
		}
	}

	private void selectAll() {
		List<Dishes> list = session.createQuery("from Dishes").list();
		for (Dishes ing : list) {
			System.out.println(ing.getDishId());
			System.out.println(ing.getDishName());
			Set<Ingredients> set = ing.getIngredients();
			for (Ingredients in : set) {
				System.out.println(in.getIngId());
				System.out.println(in.getIngName());
			}
		}
	}
}
