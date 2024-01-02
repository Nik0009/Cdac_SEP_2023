
package model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class TestCRUD {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
       // Transaction tc=s.beginTransaction();
        
        Student stud=(Student)s.get(Student.class, new Integer(1));
        
        System.out.println(stud.getName());
//        System.out.println(stud.getEmail());
//        System.out.println(stud.getCity());
//        System.out.println(stud.getId());
        
//        Student stud=(Student) s.load(Student.class,new Integer(1) );
//        stud.setCity("surat");
//        s.update(stud);
//        tc.commit();

//         Student stud=(Student) s.load(Student.class,new Integer(1) );
//         s.delete(stud);
//         tc.commit();
        
//        Query q=s.createQuery("from student");
//        List<Student> lst=q.list();
//        for(Student st:lst){
//            System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity()+" : "+st.getEmail());
//        }
//        
        
        
        
    }
}
