package com.example.Monolithic.Payload;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
	
	private Long id;
	private String employeeName;
	private String employeeEmail;
	private long employeeAssignedProject;
	private String employeeBaseLocation;

	private long projectCode;
	private String projectName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public long getProjectCode() {
		return projectCode;
	}
	public void setProjectCode(long projectCode) {
		this.projectCode = projectCode;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
}
