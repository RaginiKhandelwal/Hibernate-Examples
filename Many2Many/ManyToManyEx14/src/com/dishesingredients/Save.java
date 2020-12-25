package com.dishesingredients;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Dishes d1 = new Dishes();
		d1.setDishName("mutter paneer");

		Dishes d2 = new Dishes();
		d2.setDishName("paneer pasanda");

		Ingredients i1 = new Ingredients();
		i1.setIngName("paneer");

		Ingredients i2 = new Ingredients();
		i2.setIngName("onion");

		Ingredients i3 = new Ingredients();
		i3.setIngName("tomato");

		Set<Ingredients> set = new HashSet<Ingredients>();
		set.add(i1);
		set.add(i2);
		set.add(i3);

		d1.setIngredients(set);
		d2.setIngredients(set);

		Transaction t = session.beginTransaction();
		session.save(d1);
		session.save(d2);
		t.commit();

		session.close();
		factory.close();
	}
}
