package com.priyansh.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;

@Entity
public class Books {

	private int Book_id;
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getBook_name() {
		return Book_name;
	}
	@Override
	public String toString() {
		return "Books [Book_id=" + Book_id + ", Book_name=" + Book_name + ", Book_author=" + Book_author + "]";
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public String getBook_author() {
		return Book_author;
	}
	public void setBook_author(String book_author) {
		Book_author = book_author;
	}
	private String Book_name;
	private String Book_author;
	
}
