package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Course;
import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.Entity.Teacher;
import com.priyansh.StudentManagementSystem.repository.CourseRepository;
import com.priyansh.StudentManagementSystem.repository.StudnetRepository;
import com.priyansh.StudentManagementSystem.repository.TeacherRepository;
import com.priyansh.StudentManagementSystem.service.DepartmentService;


@RestController
@RequestMapping("/HOD")
public class DepartmentController {
	
	@Autowired
	private DepartmentService DS;
	@Autowired
	private StudnetRepository SS;
	@Autowired
	private CourseRepository CS;
	@Autowired
	private TeacherRepository TS;
	
	@GetMapping("/Student")
	public List<Student> getStudent(){
		return SS.findAll();
	}
	
	
	@GetMapping("/Dept")
	public List<Department> getDepartment(){
		return DS. getDepartment();
	}
	
	
	@GetMapping("/Course")
	public List<Course> getCourse(){
		return CS.findAll();
	}
	

	@GetMapping("/Teacher")
	public List<Teacher> getTeacher(){
		return TS.findAll();
	}
	
	
	
	
	

}