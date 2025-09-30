package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.school.models.Student;
import com.school.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class SchoolController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)//201
	public Student createUser(@RequestBody Student student) {
		return studentService.save(student);
		
	}
	
		@GetMapping("{/studentId}")
		public Student fetchStudent(@PathVariable Integer studentId) {
			//log.info("UserController::fetchUser",userId);
			return studentService.findByIdStudent(studentId,null);

	
}
}
