package com.priyansh.StudentManagementSystem.service;

import java.util.List;

import com.priyansh.StudentManagementSystem.Entity.Student;

public interface StudentService {
	Student addStudent(Student s);
	
	public List<Student> getStudent();
	
}
