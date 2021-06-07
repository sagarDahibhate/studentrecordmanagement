package com.inn.service;

import java.util.Optional;

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

	public Student getbyId(Integer id) {
		Optional<Student> op = repo.findById(id);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	public String deletebyId(Integer id) {
		repo.deleteById(id);
		return "record deleted successfully";
	}
}
