package com.priyansh.StudentManagementSystem.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyansh.StudentManagementSystem.Entity.Bus;
import com.priyansh.StudentManagementSystem.repository.BusRepository;
import com.priyansh.StudentManagementSystem.service.BusService;

@Service
public class BusServiceImplement implements BusService{

	@Autowired
	BusRepository BS;
	
	public List<Bus> getBus(){
		return BS.findAll();
	}
}
