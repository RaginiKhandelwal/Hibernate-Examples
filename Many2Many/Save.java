package com.groupsusers;

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

		Groups g1 = new Groups();
		g1.setGrpName("genius temple");

		Groups g2 = new Groups();
		g2.setGrpName("agarwal group");

		Users u1 = new Users();
		u1.setUserName("ragini");
		u1.setPassword("aaaa");

		Users u2 = new Users();
		u2.setUserName("vikas");
		u2.setPassword("bbb");

		Users u3 = new Users();
		u3.setUserName("aabhas");
		u3.setPassword("cccc");

		Set<Users> set = new HashSet<Users>();
		set.add(u1);
		set.add(u2);
		set.add(u3);

		g1.setUsers(set);
		g2.setUsers(set);

		Transaction t = session.beginTransaction();
		session.save(g1);
		session.save(g2);
		t.commit();

		session.close();
		factory.close();
	}
}