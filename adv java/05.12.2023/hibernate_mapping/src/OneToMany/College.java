
package OneToMany;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
    
    @Id
    private int cId;
    private String cName;
    
    @OneToMany(mappedBy="college",cascade=CascadeType.ALL,fetch = FetchType.EAGER)
    private List<ColStudent> students;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public List<ColStudent> getStudents() {
        return students;
    }

    public void setStudents(List<ColStudent> students) {
        this.students = students;
    }
    
    
    
}
