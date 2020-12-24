package com.studentscourses;

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

		Students s1 = new Students();
		s1.setName("ragini");

		Students s2 = new Students();
		s2.setName("aabhas");

		Courses c1 = new Courses();
		c1.setCourseName("java");

		Courses c2 = new Courses();
		c2.setCourseName("visual basic");

		Set<Courses> set = new HashSet<Courses>();
		set.add(c1);
		set.add(c2);

		s1.setCourses(set);
		s2.setCourses(set);

		Transaction t = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		t.commit();

		session.close();
		factory.close();

	}
}
