package com.personsskills;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t;

	public static void main(String[] args) {
		TestInsert test = new TestInsert();
		// test.insertPerson();
		// test.insertSkill();
		test.insertAll();
		session.close();
		factory.close();
	}

	private void insertAll() {
		Persons p = new Persons();
		p.setPersonName("Rohit");
		Skills s = new Skills();
		s.setSkillName("cooking");
		Skills s1 = new Skills();
		s1.setSkillName("food");
		Set<Skills> set = new HashSet<Skills>();
		set.add(s);
		set.add(s1);
		p.setSkills(set);
		t = session.beginTransaction();
		session.save(p);
		t.commit();

	}

	private void insertSkill() {
		Skills s = new Skills();
		s.setSkillName("travelling");
		t = session.beginTransaction();
		session.save(s);
		t.commit();

	}

	private void insertPerson() {
		Persons p = new Persons();
		p.setPersonName("aabhas");
		p.setAge(13);
		t = session.beginTransaction();
		session.save(p);
		t.commit();

	}
}