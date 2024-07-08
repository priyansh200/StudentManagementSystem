package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Books;

import com.priyansh.StudentManagementSystem.repository.BookRepository;
import com.priyansh.StudentManagementSystem.service.BookService;

@Service
public class BookServiceImplement implements BookService {

	@Autowired
	BookRepository BS;
	
	public Books addBooks(Books b) {
		return BS.save(b);
	}
	
	public List<Books> getBooks(){
		return BS.findAll();
	}
}
