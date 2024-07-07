package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Books;
import com.priyansh.StudentManagementSystem.repository.BookRepository;

@RestController
@RequestMapping("/Librarian")
public class BookController {
	
	@Autowired
	BookRepository BS;
	
	@PostMapping("/AddBook")
	public Books addBooks(@RequestBody Books b) {
		return ((BookController) BS).addBooks(b);
	}
	
	
	@GetMapping("/SAB")
	public List<Books> getBooks(){
		return BS.findAll();
	}

}
