package com.example.Monolithic.Service;

import com.example.Monolithic.Entity.Project;

public interface ProjerctService {
	
	
	public Project saveProject(Project project);
	public Project getProjectByCode(long projectCode);
	
	

}
