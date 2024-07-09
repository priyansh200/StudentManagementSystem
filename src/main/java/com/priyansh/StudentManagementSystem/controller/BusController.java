package com.priyansh.StudentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyansh.StudentManagementSystem.Entity.Bus;

import com.priyansh.StudentManagementSystem.repository.BusRepository;
import com.priyansh.StudentManagementSystem.service.BusService;

@RestController
@RequestMapping("/Bus")
public class BusController {

	@Autowired
	private BusService BS;
	
	@Autowired 
	private BusRepository BR;
	
	@GetMapping("/SAR")
	public List<Bus> getBus(){
		return BS.getBus();
	}
	
	@GetMapping("/SBR/{bus_rout}")
	 public List<Bus> getStudentbyBusRoute( @PathVariable("bus_rout") String bus_rout){
	    return BR.getStudentbyBusRoute(bus_rout);
	    	
	 }
}
