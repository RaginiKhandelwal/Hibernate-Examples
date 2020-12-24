package com.groupsusers;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestGet {
	static Configuration cfg = new Configuration().configure();
	static SessionFactory factory = cfg.buildSessionFactory();
	static Session session = factory.openSession();
	// static Transaction t;

	public static void main(String[] args) {
		TestGet test = new TestGet();
//		test.selectGroups();
//		test.selectUsers();
		test.selectAll();
		// test.selectQuery();
		// test.get();
		session.close();
		factory.close();
	}

	private void selectQuery() {
		List<Groups> list = session.createQuery("from Groups where groupId = 1").list();
		for (Groups grp : list) {
			System.out.println(grp.getGroupId());
			System.out.println(grp.getGrpName());
			Set<Users> s = grp.getUsers();
			for (Users user : s) {
				System.out.println(user.getUserId());
				System.out.println(user.getUserName());
			}
		}

	}

	private void selectAll() {
		List<Groups> list = session.createQuery("from Groups").list();
		for (Groups grp : list) {
			System.out.println(grp.getGroupId());
			System.out.println(grp.getGrpName());
			Set<Users> s = grp.getUsers();
			for (Users user : s) {
				System.out.println(user.getUserId());
				System.out.println(user.getUserName());
			}
		}

	}

	private void selectUsers() {
//		List<Users> list = session.createQuery("from Users").list();
//		for (Users grp : list) {
//			System.out.println(grp.getUserId());
//			System.out.println(grp.getUserName());
//		}
		Users u = session.get(Users.class, 1);
		System.out.println(u.getUserName());

	}

	private void selectGroups() {
//		List<Groups> list = session.createQuery("from Groups").list();
//		for (Groups grp : list) {
//			System.out.println(grp.getGroupId());
//			System.out.println(grp.getGrpName());
//		}
		Groups g = session.get(Groups.class, 2);
		System.out.println(g.getGroupId());
		System.out.println(g.getGrpName());

	}

	private void get() {
		Groups g = session.get(Groups.class, 2);
		System.out.println(g.getGroupId());
		System.out.println(g.getGrpName());
		Set<Users> u = g.getUsers();
		for (Users us : u) {
			System.out.println(us.getUserName());
			System.out.println(us.getPassword());
		}
	}
}