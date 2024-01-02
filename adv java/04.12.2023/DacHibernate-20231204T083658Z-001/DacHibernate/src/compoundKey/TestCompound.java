package compoundKey;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestCompound {
    public static void main(String[] args) {
         AnnotationConfiguration config=new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        CompoundKey saving=new CompoundKey(101, 1001);
        CompoundKey current=new CompoundKey(101, 1002);
        
        Account ac=new Account();
        ac.setCk(saving);
        ac.setUserName("Ramesh");
        
        Account ac1=new Account();
        ac1.setCk(current);
        ac1.setUserName("Ramesh");
        
        s.save(ac);
        s.save(ac1);
        
        tc.commit();
        s.close();
    }
}
