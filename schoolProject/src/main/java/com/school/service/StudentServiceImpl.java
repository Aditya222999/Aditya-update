package com.school.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.models.Student;
import com.school.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    
	@Autowired
	 private StudentRepository studentRepository;

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student findByIdStudent(Integer studentId, Student student) {
		Optional<Student> optional = studentRepository.findById(studentId);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new RuntimeException("student Not Found In DB");
		}	
	}

	@Override
	public Student update(Integer student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBy(Integer student) {
		// TODO Auto-generated method stub
		
	}
	
	
}
