package com.revature.services.models;

import java.util.Objects;

public class Species {
	
	private String name;
	private Integer civType;
	public Species(String name, Integer civType) {
		super();
		this.name = name;
		this.civType = civType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCivType() {
		return civType;
	}
	public void setCivType(Integer civType) {
		this.civType = civType;
	}
	@Override
	public int hashCode() {
		return Objects.hash(civType, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Species other = (Species) obj;
		return Objects.equals(civType, other.civType) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Species [name=" + name + ", civType=" + civType + "]";
	}
	
	

}
