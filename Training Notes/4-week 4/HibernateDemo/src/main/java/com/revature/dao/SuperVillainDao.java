package com.revature.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.SuperVillain;
import com.revature.util.HibernateUtil;

public class SuperVillainDao {

	public int insert(SuperVillain sv) {
		// Capture session
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.getTransaction();
		
		int pk = (int) ses.save(sv);
		
		try {
			tx.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pk;
	}
	
	public List<SuperVillain> selectAll(){
		Session ses = HibernateUtil.getSession();
		
		// Hibernate supports a language called HQL
		
		List<SuperVillain> villains = ses.createQuery("from SuperVillain", SuperVillain.class).list();
		
		return villains;
	}
	
}
