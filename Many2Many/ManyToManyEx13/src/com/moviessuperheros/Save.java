package com.moviessuperheros;

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

		Movies m = new Movies();
		m.setMovieName("avengers");

		Movies m1 = new Movies();
		m1.setMovieName("infinity war");

		SuperHeros s1 = new SuperHeros();
		s1.setHeroName("iron man");

		SuperHeros s2 = new SuperHeros();
		s2.setHeroName("captain america");

		SuperHeros s3 = new SuperHeros();
		s3.setHeroName("black widow");

		Set<SuperHeros> set = new HashSet<SuperHeros>();
		set.add(s1);
		set.add(s2);
		set.add(s3);

		m1.setSuperheros(set);
		m.setSuperheros(set);

		Transaction t = session.beginTransaction();
		session.save(m);
		session.save(m1);
		t.commit();

		session.close();
		factory.close();
	}
}
