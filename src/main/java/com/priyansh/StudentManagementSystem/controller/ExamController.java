package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Exam;
import com.priyansh.StudentManagementSystem.service.ExamService;

@RestController
@RequestMapping("/Result")
public class ExamController {
	
	@Autowired
	ExamService ES;

	@GetMapping("/SR")
	public List<Exam> getExam(){
		return ES.getExam();
	}
}
