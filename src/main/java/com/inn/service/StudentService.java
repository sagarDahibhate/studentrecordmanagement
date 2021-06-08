package com.inn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inn.model.Student;
import com.inn.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public Student save(Student student) {
		return repo.save(student);
	}
}
