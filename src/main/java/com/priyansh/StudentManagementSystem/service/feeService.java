package com.priyansh.StudentManagementSystem.service;

import java.util.List;

import com.priyansh.StudentManagementSystem.Entity.fees;

public interface feeService {

	public List<fees> getfees();

	public fees updatefee(fees f, Long student);
}
