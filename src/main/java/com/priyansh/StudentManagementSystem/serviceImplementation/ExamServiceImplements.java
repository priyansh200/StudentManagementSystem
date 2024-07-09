package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.priyansh.StudentManagementSystem.Entity.Exam;
import com.priyansh.StudentManagementSystem.repository.ExamRepository;
import com.priyansh.StudentManagementSystem.service.ExamService;

@Service
public class ExamServiceImplements implements ExamService {

	@Autowired
	ExamRepository ES;
	
	public List<Exam> getExam(){
		return ES.findAll();
	}
}
