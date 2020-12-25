package com.readersblogs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDelete {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t;

	public static void main(String[] args) {
		TestDelete test = new TestDelete();
		test.deleteBlog();
		test.deleteReader();
		test.deleteAll();

		session.close();
		factory.close();
	}

	private void deleteAll() {
		// TODO Auto-generated method stub

	}

	private void deleteReader() {
		Readers r = session.get(Readers.class, 1);
		t = session.beginTransaction();
		session.delete(r);
		t.commit();

	}

	private void deleteBlog() {
		Blogs b = session.get(Blogs.class, 1);
		t = session.beginTransaction();
		session.delete(b);
		t.commit();

	}
}