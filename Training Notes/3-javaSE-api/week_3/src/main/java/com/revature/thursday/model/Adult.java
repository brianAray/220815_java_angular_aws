package com.revature.thursday.model;

import java.util.Objects;

public class Adult implements Person{
	
	private String name;
	private int age;
	private String city;
	private String country;
	
	

	public Adult(String name, int age, String city, String country) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.country = country;
	}
	
	private Adult(String noName) {
		System.out.println(noName);
	}
	
	private void thisIsJustPrivate() {
		System.out.println("I can't be called normally outside of the class");
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(age, city, country, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adult other = (Adult) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(name, other.name);
	}

	

	@Override
	public String toString() {
		return "Adult [name=" + name + ", age=" + age + ", city=" + city + ", country=" + country + "]";
	}


	@Override
	public void introduce() {
		System.out.println("My name is " + this.name);
	}

	@Override
	public void sayAge() {
		// TODO Auto-generated method stub
		System.out.println("My age is " + this.age);
		
	}

	@Override
	public void sayWhereFrom() {
		// TODO Auto-generated method stub
		System.out.println("I'm from " + this.city + ", " + this.country);
	}

}
