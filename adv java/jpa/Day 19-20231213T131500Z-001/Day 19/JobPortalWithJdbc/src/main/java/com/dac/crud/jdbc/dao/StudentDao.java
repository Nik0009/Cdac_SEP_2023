package com.dac.crud.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dac.crud.jdbc.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String showAllStudent = "Select * from Student";
	private String showStudent = "Select * from Student where id=?";
	private String insertStudent = "Insert into Student(name,email,city,password) values(?,?,?,?)";
	private String deleteStudent = "Delete from Student where id=?";
	private String updateStudent = "Update Student set name=?,email=?,city=?,password=? where id=?";

	public StudentDao() {
		super();
	}

	public Student showStudent(int sid) {
		Student stud=jdbcTemplate.queryForObject(showStudent, new RowMapperImpl(),sid);
		return stud;
	}

	public List<Student> showAllStudent() {
		List<Student> studs=jdbcTemplate.query(showAllStudent, new RowMapperImpl());
		return studs;
	}

	public void addStudent(Student stud) {
		int insertedRecord = jdbcTemplate.update(insertStudent, stud.getName(), stud.getEmail(), stud.getCity(),
				stud.getPassword());
		if (insertedRecord > 0)
			System.out.println("Record Inserted");
	}

	public void update(Student s, int id) {
		int updateRecord = jdbcTemplate.update(updateStudent, s.getName(), s.getEmail(), s.getCity(), s.getPassword(),
				id);
		if (updateRecord > 0)
			System.out.println("Record updated Successfully");
	}

	public void delete(int sid) {
		int deletedRecord = jdbcTemplate.update(deleteStudent, sid);
		if (deletedRecord > 0)
			System.out.println("Record deleted Successfully");
	}
}
