package com.revature.repository.DTO;

import java.util.Objects;

public class SpeciesDTO {
	private Integer species_id;
	
	private String name;
	
	private Integer civ_type;

	public SpeciesDTO(Integer species_id, String name, Integer civ_type) {
		super();
		this.species_id = species_id;
		this.name = name;
		this.civ_type = civ_type;
	}

	public Integer getSpecies_id() {
		return species_id;
	}

	public void setSpecies_id(Integer species_id) {
		this.species_id = species_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCiv_type() {
		return civ_type;
	}

	public void setCiv_type(Integer civ_type) {
		this.civ_type = civ_type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(civ_type, name, species_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpeciesDTO other = (SpeciesDTO) obj;
		return Objects.equals(civ_type, other.civ_type) && Objects.equals(name, other.name)
				&& Objects.equals(species_id, other.species_id);
	}

	@Override
	public String toString() {
		return "SpeciesDTO [species_id=" + species_id + ", name=" + name + ", civ_type=" + civ_type + "]";
	}
	
	

}
