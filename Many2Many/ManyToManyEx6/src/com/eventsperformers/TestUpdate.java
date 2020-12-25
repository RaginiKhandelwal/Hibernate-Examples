package com.eventsperformers;

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
		test.updateEvent();
		test.updatePerf();
		// test.updateAll();

		session.close();
		factory.close();
	}

	private void updateAll() {
		Events e1 = session.get(Events.class, 1);
		e1.setEventName("star screen awards");
		e1.setLocation("bali");
		Performers p = session.get(Performers.class, 1);
		p.setName("xxxxxxxxxx");

		t = session.beginTransaction();
		session.update(e1);
		session.update(p);
		t.commit();
	}

	private void updatePerf() {
		Performers p = session.get(Performers.class, 1);
		p.setName("varun dhawan");
		p.setFees(600000.0);

		t = session.beginTransaction();

		session.update(p);
		t.commit();
	}

	private void updateEvent() {
		Events e1 = session.get(Events.class, 1);
		e1.setEventName("star dust awards");
		e1.setLocation("sydney");
		t = session.beginTransaction();
		session.update(e1);
		// session.update(p);
		t.commit();
	}

}