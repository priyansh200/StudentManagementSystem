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
import com.priyansh.StudentManagementSystem.repository.BookRepository;

@RestController
@RequestMapping("/Book")
public class BookController {
	
	@Autowired
	BookRepository BS;
	
	@PostMapping("/Add")
	public Books addBooks(@RequestBody Books b) {
		return BS.addBooks(b); 
	}
	
	@GetMapping("/Show")
	public List<Books> getBooks(){
		return BS.findAll();
	}

}
