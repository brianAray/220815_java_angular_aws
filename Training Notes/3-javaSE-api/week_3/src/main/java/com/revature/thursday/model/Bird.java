package com.revature.thursday.model;

import java.util.Objects;

public class Bird extends Animal{

	private boolean walks;
	
	public Bird() {
		super("Bird");
	}
	
	public Bird(String name, boolean walks) {
		super(name);
		this.walks = walks;
	}
	
	public Bird(String name) {
		super(name);
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(walks);
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
		Bird other = (Bird) obj;
		return walks == other.walks;
	}

	public boolean isWalks() {
		return walks;
	}

	public void setWalks(boolean walks) {
		this.walks = walks;
	}

	@Override
	public String toString() {
		return "Bird [walks=" + walks + "]";
	}
	
	
}
