
package collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpClient {
    public static void main(String[] args) {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("collectionInjection/spring.xml");
       Employee e=ctx.getBean("emp",Employee.class);
       System.out.println(e);
    }
}
