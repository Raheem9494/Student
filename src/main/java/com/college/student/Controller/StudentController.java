package com.college.student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.student.Entity.Student;

@RestController
@RequestMapping("/save")
public class StudentController {

	@Autowired
com.college.student.Service.StudentService StudentService;

	@PostMapping("/save")

	public String save(@RequestBody Student student) {
		StudentService.save(student);
		return "saved successfully";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll() {
	 return StudentService.getAll();
	}
	
	@GetMapping("{GetById}")
	
	public Optional<Student>getByStudentId(@PathVariable("Id")Integer studentid){
		return StudentService.getById(studentid);
	}
	
}
