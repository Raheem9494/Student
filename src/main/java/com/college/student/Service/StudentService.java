package com.college.student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.college.student.Entity.Student;
import com.college.student.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository StudentRepo;

	public void save(Student student) {
		StudentRepo.save(student);
	}

	public  List<Student> getAll(){
		return StudentRepo.findAll();
	}
	@GetMapping("/GetBuId")
	public Optional<Student>getById(Integer id){
		return StudentRepo.findById(id);
	}
	
}
