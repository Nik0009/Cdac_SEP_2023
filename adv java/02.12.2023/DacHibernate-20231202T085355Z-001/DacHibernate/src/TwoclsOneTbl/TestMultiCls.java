package TwoclsOneTbl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestMultiCls {
    public static void main(String[] args) {
         AnnotationConfiguration config=new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        SchoolDetails sd=new SchoolDetails(true, "Napur", 5000);
        
        School school=new School();
        school.setName("Modern School");
        school.setSd(sd);
        
        s.save(school);
        tc.commit();
        s.close();
    }
}
