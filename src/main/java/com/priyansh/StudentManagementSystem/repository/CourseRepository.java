package com.priyansh.StudentManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.priyansh.StudentManagementSystem.Entity.Course;
@Repository

public interface CourseRepository  extends JpaRepository<Course,Long> {
	@EntityGraph(attributePaths = {"course_id", "name", "dept_id" , "tech_id"})
    List<Course> findAll();
}
