package com.priyansh.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyansh.StudentManagementSystem.Entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long>{

}
