package com.citiustech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "patients")
@Data
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String title;
	private String firstName;
	private String lastName;
	private String patientEmail;
	private String contactNumber;
	private String dateOfBirth;
	private String password;

}
