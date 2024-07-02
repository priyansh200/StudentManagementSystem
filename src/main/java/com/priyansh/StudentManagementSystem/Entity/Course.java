package com.priyansh.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private int course_id;
	private String name;

	private String dept_id;
	private String tech_id;
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
	
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getTech_id() {
		return tech_id;
	}
	public void setTech_id(String tech_id) {
		this.tech_id = tech_id;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", name=" + name + ", dept_id=" + dept_id
				+ ", tech_id=" + tech_id + "]";
	}
	
}
