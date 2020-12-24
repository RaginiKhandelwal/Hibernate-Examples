package com.hqlEx;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ForOurLogicDelete {
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query qry= session.createQuery("delete from MyProducts p where p.productId=112");
		
		Transaction tx =session.beginTransaction();
	    int res=qry.executeUpdate();
		 tx.commit();
		session.close();
		factory.close();
		
}
}