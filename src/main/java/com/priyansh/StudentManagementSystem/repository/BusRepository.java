package com.priyansh.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.priyansh.StudentManagementSystem.Entity.Bus;


@Repository
public interface BusRepository extends JpaRepository<Bus,Long>{
	

	@Query("select a FROM BUs a WHERE a.bus_rout =:bus_rout")
	public List<Bus> getStudentbyBusRoute(@Param("but_rout") String bus_rout);

}
