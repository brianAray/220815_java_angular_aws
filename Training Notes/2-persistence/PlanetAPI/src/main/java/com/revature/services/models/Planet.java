package com.revature.services.models;

import java.util.List;
import java.util.Objects;

public class Planet extends CelestialBody{
	
	private Integer planetId;
	
	private Integer weight;
	
	private Integer value;
	
	private List<CelestialBody> orbitals;
	
	private List<Species> lifeForm;

	public Planet(String name, Integer planetId, Integer weight, Integer value, List<CelestialBody> orbitals,
			List<Species> lifeForm) {
		super(name);
		this.planetId = planetId;
		this.weight = weight;
		this.value = value;
		this.orbitals = orbitals;
		this.lifeForm = lifeForm;
	}

	public Integer getPlanetId() {
		return planetId;
	}

	public void setPlanetId(Integer planetId) {
		this.planetId = planetId;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public List<CelestialBody> getOrbitals() {
		return orbitals;
	}

	public void setOrbitals(List<CelestialBody> orbitals) {
		this.orbitals = orbitals;
	}

	public List<Species> getLifeForm() {
		return lifeForm;
	}

	public void setLifeForm(List<Species> lifeForm) {
		this.lifeForm = lifeForm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(lifeForm, orbitals, planetId, value, weight);
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
		Planet other = (Planet) obj;
		return Objects.equals(lifeForm, other.lifeForm) && Objects.equals(orbitals, other.orbitals)
				&& Objects.equals(planetId, other.planetId) && Objects.equals(value, other.value)
				&& Objects.equals(weight, other.weight);
	}

	@Override
	public String toString() {
		return "Planet [planetId=" + planetId + ", weight=" + weight + ", value=" + value + ", orbitals=" + orbitals
				+ ", lifeForm=" + lifeForm + "]";
	}

	

	
	
	
	

}
