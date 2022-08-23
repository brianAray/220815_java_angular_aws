package com.revature.nesting;

public class User {

	/*
	 * Builder Pattern
	 * 
	 * Builder pattern aims to "separate the construction of a complex object from its representation"
	 * so that the same construction process can be done to create multiple different representations.
	 * 
	 * I have a user object that has these properties
	 */
	
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
	private final String favColour;
	
	/*
	 * The only time that I allow the fields to be set is when the object is created
	 * This created safety by making the object immutable essentially
	 */
	
	public User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
		this.favColour = builder.favColour;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	public String getFavColour() {
		return favColour;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	public static class UserBuilder{
		
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		private String favColour;
		
		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public UserBuilder favColour(String favColour) {
			this.favColour = favColour;
			return this;
		}
		
		// Finally, return the created user object
		public User build() {
			User user = new User(this);
			validateUserObject(user);
			return user;
		}
		
		public void validateUserObject(User user) {
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder("Brian", "Arayathel")
				.age(11)
				.phone("12312341241")
				.build();
		
		User user2 = new User.UserBuilder("John", "Doe")
				.address("123 Street Name")
				.favColour("Blue")
				.build();
	}
	
	
}
