package com.dac.aop.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.dac.aop.anntation.MyTx;

@Component
public class EmployeeDao {
	
	public String saveEmployee() {
		System.out.println("Saving the Employee");
//		if(new Random().nextInt(15)>=10) {
//			throw new RuntimeException("Dummy Exception");
//		}
		return "Softpolynomials";
	}
	
	@MyTx
	public void deleteEmployee() {
		System.out.println("Deleting the Employee");
	}
}
