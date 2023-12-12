package com.example.Monolithic.Entity;

import org.springframework.stereotype.Service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
 @Entity
 @Table(name = "employee",uniqueConstraints = {@UniqueConstraint(columnNames = {"employeeEmail"})})
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String employeeName;
	@Column(nullable = false)
	private String employeeEmail;
	@Column(nullable = false)
	private long employeeAssignedProject;
	@Column(nullable = false)
	private String employeeBaseLocation;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public long getEmployeeAssignedProject() {
		return employeeAssignedProject;
	}
	public void setEmployeeAssignedProject(long employeeAssignedProject) {
		this.employeeAssignedProject = employeeAssignedProject;
	}
	public String getEmployeeBaseLocation() {
		return employeeBaseLocation;
	}
	public void setEmployeeBaseLocation(String employeeBaseLocation) {
		this.employeeBaseLocation = employeeBaseLocation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeEmail=" + employeeEmail
				+ ", employeeAssignedProject=" + employeeAssignedProject + ", employeeBaseLocation="
				+ employeeBaseLocation + "]";
	}
	public Employee(long id, String employeeName, String employeeEmail, long employeeAssignedProject,
			String employeeBaseLocation) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeAssignedProject = employeeAssignedProject;
		this.employeeBaseLocation = employeeBaseLocation;
	}
	public Employee() {
		super();
	}
	
	

}
