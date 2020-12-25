package com.contestsparticipants;

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
		Contests c1 = new Contests();
		c1.setContestName("did");
		Contests c2 = new Contests();
		c2.setContestName("nach baliye");

		Participants p1 = new Participants();
		p1.setPartName("aaaa");

		Participants p2 = new Participants();
		p2.setPartName("bbbb");

		Participants p3 = new Participants();
		p3.setPartName("cccc");

		Set<Participants> set = new HashSet<Participants>();
		set.add(p1);
		set.add(p2);
		set.add(p3);

		c1.setParticipants(set);
		c2.setParticipants(set);

		Transaction t = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		t.commit();

		session.close();
		factory.close();
	}
}
