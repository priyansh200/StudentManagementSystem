package com.priyansh.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.priyansh.StudentManagementSystem.Entity.Student;


@Repository

public interface StudnetRepository extends JpaRepository<Student,Long> {

	@EntityGraph(attributePaths = {"stud_id","name", "email" , "password" , "course_id"})
    List<Student> findAll();
}
