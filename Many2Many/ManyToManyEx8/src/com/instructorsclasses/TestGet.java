package com.instructorsclasses;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	static Transaction t;

	public static void main(String[] args) {
		TestGet test = new TestGet();
		// test.selectClasses();
		test.selectInstructors();
		// test.selectAll();
		session.close();
		factory.close();
	}

	private void selectAll() {
		List<Instructors> list = session.createQuery("from Instructors").list();
		for (Instructors inst : list) {
			System.out.println(inst.getInstructorId());
			System.out.println(inst.getInstName());
			System.out.println(inst.getSubject());
			Set<Classes> set = inst.getClasses();
			for (Classes classes : set) {
				System.out.println(classes.getClsId());
				System.out.println(classes.getClsName());
			}
		}
	}

	private void selectInstructors() {
		List<Instructors> list = session.createQuery("from Instructors").list();
		for (Instructors inst : list) {
			System.out.println(inst.getInstructorId());
			System.out.println(inst.getInstName());
			System.out.println(inst.getSubject());
		}
	}

	private void selectClasses() {
		List<Classes> list = session.createQuery("from Classes").list();
		for (Classes classes : list) {
			System.out.println(classes.getClsId());
			System.out.println(classes.getClsName());
		}
	}
}