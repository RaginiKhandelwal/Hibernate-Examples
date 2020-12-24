package com.hqlEx;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hqlEx.MyProducts;


public class ForOurLogic {
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//creating and inserting data
//		MyProducts p=new  MyProducts();
//
//		p.setProductId(112);
//		p.setProName("television");
//		p.setPrice(20000);
//		 
//
//		Transaction tx = session.beginTransaction();
//		session.save(p);
//		System.out.println("Object saved successfully.....!!");
//		tx.commit();
//		
		/* case1==Selecting all objects(records) start_______________________ */

//in alreadycreated table

//		Query qry = session.createQuery("from MyProducts p ");
//
//			List l =(List) qry.list();
//			System.out.println("Total Number Of Records : "+l.size());
//			Iterator it = l.iterator();
//
//			while(it.hasNext())
//			{
//				Object o = (Object)it.next();
//				MyProducts p = (MyProducts)o;
//				//MyProducts p = (MyProducts)it.next();
//				System.out.println("Product id : "+p.getProductId());
//				System.out.println("Product Name : "+p.getProName());
//				System.out.println("Product Price : "+p.getPrice());
//				System.out.println("----------------------");
//			}
		
		
//case 2==	single record	
//			Query qry = session.createQuery("from MyProducts p  where p.productId=112");
//            //qry.setParameter(0,112);//does not support ? concept
//			List l =(List) qry.list();
//			System.out.println("Total Number Of Records : "+l.size());
//			Iterator it = l.iterator();
//
//			while(it.hasNext())
//			{
//				 
//				MyProducts p = (MyProducts)it.next();
//				System.out.println("Product id : "+p.getProductId());
//				System.out.println("Product Name : "+p.getProName());
//				System.out.println("Product Price : "+p.getPrice());
//				System.out.println("----------------------");
//			}	
			
		
		/*case 3== Selecting partial objects(More than one object) start__________ */		

		

	Query qry = session.createQuery("select p.productId,p.proName from MyProducts p where p.proName like '%e%'");

			List l =qry.list();
			System.out.println("Total Number Of Records : "+l.size());
			Iterator it = l.iterator();

			while(it.hasNext())
			{
				Object o[] = (Object[])it.next();

				System.out.println("Product id : "+o[0]+ "Product Name : "+o[1]);

				System.out.println("----------------");
			}			

			

		
			
			session.close();
			factory.close();
		}

			

}
