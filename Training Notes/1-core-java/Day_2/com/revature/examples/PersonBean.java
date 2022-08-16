package com.revature.models;

import java.util.Objects;

public class PersonBean {
	private String name;
	private int age;
	public PersonBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonBean other = (PersonBean) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonBean [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		PersonBean personA = new PersonBean("Mike", 555);
		PersonBean personB = new PersonBean("Mike", 555);
		
		System.out.println(personA.equals(personB));
		
	}
	
	
}
