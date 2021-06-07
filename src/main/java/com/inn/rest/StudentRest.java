package com.inn.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inn.model.Student;
import com.inn.service.StudentService;

@RestController
@RequestMapping("api/v1")
public class StudentRest {

	@Autowired
	private StudentService service;

	@PostMapping("/add")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		Student newStudent = service.save(student);
		return ResponseEntity.ok(newStudent.toString());
	}
	
	// hello this is commonet
	@GetMapping("/getStudentByid")
	public ResponseEntity<String> getStudent(@RequestParam Integer id){
		Student student=service.getbyId(id);
		if(student==null)
			return  (ResponseEntity<String>) ResponseEntity.notFound();
		else
		return ResponseEntity.ok(student.toString());
	}
}
