package com.priyansh.StudentManagementSystem.service;

import java.util.List;

import com.priyansh.StudentManagementSystem.Entity.Books;

public interface BookService {
	
	public Books addBooks(Books b) ;
	public List<Books> getBooks();

}
