package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {
    public static void main(String[] args) {
     // tight coupling
//        Student stud=new Student();
//        stud.setsID(101);
//        stud.setsName("ramu");
//        System.out.println(stud);


       // loosly coupled
//       ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml"); // .xml file in other package
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("basic/spring.xml"); // .xml file in same package
//        Student s=(Student) ctx.getBean("stud");
//        System.out.println(s);
        
        
        // second example
        ApplicationContext ctx=new ClassPathXmlApplicationContext("basic/spring.xml"); // .xml file in same package
        Student1 s1=(Student1) ctx.getBean("stud1");
        System.out.println(s1);
    }
}
