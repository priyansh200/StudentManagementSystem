package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.priyansh.StudentManagementSystem.Entity.Course;
@Repository

public interface CourseRepository  extends JpaRepository<Course,Long> {

}
