package com.priyansh.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Student;


@Repository

public interface StudnetRepository extends JpaRepository<Student,Long> {
	@Query("select a FROM Student a WHERE a.department =:department")
	public List<Student> getStudentbyDepartment(@Param("department") Department department);
}
