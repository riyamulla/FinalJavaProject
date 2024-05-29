package com.studentmanagement.studentManagementSystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagement.studentManagementSystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer>{

}
