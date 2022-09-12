package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static Session ses;
	
	// SessionFactory is created by providing a configuration object
	private static SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	// This method obtains the JDBC connection which we can use to perform a transaction against our DB
	public static Session getSession() {
		if(ses == null) {
			ses = sf.openSession();
		}
		
		return ses;
	}
	
	public static void closeSes() {
		ses.close();
		sf.close();
	}
}
