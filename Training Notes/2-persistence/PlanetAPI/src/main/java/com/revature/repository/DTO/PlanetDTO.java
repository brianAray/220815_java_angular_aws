package com.revature.repository.DTO;

import java.util.Objects;

public class PlanetDTO {

	private Integer planet_id;
	private String name;
	private Integer weight;
	private Integer value;
	private Integer moon_number;
	private Integer galaxy_id;
	public PlanetDTO(Integer planet_id, String name, Integer weight, Integer value, Integer moon_number,
			Integer galaxy_id) {
		super();
		this.planet_id = planet_id;
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.moon_number = moon_number;
		this.galaxy_id = galaxy_id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(galaxy_id, moon_number, name, planet_id, value, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanetDTO other = (PlanetDTO) obj;
		return Objects.equals(galaxy_id, other.galaxy_id) && Objects.equals(moon_number, other.moon_number)
				&& Objects.equals(name, other.name) && Objects.equals(planet_id, other.planet_id)
				&& Objects.equals(value, other.value) && Objects.equals(weight, other.weight);
	}
	public Integer getPlanet_id() {
		return planet_id;
	}
	public void setPlanet_id(Integer planet_id) {
		this.planet_id = planet_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Integer getMoon_number() {
		return moon_number;
	}
	public void setMoon_number(Integer moon_number) {
		this.moon_number = moon_number;
	}
	public Integer getGalaxy_id() {
		return galaxy_id;
	}
	public void setGalaxy_id(Integer galaxy_id) {
		this.galaxy_id = galaxy_id;
	}
	@Override
	public String toString() {
		return "PlanetDTO [planet_id=" + planet_id + ", name=" + name + ", weight=" + weight + ", value=" + value
				+ ", moon_number=" + moon_number + ", galaxy_id=" + galaxy_id + "]";
	}
	
	
}
