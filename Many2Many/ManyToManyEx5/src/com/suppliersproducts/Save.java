package com.suppliersproducts;

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

		Products p1 = new Products();
		p1.setProductName("sunfeast");
		p1.setPrice(500.0);

		Products p2 = new Products();
		p2.setProductName("rice");
		p2.setPrice(700.0);

		Suppliers s1 = new Suppliers();
		s1.setSupName("jio");

		Suppliers s2 = new Suppliers();
		s2.setSupName("easy day");

		Suppliers s3 = new Suppliers();
		s3.setSupName("govindji");

		Suppliers s4 = new Suppliers();
		s4.setSupName("general stores");

		Set<Products> s = new HashSet<Products>();
		s.add(p1);
		s.add(p2);

		s1.setProducts(s);
		s2.setProducts(s);
		s3.setProducts(s);
		s4.setProducts(s);

		Transaction t = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);

		t.commit();

		session.close();
		factory.close();
	}
}