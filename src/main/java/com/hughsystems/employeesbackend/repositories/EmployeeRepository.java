package com.hughsystems.employeesbackend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hughsystems.employeesbackend.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Optional<Employee> findEmployeeByPersonalId(String personalId);
}
