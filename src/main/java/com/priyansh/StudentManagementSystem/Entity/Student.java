package com.priyansh.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;


@Entity

public class Student {
	@Id
	private int Stud_id;
	private String name;
	private String email;
	private String password;
	
	private int Course_id;
	public int getStud_id() {
		return Stud_id;
	}
	public void setStud_id(int stud_id) {
		Stud_id = stud_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCourse_id() {
		return Course_id;
	}
	//@JoinColumn(Course_id= Courses.Course_id )
	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}
	public Student() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Stud_id=" + Stud_id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", Course_id=" + Course_id + "]";
	}
	
	
	
	
}
