package ManyToMany;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Developer {
    @Id
    private int dId;
    private String dName;
    
    @ManyToMany
    @JoinTable(name="Dev_pro",joinColumns = {@JoinColumn(name="dId")},inverseJoinColumns={@JoinColumn(name="pId")} )
    private List<Project> projects;

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    
}
