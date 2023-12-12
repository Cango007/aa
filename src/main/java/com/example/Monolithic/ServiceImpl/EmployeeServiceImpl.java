package com.example.Monolithic.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Monolithic.Entity.Employee;
import com.example.Monolithic.Entity.Project;
import com.example.Monolithic.Payload.EmployeeDto;
import com.example.Monolithic.Repository.EmployeeRepository;
import com.example.Monolithic.Repository.ProjectResopitory;
import com.example.Monolithic.Service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectResopitory projectResopitory;

	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee savedEmployee = employeeRepository.save(employee);
		Project  project = projectResopitory.findByProjectCode(savedEmployee.getEmployeeAssignedProject());
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(savedEmployee.getId());
		employeeDto.setEmployeeName(savedEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(savedEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocation(savedEmployee.getEmployeeBaseLocation());
		employeeDto.setEmployeeAssignedProject(savedEmployee.getEmployeeAssignedProject());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Employee foundEmployee = employeeRepository.findById(id).get();
		Project project = projectResopitory.findByProjectCode(foundEmployee.getEmployeeAssignedProject());
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(foundEmployee.getId());
		employeeDto.setEmployeeName(foundEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(foundEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocation(foundEmployee.getEmployeeBaseLocation());
		employeeDto.setEmployeeAssignedProject(foundEmployee.getEmployeeAssignedProject());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		return employeeDto;
	}

}
