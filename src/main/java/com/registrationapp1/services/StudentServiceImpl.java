package com.registrationapp1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrationapp1.entities.Student;
import com.registrationapp1.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public void saveOneStudent(Student student) {
		studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> studentList = studentRepo.findAll();
		return studentList;
	}

	@Override
	public void deleteOneStudent(int id) {
		studentRepo.deleteById(id);
	}

	@Override
	public Student getStudentInfo(int id) {
		Optional<Student> findById = studentRepo.findById(id);
		Student student = findById.get();
		return student;
	}
	
}
