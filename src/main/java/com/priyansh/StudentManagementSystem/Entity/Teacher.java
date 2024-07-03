package com.priyansh.StudentManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Teacher {
	
	@Id
	private int tech_id;
	private String name;
	private String subject;
	@OneToOne
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
	private Course course_id;
	public int getTech_id() {
		return tech_id;
	}
	public void setTech_id(int tech_id) {
		this.tech_id = tech_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Course getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Course course_id) {
		this.course_id = course_id;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", course_id=" + course_id + "]";
	}
	
	
}
