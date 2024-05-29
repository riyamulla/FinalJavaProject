package com.studentmanagement.studentManagementSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.studentManagementSystem.model.Student;
import com.studentmanagement.studentManagementSystem.repo.StudentRepository;

@Service
	public class StudentServiceImp implements StudentService  {
	@Autowired
	private StudentRepository studentRepo;

	public Student saveRegistered(Student student) {
		return studentRepo.save(student);
	}
	public List<Student> studentList(){
		List<Student> findAll= studentRepo.findAll();
		return findAll;
	}
	public void deleteByid(int id) {
		studentRepo.deleteById(id);
	}
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
}