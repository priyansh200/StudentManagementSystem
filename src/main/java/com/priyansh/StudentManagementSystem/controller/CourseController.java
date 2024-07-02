package com.priyansh.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.repository.CourseRepository;

@RestController
@RequestMapping("/Course")
public class CourseController {
	@Autowired
	private CourseRepository CS;

}
