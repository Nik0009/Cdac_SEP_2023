
package Genral_Date_Concepts;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class TestJoinning {
    public static void main(String[] args) {
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tc=s.beginTransaction();
        
        JoinningRecord jr=new JoinningRecord();
        jr.setId(101);
        jr.setJoinningDate(new Date());
        jr.setReportingTime(new Date());
        
        s.save(jr);
        tc.commit();
        s.close();
    }
}
