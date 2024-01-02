package inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestInheritance {
    public static void main(String[] args) {
         AnnotationConfiguration config=new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        Task t=new Task();
        t.setTaskName("ArrayList");
        t.setModuleName("Collection");
        t.setProjectName("Java");
        t.setProjectId(101);
        
        Module m=new Module();
        m.setModuleName("Django");
        m.setProjectName("Python");
        m.setProjectId(102);
        
        Project p=new Project();
        p.setProjectId(103);
        p.setProjectName("React");
        
        s.save(p);
        s.save(m);
        s.save(t);
       
        tc.commit();
        s.close();
    }
}
