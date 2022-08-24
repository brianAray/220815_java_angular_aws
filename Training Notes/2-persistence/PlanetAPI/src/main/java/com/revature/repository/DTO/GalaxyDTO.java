package com.revature.repository.DTO;

import java.util.Objects;

public class GalaxyDTO {
	
	private Integer galaxy_id;
	private String name;
	private Integer type_id;
	private Integer age;
	public GalaxyDTO(Integer galaxy_id, String name, Integer type_id, Integer age) {
		super();
		this.galaxy_id = galaxy_id;
		this.name = name;
		this.type_id = type_id;
		this.age = age;
	}
	public Integer getGalaxy_id() {
		return galaxy_id;
	}
	public void setGalaxy_id(Integer galaxy_id) {
		this.galaxy_id = galaxy_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, galaxy_id, name, type_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GalaxyDTO other = (GalaxyDTO) obj;
		return Objects.equals(age, other.age) && Objects.equals(galaxy_id, other.galaxy_id)
				&& Objects.equals(name, other.name) && Objects.equals(type_id, other.type_id);
	}
	@Override
	public String toString() {
		return "GalaxyDTO [galaxy_id=" + galaxy_id + ", name=" + name + ", type_id=" + type_id + ", age=" + age + "]";
	}
	
	

}
