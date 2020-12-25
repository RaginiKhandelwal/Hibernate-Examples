package com.personsskills;

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
		Persons p1 = new Persons();
		p1.setPersonName("ragini");
		p1.setAge(36);

		Persons p2 = new Persons();
		p2.setPersonName("vikas");
		p2.setAge(42);

		Skills s1 = new Skills();
		s1.setSkillName("dance");

		Skills s2 = new Skills();
		s2.setSkillName("music");

		Skills s3 = new Skills();
		s3.setSkillName("painting");

		Set<Skills> set = new HashSet<Skills>();
		set.add(s1);
		set.add(s2);
		set.add(s3);

		p1.setSkills(set);
		p2.setSkills(set);

		Transaction t = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		t.commit();

		session.close();
		factory.close();
	}
}