package com.dac.placement.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dac.placement.api.entity.Student;
import com.dac.placement.api.services.StudentService1;

@RestController
public class StudentController {
	
	@Autowired
	StudentService1 studentService1;
//	@RequestMapping(path = "/",method = RequestMethod.GET)
//	@GetMapping("/")
//	public String test() {
//		return "Just Test";
//	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentService1.showAllStudent();
	}
	
	@GetMapping("/students/{sid}")
	public Student getStudent(@PathVariable int sid){
		return studentService1.getStudent(sid);
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student stud) {
		studentService1.addStudent(stud);
	}
	
	@PutMapping("/students/{sid}")
	public void updateStudent(@RequestBody Student stud,@PathVariable int sid) {
		studentService1.update(stud, sid);
	}
	@DeleteMapping("/students/{sid}")
	public void deleteStudent(@PathVariable int sid) {
		studentService1.delete(sid);
	}
}
