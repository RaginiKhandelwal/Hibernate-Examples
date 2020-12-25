package com.instructorsclasses;

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
		Instructors i1 = new Instructors();
		i1.setInstName("neeraj sir");
		i1.setSubject("maths");

		Instructors i2 = new Instructors();
		i2.setInstName("ajay sir");
		i2.setSubject("science");

		Instructors i3 = new Instructors();
		i3.setInstName("bahkti maam");
		i3.setSubject("computers");

		Classes c1 = new Classes();
		c1.setClsName("7th");

		Classes c2 = new Classes();
		c2.setClsName("8th");

		Classes c3 = new Classes();
		c3.setClsName("6th");

		Classes c4 = new Classes();
		c4.setClsName("9th");

		Classes c5 = new Classes();
		c5.setClsName("10th");

		Set<Classes> set = new HashSet<Classes>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		set.add(c5);

		i1.setClasses(set);
		i2.setClasses(set);
		i3.setClasses(set);

		Transaction t = session.beginTransaction();
		session.save(i1);
		session.save(i2);
		session.save(i3);
		t.commit();

		session.close();
		factory.close();
	}
}