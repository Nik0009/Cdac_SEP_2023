
package multiTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class CustomerTest {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        Customer c=new Customer();
       // c.setId(101);
        c.setName("ramu");
        c.setEmail("ramu@gmail.com");
        c.setMobile("8565545463");
        c.setCity("pune");
        
        s.save(c);
        tc.commit();
        s.close();
        
        
    }
}
