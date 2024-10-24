package com.college.student.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.student.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	Optional<Student> findById(Student student);

}
