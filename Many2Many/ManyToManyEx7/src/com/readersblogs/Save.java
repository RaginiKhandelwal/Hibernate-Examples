package com.readersblogs;

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

		Blogs b1 = new Blogs();
		b1.setBlogWriter("ragini");
		b1.setTitle("dreams");

		Blogs b2 = new Blogs();
		b2.setBlogWriter("vikas");
		b2.setTitle("music");

		Blogs b3 = new Blogs();
		b3.setBlogWriter("smriti");
		b3.setTitle("working moms");

		Readers r1 = new Readers();
		r1.setReaderName("xyz");
		r1.setComments("good");

		Readers r2 = new Readers();
		r2.setReaderName("pqr");
		r2.setComments("nice");

		Readers r3 = new Readers();
		r3.setReaderName("lmn");
		r3.setComments("cool");

		Set<Readers> set = new HashSet<Readers>();
		set.add(r1);
		set.add(r2);
		set.add(r3);

		b1.setReaders(set);
		b2.setReaders(set);
		b3.setReaders(set);

		Transaction t = session.beginTransaction();
		session.save(b1);
		session.save(b2);
		session.save(b3);
		t.commit();

		session.close();
		factory.close();
	}
}