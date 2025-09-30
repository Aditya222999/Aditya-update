package com.school.service;

import com.school.models.Student;

public interface StudentService {
	
	Student save (Student student);
	Student findByIdStudent(Integer studentId,Student student);
	Student update (Integer student);
	void deleteBy (Integer student);
	

}
