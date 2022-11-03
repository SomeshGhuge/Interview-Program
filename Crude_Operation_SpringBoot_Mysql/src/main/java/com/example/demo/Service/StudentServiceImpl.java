package com.example.demo.Service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.controller.StudentController;
import com.example.demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentrepository;
	private static final Logger LOGGER=LoggerFactory.getLogger(StudentController.class);
	
	
	
	@Override
	public Student saveStudent(Student student) {
		return studentrepository.save(student);
	}

	@Override
	public Student getEmployeeById(Integer Id) {
		Student student=studentrepository.findById(Id);
		return student;
	}
	
	@Override
	public void deletStudent(Integer id) {
		studentrepository.deleteById(id);
	}

@Override
	public Student updateStudentById( Integer id, Student student) {
		Student studentt=null;
		
		// this info is not printed
		LOGGER.info("Somyaaaa Ghugeeeeeeee  ");
		
		
		if(studentrepository.existsById(id)) {
			studentt=studentrepository.findById(id);
			studentt.setFirstname(student.getFirstname());
			studentt.setLastname(student.getLastname());
			studentt.setScore(student.getScore());
			studentrepository.save(studentt);
	
		}else {
			studentrepository.save(student);
		}
		return studentt;
	}   

}
