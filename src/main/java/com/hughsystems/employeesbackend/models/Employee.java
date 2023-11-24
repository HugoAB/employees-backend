package com.hughsystems.employeesbackend.models;

import java.util.Date;

import com.hughsystems.employeesbackend.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private Date dateOfBirth;
	private Date joinDate;
	private Gender gender;
	private Boolean active;
	private Date leaveDate;
	private Double salary;
	private String position;
	private String personalId;
	
	private Department department;
}
