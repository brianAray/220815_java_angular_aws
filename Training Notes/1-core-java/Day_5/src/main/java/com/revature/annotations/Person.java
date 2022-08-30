package com.revature.annotations;

@JsonSerializable
public class Person {
	
	@JsonElement
	private String firstName;
	
	@JsonElement
	private String lastName;
	
	@JsonElement(key = "personAge")
	private String age;
	
	private String address;
	
	@Init
	public void initName() {

		this.firstName = this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1).toLowerCase();
		
		this.lastName = this.lastName.substring(0, 1).toUpperCase() + this.lastName.substring(1).toLowerCase();
	}

}
