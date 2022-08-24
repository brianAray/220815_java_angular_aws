package com.revature.repository.DTO;

import java.util.Objects;

public class MoonDTO {
	
	private Integer moon_id;
	
	private String name;
	
	private Integer planet_id;

	public MoonDTO(Integer moon_id, String name, Integer planet_id) {
		super();
		this.moon_id = moon_id;
		this.name = name;
		this.planet_id = planet_id;
	}

	public Integer getMoon_id() {
		return moon_id;
	}

	public void setMoon_id(Integer moon_id) {
		this.moon_id = moon_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPlanet_id() {
		return planet_id;
	}

	public void setPlanet_id(Integer planet_id) {
		this.planet_id = planet_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(moon_id, name, planet_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MoonDTO other = (MoonDTO) obj;
		return Objects.equals(moon_id, other.moon_id) && Objects.equals(name, other.name)
				&& Objects.equals(planet_id, other.planet_id);
	}

	@Override
	public String toString() {
		return "MoonDTO [moon_id=" + moon_id + ", name=" + name + ", planet_id=" + planet_id + "]";
	}

	
}
