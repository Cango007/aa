package com.example.Monolithic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Monolithic.Entity.Employee;
import com.example.Monolithic.Entity.Project;

public interface ProjectResopitory extends JpaRepository<Project, Long> {
	
	Project findByProjectCode(long employeeAssignedProject);

	Project save(Project project);

}
