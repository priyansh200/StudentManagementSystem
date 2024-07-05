package com.priyansh.StudentManagementSystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyansh.StudentManagementSystem.Entity.Books;


@Repository
public interface BookRepository extends JpaRepository<Books,Long> {



	
}

