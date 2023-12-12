package com.example.Monolithic.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Monolithic.Entity.Project;
import com.example.Monolithic.Repository.ProjectResopitory;
import com.example.Monolithic.Service.ProjerctService;

@Service
public class ProjectServiceImpl implements ProjerctService {
	
	@Autowired
	private ProjectResopitory projectResopitory;

	@Override
	public Project saveProject(Project project) {
		// TODO Auto-generated method stub
		Project saveProject = projectResopitory.save(project);
		return saveProject;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		// TODO Auto-generated method stub
		Project foundProject = projectResopitory.findByProjectCode(projectCode);
		return foundProject;
	}

}
