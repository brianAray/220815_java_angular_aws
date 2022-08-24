package com.revature.services.models;

import java.util.Objects;

public abstract class CelestialBody {
	
	protected String name;

	public CelestialBody(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CelestialBody other = (CelestialBody) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "CelestialBody [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
