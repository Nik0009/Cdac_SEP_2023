
package OneToMany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class TestOneToMany {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        College clg=new College();
        clg.setcId(1111);
        clg.setcName("GCOEC");
        
        ColStudent stud1=new ColStudent();
        stud1.setsId(101);
        stud1.setsName("rajesh");
        stud1.setsRollNo(123);
        stud1.setCollege(clg);
        
        ColStudent stud2=new ColStudent();
        stud2.setsId(102);
        stud2.setsName("raju");
        stud2.setsRollNo(456);
        stud2.setCollege(clg);
        
        ColStudent stud3=new ColStudent();
        stud3.setsId(103);
        stud3.setsName("ramesh");
        stud3.setsRollNo(789);
        stud3.setCollege(clg);
        
        List<ColStudent> students=new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        
        clg.setStudents(students);
        
        s.save(clg);
        tc.commit();
        
        College c=(College) s.get(College.class, 1111);
        System.err.println(c.getcName());
        for(ColStudent stud:c.getStudents()){
            System.out.println(stud.getsName());
        }
        
        s.close();
    }
}
