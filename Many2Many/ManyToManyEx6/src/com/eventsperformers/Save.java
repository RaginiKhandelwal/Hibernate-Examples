package com.eventsperformers;

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
		Events e1 = new Events();
		e1.setEventName("Tarang");
		e1.setLocation("Mumbai");

		Events e2 = new Events();
		e2.setEventName("IIFA");
		e2.setLocation("Dubai");

		Performers p1 = new Performers();
		p1.setName("Alia bhatt");
		p1.setFees(50000.0);

		Performers p2 = new Performers();
		p2.setName("varun dhawan");
		p2.setFees(200000.0);
		Performers p3 = new Performers();
		p3.setName("deepika bhatt");
		p3.setFees(40000.0);
		Performers p4 = new Performers();
		p4.setName("kapil sharma");
		p4.setFees(50000.0);

		Set<Performers> set = new HashSet<Performers>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		e1.setPerformers(set);
		e2.setPerformers(set);

		Transaction t = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		t.commit();

		session.close();
		factory.close();
	}
}