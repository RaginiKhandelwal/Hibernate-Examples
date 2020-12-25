package com.appsappusers;

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

		Apps a1 = new Apps();
		a1.setAppName("watsapp");

		Apps a2 = new Apps();
		a2.setAppName("facebook");

		Apps a3 = new Apps();
		a3.setAppName("instagram");

		AppUsers u1 = new AppUsers();
		u1.setUserName("ragini");

		AppUsers u2 = new AppUsers();
		u2.setUserName("aabhas");

		AppUsers u3 = new AppUsers();
		u3.setUserName("vikas");

		AppUsers u4 = new AppUsers();
		u4.setUserName("rohit");

		AppUsers u5 = new AppUsers();
		u5.setUserName("smriti");

		Set<AppUsers> set = new HashSet<AppUsers>();
		set.add(u1);
		set.add(u2);
		set.add(u5);
		set.add(u4);
		set.add(u5);

		a1.setAppUsers(set);
		a3.setAppUsers(set);
		a2.setAppUsers(set);

		Transaction t = session.beginTransaction();
		session.save(a1);
		session.save(a3);
		session.save(a2);

		t.commit();

		session.close();
		factory.close();
	}
}
