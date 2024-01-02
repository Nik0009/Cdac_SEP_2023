package com.dac.aop.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.dac.aop.anntation.MyTx;

@Component
public class StudentDao {
	
	public String saveStudent() {
		System.out.println("Saving the Student");
		return "Cdac";
	}
	
	@MyTx
	public void deleteStudent() {
		System.out.println("Student Deleted...");
	}
}
