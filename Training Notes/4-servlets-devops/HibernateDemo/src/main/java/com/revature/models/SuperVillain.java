package com.revature.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="supervillains")
public class SuperVillain {

	@Id
	@Column(name="villain_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int svillid;
	
	@Column(name="name")
	private String name;

	@Column(name="superpower")
	private String superPower;
	
	@Column(name="bounty")
	private int bounty;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Crime> crimes;

	public SuperVillain() {
		super();
	}

	public SuperVillain(int svillid, String name, String superPower, int bounty, List<Crime> crimes) {
		super();
		this.svillid = svillid;
		this.name = name;
		this.superPower = superPower;
		this.bounty = bounty;
		this.crimes = crimes;
	}
	
	

	public SuperVillain(String name, String superPower, int bounty, List<Crime> crimes) {
		super();
		this.name = name;
		this.superPower = superPower;
		this.bounty = bounty;
		this.crimes = crimes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bounty, crimes, name, superPower, svillid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuperVillain other = (SuperVillain) obj;
		return bounty == other.bounty && Objects.equals(crimes, other.crimes) && Objects.equals(name, other.name)
				&& Objects.equals(superPower, other.superPower) && svillid == other.svillid;
	}

	public int getSvillid() {
		return svillid;
	}

	public void setSvillid(int svillid) {
		this.svillid = svillid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}

	public List<Crime> getCrimes() {
		return crimes;
	}

	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}

	@Override
	public String toString() {
		return "SuperVillain [svillid=" + svillid + ", name=" + name + ", superPower=" + superPower + ", bounty="
				+ bounty + ", crimes=" + crimes + "]";
	}
	
	
	
}
