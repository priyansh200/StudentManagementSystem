package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.repository.StudnetRepository;
import com.priyansh.StudentManagementSystem.service.StudentService;
@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudnetRepository Sr ; 
	
	public Student addStudent(Student s) {
		return Sr.save(s);
	}
	
	public List<Student> getStudent(){
		return Sr.findAll();
	}

}
