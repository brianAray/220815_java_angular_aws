package com.revature.services.models;

import java.util.List;
import java.util.Objects;

public class Galaxy extends CelestialBody{
	
	private String type;
	private Integer age;
	private List<CelestialBody> contents;
	public Galaxy(String name, String type, Integer age, List<CelestialBody> contents) {
		super(name);
		this.type = type;
		this.age = age;
		this.contents = contents;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<CelestialBody> getContents() {
		return contents;
	}
	public void setContents(List<CelestialBody> contents) {
		this.contents = contents;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(age, contents, type);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Galaxy other = (Galaxy) obj;
		return Objects.equals(age, other.age) && Objects.equals(contents, other.contents)
				&& Objects.equals(type, other.type);
	}
	@Override
	public String toString() {
		return "Galaxy [type=" + type + ", age=" + age + ", contents=" + contents + "]";
	}

	

}
