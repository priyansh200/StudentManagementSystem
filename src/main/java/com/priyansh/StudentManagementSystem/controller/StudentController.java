package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	feeRepository FR;
	
	@Autowired
	BookRepository BR;
	
	@PostMapping("/ADD")
	public Student addStudent(@RequestBody Student s) {
		return SS.addStudent(s);
	}
	
	@GetMapping("/Studentfee/{student}")
    public List<fees> getFeesbyStudent( @PathVariable("student")Student student){
    	return FR.getFeesbyStudent(student);
    	
    }
    
    @GetMapping("/Studentbook/{student}")
    public List<Books> getBookbyStudent( @PathVariable("student")Student student){
    	return BR.getBookbyStudent(student);
    	
    }

	
	

}
