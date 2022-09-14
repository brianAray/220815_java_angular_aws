package com.revature.model;

import java.util.Objects;

public class Ability {
	
	private int id;
	private String label;
	private String description;
	public Ability(int id, String label, String description) {
		super();
		this.id = id;
		this.label = label;
		this.description = description;
	}
	public Ability() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, id, label);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ability other = (Ability) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(label, other.label);
	}
	@Override
	public String toString() {
		return "Ability [id=" + id + ", label=" + label + ", description=" + description + "]";
	}
	

}
