package com.priyansh.StudentManagementSystem.service;

import java.util.List;
import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.Entity.Teacher;
import com.priyansh.StudentManagementSystem.Entity.Course;

public interface TeacherService {

	public List<Course> getCourse();
	public List<Student> getStudent();
	public List<Teacher> getTeacher();
}
