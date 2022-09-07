package com.revature.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Crime;
import com.revature.util.HibernateUtil;

public class CrimeDao {
	
	public int insert(Crime crime) {
		
		// Capture Session
		Session ses = HibernateUtil.getSession();
		
		// Import Transaction from hibernate not JPA
		Transaction tx = ses.beginTransaction();
		
		int pk = (int) ses.save(crime); // The save() session method performs an insert on the DB
		
		try {
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pk;
	}

}
