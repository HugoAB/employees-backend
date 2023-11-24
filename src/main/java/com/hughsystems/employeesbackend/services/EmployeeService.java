package com.hughsystems.employeesbackend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hughsystems.employeesbackend.models.Employee;
import com.hughsystems.employeesbackend.repositories.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
}
