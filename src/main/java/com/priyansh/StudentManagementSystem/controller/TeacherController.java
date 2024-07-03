package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Course;
import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.service.CourseService;
import com.priyansh.StudentManagementSystem.service.DepartmentService;
import com.priyansh.StudentManagementSystem.service.StudentService;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {


	
	@Autowired
	private CourseService CS;
	
	@Autowired
	private StudentService SS;
	
	@GetMapping("/Student")
	public List<Student> getStudent(){
		return SS.getStudent();
	}
	
	@GetMapping("/Course")
	public List<Course> getCourse(){
		return CS.getCourse();
	}
}
