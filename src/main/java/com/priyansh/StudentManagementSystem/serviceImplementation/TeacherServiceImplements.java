package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Teacher;
import com.priyansh.StudentManagementSystem.repository.TeacherRepository;
import com.priyansh.StudentManagementSystem.service.TeacherService;

@Service
public class TeacherServiceImplements implements TeacherService{
	
	@Autowired
	TeacherRepository TS;
	
	public List<Teacher> getTeacher(){
		return TS.findAll();
	}
}
