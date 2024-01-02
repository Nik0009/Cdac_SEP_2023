
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class TestStudent {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
       // config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        Student stud=new Student();
        
        stud.setId(101);
        stud.setName("rajesh");
        stud.setEmail("r@gmail.com");
        stud.setCity("pune");
        
         Student stud2=new Student();
        
        stud2.setId(102);
        stud2.setName("rajesh");
        stud2.setEmail("r@gmail.com");
        stud2.setCity("pune");
        
         Student stud3=new Student();
        
        stud3.setId(103);
        stud3.setName("rajesh");
        stud3.setEmail("r@gmail.com");
        stud3.setCity("pune");
        
        s.save(stud);
        s.save(stud2);
        s.save(stud3);
        tc.commit();
        s.close();
    }
}
