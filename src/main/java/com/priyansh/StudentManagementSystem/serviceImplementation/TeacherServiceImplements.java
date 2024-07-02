package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Course;
import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.repository.CourseRepository;
import com.priyansh.StudentManagementSystem.repository.DepartmentRepository;
import com.priyansh.StudentManagementSystem.repository.StudnetRepository;
import com.priyansh.StudentManagementSystem.service.TeacherService;

@Service
public class TeacherServiceImplements implements TeacherService{

	@Autowired
	DepartmentRepository DS;
	
	public List<Department> getDepartment(){
		return DS.findAll();
	}
	
	@Autowired
	StudnetRepository SS;
	
	public List<Student> getStudent(){
		return SS.findAll();
	}
	
	@Autowired
	CourseRepository CS;
	
	public List<Course> getCourse(){
		return CS.findAll();
	}
}
