package com.studentmanagement.studentManagementSystem.service;

import java.util.List;

import com.studentmanagement.studentManagementSystem.model.Student;



public interface StudentService {
	public Student saveRegistered(Student student);
	public List<Student> studentList();
    public void deleteByid(int id);
    public List<Student> getAllStudents();
	
}
