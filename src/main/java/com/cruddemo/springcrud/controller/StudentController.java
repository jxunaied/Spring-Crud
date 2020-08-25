package com.cruddemo.springcrud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cruddemo.springcrud.models.Student;
import com.cruddemo.springcrud.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public String getStudents(Model model) {
		model.addAttribute("students", studentService.getStudents());
		return "students";
	}
	
	@GetMapping("/singlestudent")
	@ResponseBody
	public Optional<Student> getStudentById(Integer Id, Model model) {
		return studentService.getStudentById(Id);
	}
	
	@RequestMapping(value="/add", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
	public String addStudent(Student student) {
		studentService.addStudent(student);
		return "redirect:/students";
	}
	
	@RequestMapping(value="/update", method= {RequestMethod.POST, RequestMethod.PUT, RequestMethod.GET})
	public String updateStudent(Student student) {
		studentService.updateStudent(student);
		return "redirect:/students";
	}
	
	@RequestMapping(value="/delete", method= {RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.GET})
	public String deleteStudent(Integer Id) {
		studentService.deleteStudent(Id);
		return "redirect:/students";
	}
	
	

}
