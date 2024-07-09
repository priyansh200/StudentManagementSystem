package com.priyansh.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.priyansh.StudentManagementSystem.Entity.Exam;
import com.priyansh.StudentManagementSystem.Entity.Student;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long>{
	
	@Query("select a FROM Exam a WHERE a.student =:student")
	public List<Exam> getResultbyStudent(@Param("student") Student student);
}

