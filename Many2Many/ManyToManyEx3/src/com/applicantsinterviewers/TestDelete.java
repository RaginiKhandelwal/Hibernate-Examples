package com.applicantsinterviewers;

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
		// test.deleteApplicant();
		test.deleteInter();
		session.close();
		factory.close();
	}

	private void deleteApplicant() {
		Applicants a = session.get(Applicants.class, 1);
		t = session.beginTransaction();
		session.delete(a);
		t.commit();
	}

	private void deleteInter() {
		Interviewers i = session.get(Interviewers.class, 1);
		t = session.beginTransaction();
		session.delete(i);
		t.commit();
	}
}