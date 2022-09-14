package com.revature.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Polkamon {
	
	private int id;
	private String name;
	
	public Polkamon(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public Polkamon() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Polkamon other = (Polkamon) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Polkamon [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
