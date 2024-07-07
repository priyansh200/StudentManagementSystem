package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.priyansh.StudentManagementSystem.Entity.fees;

@Repository
public interface feeRepository extends JpaRepository<fees,Long> {

}
