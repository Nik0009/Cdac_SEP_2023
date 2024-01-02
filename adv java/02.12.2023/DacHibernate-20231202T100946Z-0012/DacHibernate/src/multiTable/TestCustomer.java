package multiTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestCustomer {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        Customer c=new Customer();
        c.setId(101);
        c.setName("Suresh");
        c.setPhNo("9088772233");
        c.setCity("Rampur");
        c.setEmail("suresh@gamail.com");
        
        s.save(c);
        tc.commit();
        s.close();
    }
}
