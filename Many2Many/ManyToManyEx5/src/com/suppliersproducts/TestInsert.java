package com.suppliersproducts;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestInsert {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t;

	public static void main(String[] args) {
		TestInsert test = new TestInsert();
		// test.insertProduct();
		// test.insertSuppliers();
		test.insertQuery();
		session.close();
		factory.close();
	}

	private void insertQuery() {
		List<Products> list = session.createQuery("from Products where productId= 1").list();
		System.out.println("before");
		for (Products p1 : list) {
			System.out.println("product id : " + p1.getProductId());
			System.out.println("product name : " + p1.getProductName());
			Set<Suppliers> st = p1.getSuppliers();
			for (Suppliers su : st) {
				System.out.println(su.getSupId());
				System.out.println(su.getSupName());
			}
		}
		System.out.println("=========================================================================================");
		Products p = session.get(Products.class, 1);
		Suppliers ss = new Suppliers();
		ss.setSupName("big basket");
		Set<Suppliers> sp = p.getSuppliers();
		sp.add(ss);
		p.setSuppliers(sp);
		t = session.beginTransaction();
		session.update(p);
		t.commit();

		List<Products> list2 = session.createQuery("from Products where productId= 1").list();
		System.out.println("after");
		for (Products p2 : list) {
			System.out.println("product id : " + p2.getProductId());
			System.out.println("product name : " + p2.getProductName());
			Set<Suppliers> st1 = p2.getSuppliers();
			for (Suppliers su : st1) {
				System.out.println(su.getSupId());
				System.out.println(su.getSupName());
			}
		}

	}

	private void insertSuppliers() {
		// Set<Products> p = session.get(Products.class, 1);
		Suppliers s = new Suppliers();
		s.setSupName("pick n move");
		// s.setProducts(p);
		t = session.beginTransaction();
		session.save(s);
		t.commit();
	}

	private void insertProduct() {
		Products p = new Products();
		p.setProductName("dove soap");
		p.setPrice(20.0);
		t = session.beginTransaction();
		session.save(p);
		t.commit();

	}

}