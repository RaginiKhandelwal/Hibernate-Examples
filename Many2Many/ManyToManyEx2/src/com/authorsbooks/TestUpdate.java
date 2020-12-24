package com.authorsbooks;

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
		// test.upodateBook();
		// test.upodateAuthor();
		// test.upodateAll();
		test.updateBooks();
		session.close();
		factory.close();
	}

	private void upodateBook() {
		Books b = session.get(Books.class, 1);
		b.setBookName("xxxxxxxxxxxx");
		t = session.beginTransaction();
		session.update(b);
		t.commit();
	}

	private void upodateAuthor() {
		Authors b = session.get(Authors.class, 1);
		b.setAuthorName("yyyyyyyyyyyyyyy");
		t = session.beginTransaction();
		session.update(b);
		t.commit();
	}

	private void upodateAll() {
		Authors b = session.get(Authors.class, 1);
		b.setAuthorName("pran");

		Books b1 = session.get(Books.class, 1);
		b1.setBookName("chacha chaudhary");
		// b.getBooks().add(b1);

		t = session.beginTransaction();
		session.update(b);
		t.commit();
	}

	private void updateBooks() {
		Books b = new Books();
		b.setBookName("ramayan");
		t = session.beginTransaction();
		session.save(b);
		t.commit();
	}
}