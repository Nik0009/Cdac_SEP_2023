
package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerClient {
    public static void main(String[] args) {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("constructorInjection/spring.xml");
       Customer c=ctx.getBean("cust",Customer.class); 
       System.out.println(c);
    }
}
