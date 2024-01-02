
package Genral_Date_Concepts;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class JoinningRecord {
    
    @Id
    private int id;
    
//    @Lob
//    private byte img[];
    
    @Temporal(TemporalType.DATE)
    private Date joinningDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date reportingTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getJoinningDate() {
        return joinningDate;
    }

    public void setJoinningDate(Date joinningDate) {
        this.joinningDate = joinningDate;
    }

    public Date getReportingTime() {
        return reportingTime;
    }

    public void setReportingTime(Date reportingTime) {
        this.reportingTime = reportingTime;
    }
    
    
    
    
    
}
