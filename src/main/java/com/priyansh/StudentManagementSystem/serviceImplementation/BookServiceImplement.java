package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Books;

import com.priyansh.StudentManagementSystem.repository.BookRepository;

@Service
public class BookServiceImplement {

	@Autowired
	BookRepository BS;
	
	public Books addBooks(Books b) {
		return BS.save(b);
	}
	
	
	public List<Books> getBooks(){
		return BS.findAll();
	}
}
