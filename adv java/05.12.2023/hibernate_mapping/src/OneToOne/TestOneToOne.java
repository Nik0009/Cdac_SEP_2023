
package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class TestOneToOne {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        Person p=new Person();
        p.setpId(101);
        p.setpName("ramu");
        
        PersonDetail pd=new PersonDetail();
        pd.setdId(11);
        pd.setPhno(55785578);
        pd.setCity("rampur");
        pd.setEmail("ramu@gmail.com");
        
        p.setPersonDetail(pd);
        
        s.save(p);
        tc.commit();
        
        Person p1=(Person)s.get(Person.class, 101);
        System.out.println(p1.getpName());
        System.out.println(p1.getPersonDetail().getCity());
        
        s.close();
        
    }
}
