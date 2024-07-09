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
import com.priyansh.StudentManagementSystem.service.CourseService;
import com.priyansh.StudentManagementSystem.service.DepartmentService;
import com.priyansh.StudentManagementSystem.service.StudentService;
import com.priyansh.StudentManagementSystem.service.TeacherService;


@RestController
@RequestMapping("/HOD")
public class DepartmentController {
	
	@Autowired
	private DepartmentService DS;
	@Autowired
	private StudentService SS;
	@Autowired
	private CourseService CS;
	@Autowired
	private TeacherService TS;
	
	@GetMapping("/SBD")
	public List<Student> getStudent() {
		return SS.getStudent();
	}
	
	
	@GetMapping("/DBD")
	public List<Department> getDepartment(){
		return DS.getDepartment();
	}
	
	
	
	@GetMapping("/CBD")
	public List<Course> getCourse(){
		return CS.getCourse();
	}
	

	@GetMapping("/TBD")
	public List<Teacher> getTeacher(){
		return TS.getTeacher();
	}

}