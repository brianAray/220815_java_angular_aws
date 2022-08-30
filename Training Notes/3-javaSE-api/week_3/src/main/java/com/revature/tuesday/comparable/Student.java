package com.revature.tuesday.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Student implements Comparable<Student>{

	private String name;
	private Integer age;
	
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}



	public int compareTo(Student o) {

//		if(this.age == o.age) {
//			return 0;
//		}else if(this.age > o.age) {
//			return 1;
//		}else {
//			return -1;
//		}
		
		//Simple form
		return o.age - this.age;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Mike", 100);
		Student s2 = new Student("Jim", 20);
		Student s3 = new Student("Jane", 60);
		
		List<Student> students = Arrays.asList(s1, s2, s3);
		
		System.out.println(students);

		Collections.sort(students);
		
		System.out.println(students);
		
	}
	
	
	

}
