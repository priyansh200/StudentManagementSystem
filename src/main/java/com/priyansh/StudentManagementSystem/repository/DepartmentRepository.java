package com.priyansh.StudentManagementSystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Student;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
	
	//@Query( nativeQuery = true , value = "select d from Student where d.course_id=:d")
	//Optional<Student>findAll(@Param("course_id")int d);
}


