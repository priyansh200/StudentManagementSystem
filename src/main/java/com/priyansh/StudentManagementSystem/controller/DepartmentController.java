package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.repository.StudnetRepository;
import com.priyansh.StudentManagementSystem.service.DepartmentService;


@RestController
@RequestMapping("/HOD")
public class DepartmentController {
	
	@Autowired
	private DepartmentService DS;
	@Autowired
	private StudnetRepository SS;
	
	@GetMapping("/Student")
	public List<Student> getStudent(){
		return SS.findAll();
	}
	
	
	@GetMapping("/Dept")
	public List<Department> getDepartment(){
		return DS. getDepartment();
	}
	
	
	

}