package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Course;
import com.priyansh.StudentManagementSystem.repository.CourseRepository;
import com.priyansh.StudentManagementSystem.service.CourseService;
@Service
public class CourseServiceImplements implements CourseService {
	
	@Autowired
	CourseRepository CS;
	
	public List<Course> getCourse(){
		return CS.findAll();
	}

}
