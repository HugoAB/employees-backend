package com.hughsystems.employeesbackend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hughsystems.employeesbackend.models.Employee;
import com.hughsystems.employeesbackend.services.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ap1/employees")
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;
	
	@GetMapping("")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = employeeService.getAll();
		return ResponseEntity.ok().body(employees);
	}
}
