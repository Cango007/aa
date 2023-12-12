package com.example.Monolithic.Service;

import com.example.Monolithic.Entity.Employee;
import com.example.Monolithic.Payload.EmployeeDto;

public interface EmployeeService {
	
	
	
	public EmployeeDto saveEmployee(Employee employee);
	public  EmployeeDto getEmployeeById(long id);

}
