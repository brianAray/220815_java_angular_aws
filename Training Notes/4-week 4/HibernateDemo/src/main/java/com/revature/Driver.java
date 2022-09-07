package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.CrimeDao;
import com.revature.dao.SuperVillainDao;
import com.revature.models.Crime;
import com.revature.models.SuperVillain;

public class Driver {

	static CrimeDao cDao = new CrimeDao();
	static SuperVillainDao svDao = new SuperVillainDao();
	
	public static void main(String[] args) {
		System.out.println("Starting the program ...");
		
		Crime c1 = new Crime("Arson", "Setting things on fire");
		Crime c2 = new Crime("Steal", "Stealing items that they do not own");
		Crime c3 = new Crime("Brain Washing", "Mentally controlling people");
		
		System.out.println("Inserting the Transient object into the DB with the .save() session method ...");
		
		cDao.insert(c1);
		cDao.insert(c2);
		cDao.insert(c3);
		
		List<Crime> crimeList = new ArrayList<>();
		
		crimeList.add(c1);
		crimeList.add(c2);
		crimeList.add(c3);
		
		SuperVillain joker = new SuperVillain("Joker", "Living in a society", 1000000, crimeList);
		
		svDao.insert(joker);
		
		System.out.println("Retrieving all villain objects");
		
		svDao.selectAll().forEach(System.out::println);
		
		System.out.println("Ending the program ...");

	}
}
