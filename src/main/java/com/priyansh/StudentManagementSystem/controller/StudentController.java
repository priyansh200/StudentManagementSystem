package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Books;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.Entity.fees;
import com.priyansh.StudentManagementSystem.service.BookService;
import com.priyansh.StudentManagementSystem.service.StudentService;
import com.priyansh.StudentManagementSystem.service.feeService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService SS;
	
	@Autowired
	private BookService BS;
	
	@PostMapping("/ADD")
	public Student addStudent(@RequestBody Student s) {
		return SS.addStudent(s);
	}
	
	@GetMapping("/ShowBook")
	public List<Books> getBooks(){
		return BS.getBooks();
	}
	
	@Autowired
	private feeService FS;
	
	@GetMapping("/ShowFee")
	public List<fees> getfees(){
		return FS.getfees();
	}

}
