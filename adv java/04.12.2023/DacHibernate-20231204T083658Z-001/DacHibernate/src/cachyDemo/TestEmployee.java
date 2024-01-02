package cachyDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestEmployee {
    public static void main(String[] args) {
         AnnotationConfiguration config=new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);
        config.configure("hibernate1.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Session s1=sf.openSession();
        
        Employee emp=(Employee)s.get(Employee.class, 2);
        System.out.println(emp.getEmpName());
        
        Employee emp1=(Employee)s1.get(Employee.class, 2);
        System.out.println(emp1.getEmpName());
        
//        Transaction tc=s.beginTransaction();
//        
//        Employee e1=new Employee();
//        e1.setEmpName("Ramesh");
//        Employee e2=new Employee();
//        e2.setEmpName("Suresh");
//        Employee e3=new Employee();
//        e3.setEmpName("Dinesh");
//        
//        s.save(e1);
//        s.save(e2);
//        s.save(e3);
        
//        tc.commit();
        s.close();
    }
}
