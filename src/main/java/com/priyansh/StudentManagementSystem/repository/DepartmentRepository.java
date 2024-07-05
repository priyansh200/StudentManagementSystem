package com.priyansh.StudentManagementSystem.repository;


import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.priyansh.StudentManagementSystem.Entity.Department;
import com.priyansh.StudentManagementSystem.Entity.Teacher;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

