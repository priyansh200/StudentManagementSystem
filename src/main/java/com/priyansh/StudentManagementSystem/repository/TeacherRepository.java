package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.StudentManagementSystem.Entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {

}
