package com.websitesadvertisements;

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
		// test.updateWebsite();
		// test.updateAd();
		test.updateAll();

		session.close();
		factory.close();
	}

	private void updateAll() {
		Websites w = session.get(Websites.class, 1);
		w.setUrl("www.java4s");
		Advertisements a = session.get(Advertisements.class, 3);
		// Set<Websites> set = a.getWebsites();
		// a.setWebsites(set);
		a.setBrand("lenskart");
		t = session.beginTransaction();
		session.update(a);
		session.update(w);
		t.commit();
	}

	private void updateAd() {
		Advertisements a = session.get(Advertisements.class, 3);
		a.setBrand("cadbury");
		t = session.beginTransaction();
		session.update(a);
		t.commit();
	}

	private void updateWebsite() {
		Websites w = session.get(Websites.class, 1);
		w.setUrl("aaaa");
		t = session.beginTransaction();
		session.update(w);
		t.commit();
	}
}