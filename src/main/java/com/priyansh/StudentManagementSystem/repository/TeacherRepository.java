package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.priyansh.StudentManagementSystem.Entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
	
}
