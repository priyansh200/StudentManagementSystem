package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyansh.StudentManagementSystem.Entity.Department;


public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
