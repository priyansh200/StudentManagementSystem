package com.priyansh.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.priyansh.StudentManagementSystem.Entity.Student;
import com.priyansh.StudentManagementSystem.Entity.fees;

@Repository
public interface feeRepository extends JpaRepository<fees,Long> {
	
	@Query("select a FROM fees a WHERE a.student =:student")
	public List<fees> getFeesbyStudent(@Param("student") Student student);

}
