package com.revature.repository.DTO;

import java.util.Objects;

public class UserDTO {
	
	protected Integer user_id;
	
	protected String username;
	
	protected String password;
	
	protected String email;
	
	protected Integer balance;

	public UserDTO(Integer user_id, String username, String password, String email, Integer balance) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.balance = balance;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(balance, email, password, user_id, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(balance, other.balance) && Objects.equals(email, other.email)
				&& Objects.equals(password, other.password) && Objects.equals(user_id, other.user_id)
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "UserDTO [user_id=" + user_id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", balance=" + balance + "]";
	}
	
	

	
	
	
	

}
