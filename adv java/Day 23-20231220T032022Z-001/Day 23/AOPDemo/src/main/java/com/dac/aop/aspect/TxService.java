package com.dac.aop.aspect;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TxService {
	
//	@Pointcut("execution(public void com.dac.aop.dao.EmployeeDao.saveEmployee())")
	@Pointcut("execution(* com.dac.aop.dao.*.*())")
	public void pc1() {}
	
	@Pointcut("execution(* com.dac.aop.dao.EmployeeDao.*())")
	public void pc2() {}
	
	@Pointcut("@annotation(com.dac.aop.anntation.MyTx)")
	public void pc3() {}
	
	@Before("pc1()")
	public void beginTx() {
		System.out.println("Transaction Started");
	}
	
	@After("pc2()")
	public void reportGen() {
		System.out.println("Report Genrated...");
	}
	
	@AfterReturning(value = "pc1()",returning = "inst")
	public void stopTx(Object inst) {
		System.out.println("Transaction Committed "+inst);
	}
	
	@AfterThrowing(value = "pc1()",throwing = "ex")
	public void rollback(Throwable ex) {
		System.out.println("Transaction rolled back "+ex.getMessage());
	}
	
	@Before("pc3()")
	public void beforeDelete() {
		System.out.println("Before Deletion....");
	}
}
