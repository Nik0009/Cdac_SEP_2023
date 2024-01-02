package ManyToMany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class TestManyToMany {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        
        Developer d1=new Developer();
        d1.setdId(101);
        d1.setdName("prakash");
        
        Developer d2=new Developer();
        d2.setdId(102);
        d2.setdName("raju");
        
        List<Developer> developers=new ArrayList<>();
        developers.add(d1);
        developers.add(d2);
        
        
        Project p1=new Project();
        p1.setpID(11);
        p1.setpName("E-com Website");
        
        Project p2=new Project();
        p2.setpID(12);
        p2.setpName("placement portal");
        
        List<Project> projects=new ArrayList<>();
        
        projects.add(p1);
        projects.add(p2);
        
        d1.setProjects(projects);
        p1.setDevelopers(developers);
        
        
        s.save(d1);
        s.save(d2);
        s.save(p1);
        s.save(p2);
        
        tc.commit();
        s.close();
      
    }
    
}
