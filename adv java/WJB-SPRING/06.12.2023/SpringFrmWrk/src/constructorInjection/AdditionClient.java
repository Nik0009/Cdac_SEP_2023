
package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AdditionClient {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("constructorInjection/spring.xml");
        Addition a=ctx.getBean("add",Addition.class);
        System.out.println(a);
        
    }
}
