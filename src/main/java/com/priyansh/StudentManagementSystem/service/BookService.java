package com.priyansh.StudentManagementSystem.service;

import java.awt.print.Book;
import java.util.List;

import com.priyansh.StudentManagementSystem.Entity.Books;

public interface BookService {
	
	public Books addBooks(Books b) ;
	public List<Books> getBooks();

}
