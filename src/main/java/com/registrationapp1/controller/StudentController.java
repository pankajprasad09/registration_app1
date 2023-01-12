package com.registrationapp1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.registrationapp1.dto.StudentDTO;
import com.registrationapp1.entities.Student;
import com.registrationapp1.services.StudentService;
import com.registrationapp1.util.EmailService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private EmailService mailService;
	
	//http://localhost:8080/home
	@RequestMapping("/home")
	public String homePage() {
		return "home_page";
	}
	
	@RequestMapping("/registerPage")
	public String registrationPage() {
		return "registration_page";
	}
	
	@RequestMapping("/register")
	public String registerStudent(@ModelAttribute("student") Student student,ModelMap model) {
		studentService.saveOneStudent(student);
		mailService.sendMail(student.getEmail(), "Testing sts", "Hello!! Pankaj I Love you so much.");
		model.addAttribute("msg", "<font color='blue'>Registered successfully</font>");
		return "registration_page";
	}
	
	@RequestMapping("/showAll")
	public String listAllStudent(ModelMap model) {
		List<Student> studentList = studentService.getAllStudent();
		model.addAttribute("studentList",studentList);
		return "students_list";
	}
	
	@RequestMapping("/deleteOneStudent")
	public String deleteStudent(@RequestParam("id") int id,ModelMap model) {
		studentService.deleteOneStudent(id);
		
		List<Student> studentList = studentService.getAllStudent();
		model.addAttribute("studentList",studentList);
		return "students_list";
	}
	
	@RequestMapping("/updatePage")
	public String updatePage(@RequestParam("id") int id,ModelMap model) {
		Student student = studentService.getStudentInfo(id);
		model.addAttribute("student",student);
		return "update_studentInfo";
	}
	
	@RequestMapping("/update")
	public String editInfo(StudentDTO studentDTO,ModelMap model) {
		Student student = new Student();
		student.setId(studentDTO.getId());
		student.setName(studentDTO.getName());
		student.setCity(studentDTO.getCity());
		student.setEmail(studentDTO.getEmail());
		student.setDob(studentDTO.getDob());
		student.setMobile(studentDTO.getMobile());
		studentService.saveOneStudent(student);
		
		List<Student> studentList = studentService.getAllStudent();
		model.addAttribute("studentList",studentList);
		return "students_list";
	}
}
