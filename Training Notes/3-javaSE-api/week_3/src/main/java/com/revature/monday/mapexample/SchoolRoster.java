package com.revature.monday.mapexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolRoster {
	
	/*
	 * Hashmaps are like hash tables
	 * We will associate each class with a list of students
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// I choose array because I don't care about the order of the student, and I likely will manipulate and require
		// random indexing
		
		List<Entity> mathStudents = new ArrayList<>();
		List<Entity> engStudents = new ArrayList<>();
		List<Entity> artStudents = new ArrayList<>();
		
		
		Entity genericStudent = new Student("Mike", 11);
		
		mathStudents.add(genericStudent);
		engStudents.add(genericStudent);
		artStudents.add(genericStudent);
		
		
		Map<String, List<Entity>> classRosterMap = new HashMap<>();
		
		classRosterMap.put("Math", mathStudents);
		classRosterMap.put("Art", artStudents);
		classRosterMap.put("English" , engStudents);
		
		System.out.println(classRosterMap);

	}

}
