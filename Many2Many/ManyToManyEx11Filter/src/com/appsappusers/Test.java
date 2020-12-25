package com.appsappusers;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t;

	public static void main(String[] args) {
		Test test = new Test();
		// test.deleteapp();
		// test.deleteUser();
		test.filterapps();

		session.close();
		factory.close();
	}

	private void filterapps() {
		session.enableFilter("appfilter");
		List<Apps> l = session.createQuery("from Apps").list();
		for (Apps a : l) {
			System.out.println(a.getAppName());
			Set<AppUsers> s = a.getAppUsers();
			for (AppUsers au : s) {
				System.out.println(au.getUserName());
			}

		}
	}

	private void deleteUser() {
		AppUsers u = session.get(AppUsers.class, 1);
		AppUsers u1 = session.get(AppUsers.class, 2);
		AppUsers u3 = session.get(AppUsers.class, 3);
		t = session.beginTransaction();
		session.delete(u);
		session.delete(u1);
		session.delete(u3);
		t.commit();
	}

	private void deleteapp() {
		Apps a = session.get(Apps.class, 1);
		Apps a1 = session.get(Apps.class, 2);
		t = session.beginTransaction();
		session.delete(a);
		session.delete(a1);
		t.commit();

	}
}
