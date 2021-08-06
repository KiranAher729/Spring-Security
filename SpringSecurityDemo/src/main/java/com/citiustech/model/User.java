package com.citiustech.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.citiustech.config.SecurityConfig;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="users")
@NoArgsConstructor
public class User {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String title;
	private String firstName;
	private String lastName;
	private String userEmail;
	private String role;
	private String dateOfBirth;
	private String password;
	
	public User(String title, String firstName, String lastName, String userEmail, String role, String dateOfBirth,
			String password) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userEmail = userEmail;
		this.role = role;
		this.dateOfBirth = dateOfBirth;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password= password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userEmail=" + userEmail + ", role=" + role + ", dateOfBirth=" + dateOfBirth + ", password="
				+ password + "]";
	}
	
	
	
	
	
}


