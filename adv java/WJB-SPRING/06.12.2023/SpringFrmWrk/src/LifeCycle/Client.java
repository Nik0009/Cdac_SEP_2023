package LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {
        // for executing destroy()
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("LifeCycle/spring.xml");
        ctx.registerShutdownHook(); // for executing destroy()
        LifeCycleDemo lcd=ctx.getBean("life",LifeCycleDemo.class);
        System.out.println(lcd.getX());
    }
}
