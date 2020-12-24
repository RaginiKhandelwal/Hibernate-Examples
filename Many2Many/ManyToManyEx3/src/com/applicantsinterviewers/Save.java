package com.applicantsinterviewers;

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
		Applicants a1 = new Applicants();
		a1.setName("ragini");

		Applicants a2 = new Applicants();
		a2.setName("aabhas");

		Applicants a3 = new Applicants();
		a3.setName("vikas");

		Interviewers i1 = new Interviewers();
		i1.setInterviewerName("rakesh");
		i1.setDepartment("IT");

		Interviewers i2 = new Interviewers();
		i2.setInterviewerName("seema");
		i2.setDepartment("e-commerce");

		Set<Applicants> set = new HashSet<Applicants>();
		set.add(a1);
		set.add(a2);
		set.add(a3);

		i1.setApplicants(set);
		i2.setApplicants(set);

		Transaction t = session.beginTransaction();
		session.save(i1);
		session.save(i2);
		t.commit();

		session.close();
		factory.close();
	}
}