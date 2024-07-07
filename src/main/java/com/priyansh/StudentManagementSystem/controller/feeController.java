package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.fees;
import com.priyansh.StudentManagementSystem.repository.feeRepository;
import com.priyansh.StudentManagementSystem.service.feeService;

@RestController
@RequestMapping("/Accountant")
public class feeController {

	@Autowired
	private feeRepository FS;
	
	@GetMapping("/SAF")
	public List<fees> getfees(){
		return FS.findAll();
	}
	
	@PutMapping("/update/{student}")
	 
    public fees updatefee(@RequestBody fees f, @PathVariable("student") Long student)
    {
        return feeService.updatestudent(f, student);
    }
	
}
