package com.dac.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dac.aop.dao.EmployeeDao;
import com.dac.aop.dao.StudentDao;

@Component
public class AopRunner implements CommandLineRunner{
	
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	StudentDao studentDao;
	@Override
	public void run(String... args) throws Exception {
		studentDao.saveStudent();
		System.out.println("************************");
		studentDao.deleteStudent();
		System.out.println("************************");
		employeeDao.saveEmployee();
		System.out.println("************************");
		employeeDao.deleteEmployee();
	}

}
