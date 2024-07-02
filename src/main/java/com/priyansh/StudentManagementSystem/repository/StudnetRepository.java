package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.StudentManagementSystem.Entity.Student;

public interface StudnetRepository extends JpaRepository<Student,Long> {


}
