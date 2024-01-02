package com.dac.placement.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.placement.api.entity.Student;
import com.dac.placement.api.repository.StudentRepository;

@Service
public class StudentService1 {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> showAllStudent(){
		List<Student> lst=(List<Student>)studentRepository.findAll();
		return lst;
	}

	public void addStudent(Student stud) {
		studentRepository.save(stud);
	}

	public Student getStudent(int sid) {
		Student stud=null;
		try {
		stud=studentRepository.findById(sid).get();
		}
		catch(Exception e) {
		
		}
		return stud;
	}

	public void update(Student s,int sid) {
		Student oldStud=studentRepository.findById(sid).get();
		System.out.println(oldStud);
		System.out.println(s);
		System.out.println(sid);
		if(oldStud.getId()==sid) {
		oldStud.setId(sid);
		oldStud.setName(s.getName());
		oldStud.setEmail(s.getEmail());
		oldStud.setCity(s.getCity());
		oldStud.setPassword(s.getPassword());
		studentRepository.save(oldStud);
		}
	}

	public void delete(int sid) {
		studentRepository.deleteById(sid);
	}
}
