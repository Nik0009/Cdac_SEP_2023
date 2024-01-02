package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestStudent {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        Student stud=new Student();
//        stud.setId(101);
        stud.setName("Suresh");
        stud.setEmail("suresh@gmail.com");
        stud.setCity("Solapur");
        Student stud1=new Student();
//        stud.setId(101);
        stud1.setName("Dinesh");
        stud1.setEmail("dinesh@gmail.com");
        stud1.setCity("Durgapur");
        Student stud2=new Student();
//        stud.setId(101);
        stud2.setName("Bhavesh");
        stud2.setEmail("bhavesh@gmail.com");
        stud2.setCity("Bilaspur");
        
        s.save(stud);//create a batch file
        s.save(stud1);//create a batch file
        s.save(stud2);//create a batch file
        
        tc.commit();//data changes
        s.close();
    }
}
