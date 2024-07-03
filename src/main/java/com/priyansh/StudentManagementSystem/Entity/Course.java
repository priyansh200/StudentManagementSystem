package com.priyansh.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Course {
	@Id
	private int course_id;
	private String name;
	@OneToOne
    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
	private Department dept_id;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Department getDept_id() {
		return dept_id;
	}
	public void setDept_id(Department dept_id) {
		this.dept_id = dept_id;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", dept_id=" + dept_id + "]";
	}
	
	
}
