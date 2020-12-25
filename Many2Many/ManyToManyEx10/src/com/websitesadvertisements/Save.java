package com.websitesadvertisements;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
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

		Duration d1 = Duration.ofSeconds(20);
		Duration d2 = Duration.of(2, ChronoUnit.MINUTES);
		Duration d3 = Duration.of(45, ChronoUnit.SECONDS);

		Websites w1 = new Websites();
		w1.setUrl("www.java4s.com");

		Websites w2 = new Websites();
		w2.setUrl("www.geeksforgeeks.com");

		Advertisements a1 = new Advertisements();
		a1.setBrand("lenskart");
		a1.setMinutes(d1);

		Advertisements a2 = new Advertisements();
		a2.setBrand("flipkart");
		a2.setMinutes(d2);

		Advertisements a3 = new Advertisements();
		a3.setBrand("myntra");
		a3.setMinutes(d3);

		Set<Advertisements> set = new HashSet<Advertisements>();
		set.add(a1);
		set.add(a2);
		set.add(a3);

		w1.setAdvertisements(set);
		w2.setAdvertisements(set);

		Transaction t = session.beginTransaction();
		session.save(w1);
		session.save(w2);
		t.commit();

		session.close();
		factory.close();
	}
}