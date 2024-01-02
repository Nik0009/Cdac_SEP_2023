package com.dac.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dac.jpa.entity.Employee;
import com.dac.jpa.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootJpaWithoutMvcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootJpaWithoutMvcApplication.class, args);
		EmployeeRepository repository=ctx.getBean(EmployeeRepository.class);
	
//		Employee emp=new Employee("Mahesh", "Account", 46999);
//		Employee emp1=new Employee("Dinesh", "Marketing", 20999);
//		Employee emp2=new Employee("Bhavesh", "Backoffice", 16999);
//		Employee emp3=new Employee("Ganesh", "Account", 36999);
//		List<Employee> lst=List.of(emp, emp1, emp2, emp3);
//		Iterable<Employee> lst1=repository.saveAll(lst);
//		System.out.println(lst1);
		
		//Fetch single record
//		Employee emp=repository.findById(53).get();
//		System.out.println(emp);
		
		//Fetch All Records
//		Iterable<Employee> lst=repository.findAll();
//		for(Employee e:lst) {
//			System.out.println(e);
//		}
		
		//Delete single record
//		repository.deleteById(54);
		
		//Update Record
//		Employee emp=repository.findById(55).get();
//		emp.setEmpDeprt("Front Office");
//		Employee e=repository.save(emp);
//		System.out.println(e);
		
//		List<Employee> emp=repository.findByEmpName("Ramesh");
//		emp.forEach(e->System.out.println(e));
		
//		List<Employee> emp=repository.findByEmpSalaryGreaterThan(30000);
//		emp.forEach(e->System.out.println(e));
		
//		List<Employee> emp=repository.findByEmpNameOrEmpDeprt("Ramesh", "Account");
//		emp.forEach(e->System.out.println(e));
//		
//		List<Employee> emp=repository.findAllEmployee();
//		emp.forEach(e->System.out.println(e));
		
		repository.updateEmpSalaryByEmpId(55000, 1);
		
	}

}
