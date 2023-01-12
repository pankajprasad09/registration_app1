package com.registrationapp1.services;

import java.util.List;

import com.registrationapp1.entities.Student;

public interface StudentService {

	public void saveOneStudent(Student student);

	public List<Student> getAllStudent();

	public void deleteOneStudent(int id);

	public Student getStudentInfo(int id);
	 
}
