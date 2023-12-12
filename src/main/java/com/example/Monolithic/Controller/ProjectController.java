package com.example.Monolithic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Monolithic.Entity.Employee;
import com.example.Monolithic.Entity.Project;
import com.example.Monolithic.Payload.EmployeeDto;
import com.example.Monolithic.Service.EmployeeService;
import com.example.Monolithic.Service.ProjerctService;
import com.example.Monolithic.ServiceImpl.ProjectServiceImpl;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	private ProjerctService projerctService;
	
	@PostMapping
	public Project createEmployee(@RequestBody Project project)
	{
		return projerctService.saveProject(project);
	}
	
	@GetMapping("/{project_id}")
	public Project getProjectById(@PathVariable(name = "project_id")long project_id)
	{
		return projerctService.getProjectByCode(project_id);
	}
	
	
	

}
