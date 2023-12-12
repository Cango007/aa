package com.example.Monolithic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Monolithic.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	

}
