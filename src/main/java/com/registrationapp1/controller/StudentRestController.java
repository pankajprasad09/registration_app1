package com.registrationapp1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registrationapp1.entities.Student;
import com.registrationapp1.repositories.StudentRepository;

@RestController
@RequestMapping("/api/students") //http://localhost:8080/api/students
public class StudentRestController {
	 
	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping
	public List<Student> getStudentsList(){
		List<Student> stuList = studentRepo.findAll();
		return stuList;
	}
	
	@PostMapping
	public void saveStudent(@RequestBody Student student) {
		studentRepo.save(student);
	}
	
	@PutMapping
	public void updateStudent(@RequestBody Student student) {
		studentRepo.save(student);
	}
	
	@DeleteMapping("/delete/{id}") //http://localhost:8080/api/students/delete/1
	public void deleteOneStudent(@PathVariable("id") int id) {
		studentRepo.deleteById(id);
	}
	
	@GetMapping("/studentInfo/{id}") //http://localhost:8080/api/students/studentInfo/1
	public Student getOneStudentInfo(@PathVariable("id") int id) {
		Optional<Student> oneStuInfo = studentRepo.findById(id);
		Student student = oneStuInfo.get();
		return student;		
	}
}
