package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Books;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.Entity.fees;
import com.priyansh.StudentManagementSystem.repository.BookRepository;
import com.priyansh.StudentManagementSystem.repository.feeRepository;
import com.priyansh.StudentManagementSystem.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService SS;
	
	@Autowired
	private BookRepository BS;
	
	@PostMapping
	public Student addStudent(@RequestBody Student s) {
		return SS.addStudent(s);
	}
	
	@GetMapping("/ShowBook")
	public List<Books> getBooks(){
		return BS.findAll();
	}
	
	@Autowired
	private feeRepository FS;
	
	@GetMapping("/ShowFee")
	public List<fees> getfees(){
		return FS.findAll();
	}

}
