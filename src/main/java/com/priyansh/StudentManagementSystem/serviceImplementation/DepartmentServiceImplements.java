package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.repository.DepartmentRepository;
import com.priyansh.StudentManagementSystem.repository.StudnetRepository;
import com.priyansh.StudentManagementSystem.service.DepartmentService;

@Service
public class DepartmentServiceImplements implements DepartmentService {
	
	@Autowired
	DepartmentRepository DS;
	
	public List<Department> getDepartment(){
		return DS.findAll();
	}
	
}