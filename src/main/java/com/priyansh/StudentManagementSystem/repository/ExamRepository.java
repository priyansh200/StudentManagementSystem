package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyansh.StudentManagementSystem.Entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long>{

}
