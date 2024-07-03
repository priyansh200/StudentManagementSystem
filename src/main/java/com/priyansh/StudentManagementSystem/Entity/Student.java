package com.priyansh.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity

public class Student {
	@Id
	private int Stud_id;
	private String name;
	private String email;
	private String password;
	@OneToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
	private Course course_id;
	@OneToOne
    @JoinColumn(name = "tech_id", referencedColumnName = "tech_id")
	private Teacher tech_id;
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
	public Course getCourse_id() {
		return course_id;
	}
	//@JoinColumn(Course_id= Courses.Course_id )
	public void setCourse_id(Course course_id) {
		this.course_id = course_id;
	}
	
	public Teacher getTech_id() {
		return tech_id;
	}
	public void setTech_id(Teacher tech_id) {
		this.tech_id = tech_id;
	}
	public Student() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", password=" + password + ", Course_id=" + course_id
				+ ", tech_id=" + tech_id + "]";
	}
	
	
}
