package com.moviessuperheros;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t;

	public static void main(String[] args) {
		TestUpdate test = new TestUpdate();
		// test.updateMovie();
		// test.updateHero();
		test.updateAll();
		session.close();
		factory.close();
	}

	private void updateAll() {
		Movies m = session.get(Movies.class, 1);
		m.setMovieName("xxx");
		Set<SuperHeros> s = m.getSuperheros();
		for (SuperHeros sup : s) {
			sup.setHeroName("lmnop");
		}
		// update all superhero records
		t = session.beginTransaction();
		session.update(m);
		t.commit();
	}

	private void updateHero() {
		SuperHeros s = session.get(SuperHeros.class, 1);
		s.setHeroName("aaaaaaaaaaaaaaaaaaaa");
		t = session.beginTransaction();
		session.update(s);
		t.commit();
	}

	private void updateMovie() {
		// TODO Auto-generated method stub

	}
}
