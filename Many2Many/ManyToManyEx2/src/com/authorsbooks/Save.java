package com.authorsbooks;

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
		Authors a1 = new Authors();
		a1.setAuthorName("JK Rowling");

		Authors a2 = new Authors();
		a2.setAuthorName("albert uderzo");

		Books b1 = new Books();
		b1.setBookName("harry potter");

		Books b2 = new Books();
		b2.setBookName("Asterix");

		Set<Books> set = new HashSet<Books>();
		set.add(b1);
		set.add(b2);

		a1.setBooks(set);
		a2.setBooks(set);

		Transaction t = session.beginTransaction();
		session.save(a1);
		session.save(a2);
		t.commit();

		session.close();
		factory.close();
	}
}